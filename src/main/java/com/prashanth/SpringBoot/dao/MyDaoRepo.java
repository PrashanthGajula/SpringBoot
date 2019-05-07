package com.prashanth.SpringBoot.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.prashanth.SpringBoot.model.Employee;

public class MyDaoRepo
{

    private static final HashMap<Integer, Employee> employeeList = new HashMap<>();
    private static Integer counter = 1;


    @SuppressWarnings("javadoc")
    public List<Employee> getEmployees(){
        final Employee e1 = new Employee();
        e1.setId(1);
        e1.setfName("Prashanth");
        e1.setlName("Gajula");
        e1.setAge(28);
        e1.setEmail("pgajula@gmail.com");

        final Employee e2 = new Employee();
        e2.setId(2);
        e2.setfName("Hari");
        e2.setlName("Chundi");
        e2.setAge(26);
        e2.setEmail("hchundi@gmail.com");

        employeeList.put(counter++, e1);
        employeeList.put(counter++, e2);

        return new ArrayList<>(employeeList.values());
    }




}
