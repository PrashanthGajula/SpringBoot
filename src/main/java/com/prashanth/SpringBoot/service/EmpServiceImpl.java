package com.prashanth.SpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prashanth.SpringBoot.dao.MyDaoRepo;
import com.prashanth.SpringBoot.model.Employee;

/**
 * Description.
 * @author INSERT USERNAME
 */
@Service
public class EmpServiceImpl implements EmpService
{
    /**
     * The empDao.
     */
    @Autowired
    MyDaoRepo empDao;

    @Override
    public List<Employee> getEmployees()
    {
        return empDao.findAll();
    }

    @Override
    public Optional<Employee> findById(final Integer id)
    {
        return empDao.findById(id);
    }

}
