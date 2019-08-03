package com.prashanth.SpringBoot.service;

import java.util.List;
import com.prashanth.SpringBoot.model.Employee;

/**
 * Description.
 * @author INSERT USERNAME
 */
public interface EmpService
{
    /**
     * @return list of employees
     */
    public List<Employee> getEmployees();
}
