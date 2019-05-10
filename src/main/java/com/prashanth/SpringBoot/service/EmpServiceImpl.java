package com.prashanth.SpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prashanth.SpringBoot.dao.MyDaoRepo;
import com.prashanth.SpringBoot.model.Employee;

@Service
public class EmpServiceImpl implements EmpService
{
    @Autowired
    MyDaoRepo empDao;

    @Override
    public List<Employee> getEmployees()
    {
        return empDao.findAll();
    }



}
