package com.prashanth.SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prashanth.SpringBoot.model.Employee;
import com.prashanth.SpringBoot.service.EmpService;

/**
 * Description.
 * @author INSERT USERNAME
 */

@RestController
public class Controller
{

    @Autowired
    EmpService empService;

    @RequestMapping(value = "/employee/all", method = RequestMethod.GET)
    public List<Employee> getEmployees()
    {
        System.out.println(this.getClass().getSimpleName() + " - Get all employees service is invoked");
        return empService.getEmployees();
    }

    /**
     * @return
     */
    @RequestMapping("/hello")
    public String hello()
    {
        return "Hello, Prashanth";
    }

}
