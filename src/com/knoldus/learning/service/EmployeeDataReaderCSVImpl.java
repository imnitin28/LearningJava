package com.knoldus.learning.service;

import com.knoldus.learning.entity.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDataReaderCSVImpl implements EmployeeDataReader{
    @Override
    public List<Employee> readEmployeeDataFromCSV() throws FileNotFoundException {
        String line = "";
        String splitBy = ",";
        ValidateEmployeeService validateEmployeeService = new ValidateEmployeeServiceImpl();
        SaveEmployeeService saveEmployeeService = new SaveEnployeeServiceImpl();
        List<Employee> emplList = new ArrayList<>();
        try
        {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/knoldus/Desktop/KUP/LearningJava/src/com/knoldus/learning/Database/EmployeeData.csv"));
            while((line = bufferedReader.readLine())!=null)
            {
                String[] employeeDatacsv = line.split(splitBy);
                Employee employee = new Employee(Integer.parseInt(employeeDatacsv[0]) , employeeDatacsv[1]);
                emplList.add(employee);
            }
        }
        catch(IOException ioException)
        {
            ioException.printStackTrace();
        }
        return emplList;
    }
}