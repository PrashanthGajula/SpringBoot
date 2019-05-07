package com.prashanth.SpringBoot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.prashanth.SpringBoot.dao.MyDaoRepo;
import com.prashanth.SpringBoot.model.Employee;

@Service
public class EmpServiceImpl implements EmpService
{

    @Override
    public List<Employee> getEmployees()
    {
        final MyDaoRepo empDao = new MyDaoRepo();

        // TODO Auto-generated method stub
        return empDao.getEmployees();
    }

}
