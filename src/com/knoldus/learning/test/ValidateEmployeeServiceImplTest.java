package com.knoldus.learning.test;

import com.knoldus.learning.entity.Employee;
import com.knoldus.learning.service.ValidateEmployeeServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class ValidateEmployeeServiceImplTest {
    @Test
    public void validateEmployee() {
        ValidateEmployeeServiceImpl validateEmployeeService = new ValidateEmployeeServiceImpl();

        Employee employee1 = new Employee(1, "Nitin");
        Assert.assertEquals(validateEmployeeService.validateEmployee(employee1), true);

        Employee employee2 = new Employee(3, "Shivani");
        Assert.assertEquals(validateEmployeeService.validateEmployee(employee2), true);

        Employee employee3 = new Employee(-1, "Nitin");
        Assert.assertEquals(validateEmployeeService.validateEmployee(employee3), false);

        Employee employee4 = new Employee(1, "");
        Assert.assertEquals(validateEmployeeService.validateEmployee(employee4), false);

        Employee employee5 = new Employee(11, "Vikas");
        Assert.assertEquals(validateEmployeeService.validateEmployee(employee5), true);

        Employee employee6 = new Employee(-19, "Sahil");
        Assert.assertEquals(validateEmployeeService.validateEmployee(employee6), false);
    }
}
