package com.springrestapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface SpringRestApiService {


  public Employee getEmployee(int i);

  public void removeEmployee(int employeeId);
  public List<Employee> getAllEmpyoee();
  public void addEmployee(Employee e);
  public Employee findById(int id);
  public void updateUser(Employee e);
  public void deleteAllUsers();

}
