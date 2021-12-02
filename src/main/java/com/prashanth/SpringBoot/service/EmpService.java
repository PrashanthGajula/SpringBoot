package com.prashanth.SpringBoot.service;

import java.util.List;
import java.util.Optional;

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

    /**
     * @param id
     *            emp id
     * @return employee
     */
    public Optional<Employee> findById(final Integer id);
}
