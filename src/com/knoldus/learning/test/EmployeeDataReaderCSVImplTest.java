package com.knoldus.learning.test;

import com.knoldus.learning.entity.Employee;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeDataReaderCSVImplTest {
    @Test
    public void getId() {
        Employee employee = new Employee(1,"Nitin");
        Assert.assertEquals(employee.getId(), 1);

        Employee employee1 = new Employee(2,"Mohit");
        Assert.assertEquals(employee1.getId(), 2);

        Employee employee2 = new Employee(3,"Shivani");
        Assert.assertEquals(employee2.getId(), 3);
    }
    @Test
    public void getName() {
        Employee employee = new Employee(1,"Nitin");
        Assert.assertEquals(employee.getName(), "Nitin");

        Employee employee1 = new Employee(2,"Mohit");
        Assert.assertEquals(employee1.getName(), "Mohit");

        Employee employee2 = new Employee(3,"Shivani");
        Assert.assertEquals(employee2.getName(), "Shivani");
    }

}
