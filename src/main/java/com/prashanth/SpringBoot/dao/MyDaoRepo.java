package com.prashanth.SpringBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prashanth.SpringBoot.model.Employee;

/**
 * Description.
 * @author INSERT USERNAME
 */
@Repository
public interface MyDaoRepo extends JpaRepository<Employee, Integer>
{

    // Un comment the below code to get the employee details, with out the DB connection
    // /**
    // * The employeeList.
    // */
    // HashMap<Integer, Employee> employeeList = new HashMap<>();
    //
    // /**
    // * @return list of employees
    // */
    // @Override
    // public default List<Employee> findAll()
    // {
    // final Employee e1 = new Employee();
    // e1.setId(1);
    // e1.setfName("Prashanth");
    // e1.setlName("Gajula");
    // e1.setAge(28);
    // e1.setEmail("pgajula@gmail.com");
    //
    // final Employee e2 = new Employee();
    // e2.setId(2);
    // e2.setfName("Hari");
    // e2.setlName("Chundi");
    // e2.setAge(26);
    // e2.setEmail("hchundi@gmail.com");
    //
    // employeeList.put(e1.getId(), e1);
    // employeeList.put(e2.getId(), e2);
    //
    // return new ArrayList<>(employeeList.values());
    // }
    //
    // @Override
    // default Optional<Employee> findById(final Integer id)
    // {
    // if (employeeList.containsKey(id))
    // {
    // return Optional.of(employeeList.get(id));
    // }
    // return null;
    // }
}
