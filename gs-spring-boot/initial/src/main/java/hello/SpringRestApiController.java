package com.springrestapi.controller;

import java.util.List;

import com.springrestapi.service.CustomErrorType;
import com.springrestapi.service.Employee;
import com.springrestapi.service.SpringRestApiService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
@RequestMapping("/api")
public class SpringRestApiController {
  public static final Logger logger = LoggerFactory.getLogger(SpringRestApiController.class);

  @Autowired(required = true)
  private SpringRestApiService service;


  @RequestMapping(value = "/users/", method = RequestMethod.GET)
  public ResponseEntity<List<Employee>> listAllUsers() {
    List<Employee> users = service.getAllEmpyoee();
    if (users.isEmpty()) {
      return new ResponseEntity<>(HttpStatus.NO_CONTENT.NO_CONTENT);
      // You many decide to return HttpStatus.NOT_FOUND
    }
    return new ResponseEntity<List<Employee>>(users, HttpStatus.OK);
  }



  @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
  public ResponseEntity<Employee> getUser(@PathVariable("id") int id) {
    logger.info("Fetching User with id {}", id);
    Employee user = service.getEmployee(id);
    if (user == null) {
      logger.error("User with id {} not found.", id);
      return new ResponseEntity(new CustomErrorType("User with id " + id
          + " not found"), HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<Employee>(user, HttpStatus.OK);
  }


  @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
  public ResponseEntity<?> deleteUser(@PathVariable("id") int id) {
    logger.info("Fetching & Deleting User with id {}", id);

    Employee user = service.getEmployee(id);
    if (user == null) {
      logger.error("Unable to delete. User with id {} not found.", id);
      return new ResponseEntity(new CustomErrorType("Unable to delete. User with id " + id + " not found."),
          HttpStatus.NOT_FOUND);
    }
    service.removeEmployee(id);
    return new ResponseEntity<Employee>(HttpStatus.NO_CONTENT);
  }

  @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
  public ResponseEntity<?> updateUser(@PathVariable("id") int id, @RequestBody Employee user) {
    logger.info("Updating User with id {}", id);

    Employee currentEmployee = service.findById(id);

    if (currentEmployee == null) {
      logger.error("Unable to update. User with id {} not found.", id);
      return new ResponseEntity(new CustomErrorType("Unable to upate. User with id " + id + " not found."),
          HttpStatus.NOT_FOUND);
    }

    currentEmployee.setFname(user.getFname());
    currentEmployee.setLname(user.getLname());
    currentEmployee.setAddess(user.getAddess());

    service.updateUser(currentEmployee);
    return new ResponseEntity<Employee>(currentEmployee, HttpStatus.OK);
  }


  @RequestMapping(value = "/deleteAll/", method = RequestMethod.DELETE)
  public ResponseEntity<Employee> deleteAllUsers() {
    logger.info("Deleting All Users");

    service.deleteAllUsers();
    return new ResponseEntity<Employee>(HttpStatus.NO_CONTENT);
  }

}
