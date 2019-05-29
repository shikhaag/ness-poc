package com.springrestapi.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

@Service
public class SpringRestApiServiceImpl implements SpringRestApiService {
  private static final AtomicInteger counter = new AtomicInteger();
  private static List<Employee> empl= new ArrayList<>();

  @Override
  public Employee getEmployee(int i) {
    System.out.println("Employee get on basis of Index");
    return empl.get(i);
  }

  static{
    empl= populateDummyUsers();
  }

  @Override
  public void removeEmployee(int employeeId) {


      for (Iterator<Employee> iterator = empl.iterator(); iterator.hasNext(); ) {
        Employee user = iterator.next();
        if (user.getId() == employeeId) {
          iterator.remove();
        }
      }
    }

  public void updateUser(Employee e) {
    int index = empl.indexOf(e);
    empl.set(index, e);
  }
  @Override
  public List<Employee> getAllEmpyoee() {
    System.out.println("All Employees ");
    return empl;
  }

  @Override
  public void addEmployee(Employee e) {
  empl.add(e);
    System.out.println("Added Employee ");
  }

  @Override
  public Employee findById(int id) {
    for(Employee user : empl){
      if(user.getId() == id){
        return user;
      }
    }
    return null;
  }

  public void deleteAllUsers(){
    empl.clear();
  }

  private static List<Employee> populateDummyUsers(){
    List<Employee> empl = new ArrayList<Employee>();
    empl.add(new Employee(counter.incrementAndGet(),"Sam","Curane", "London England"));
    empl.add(new Employee(counter.incrementAndGet(),"Tom","Jimmy", "US Chicago"));
    empl.add(new Employee(counter.incrementAndGet(),"Jerome","Lol", "Berlin Germany"));
    empl.add(new Employee(counter.incrementAndGet(),"Silvia","AWS", "Mumbai India"));
    return empl;
  }
}
