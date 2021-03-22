package com.knoldus.learning.test;

import com.knoldus.learning.service.SaveEnployeeServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class SaveEmployeeServiceImplTest {
    @Test
    public void getEmployeeCount() {
        SaveEnployeeServiceImpl saveEmployeeService = new SaveEnployeeServiceImpl();
        Assert.assertEquals(saveEmployeeService.getEmployeeCount(), 0);
    }
}
