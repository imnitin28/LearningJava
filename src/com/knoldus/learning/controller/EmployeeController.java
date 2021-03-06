package com.knoldus.learning.controller;

import com.knoldus.learning.entity.Employee;
import com.knoldus.learning.service.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeController {

    public static void main(String[] a) throws FileNotFoundException {
        ValidateEmployeeService validateEmployeeService = new ValidateEmployeeServiceImpl();
        SaveEmployeeService saveEmployeeService = new SaveEnployeeServiceImpl();

        EmployeeDataReader employeeDataReader = new EmployeeDataReaderCSVImpl();
        List<Employee> emplList = employeeDataReader.readEmployeeDataFromCSV();

        System.out.println("Total employee size  :  "+emplList.size());

        for (Employee e : emplList) {
            if(validateEmployeeService.validateEmployee(e))
                saveEmployeeService.saveEmployee(e);
        }
        System.out.println("Saved employee  : " + saveEmployeeService.getEmployeeCount());
        System.out.println("Total Invalid Employees  : " + (emplList.size() - saveEmployeeService.getEmployeeCount()));
    }
}
