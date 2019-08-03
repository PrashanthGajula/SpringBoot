package com.prashanth.SpringBoot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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

    /**
     * The empService.
     */
    @Autowired
    EmpService empService;

    /**
     * @return all employees in the db
     */
    @RequestMapping(value = "/employee/all", method = RequestMethod.GET)
    public List<Employee> getEmployees()
    {
        System.out.println(this.getClass().getSimpleName() + " - Get all employees service is invoked");
        return empService.getEmployees();
    }

    /**
     * @param id
     *            employee id
     * @return return an employee with matching id
     * @throws Exception
     *             exception
     */
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public Employee getEmployeeById(@PathVariable(name = "id") final int id) throws Exception
    {
        System.out.println("Get employee by Id invoked");
        final Optional<Employee> emp = empService.findById(id);
        if (!emp.isPresent())
        {
            throw new Exception("Could not find employee with Id :" + id);
        }
        return emp.get();
    }

    /**
     * @return a message
     */
    @RequestMapping("/hello")
    public String hello()
    {
        return "Hello, Prashanth";
    }

}
