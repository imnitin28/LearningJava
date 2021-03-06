package com.knoldus.Assignment2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFileToString
{
    public static void main(String[] args)
    {
        String filePath = "/home/knoldus/Desktop/KUP/Java8_Features/InternToExpert/LearningJava/src/com/knoldus/learning/Database/EmployeeData.csv";

//        String content = readLineByLineJava8( filePath );
//        System.out.println(content.lines().findFirst());
        //Map<String,String> mapFromFile = HashM
    }
//    private static String readLineByLineJava8(String filePath)
//    {
//        StringBuilder contentBuilder = new StringBuilder();
//        Map<String, Integer> map = new HashMap<>();
//        try (Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8))
//        {
//            stream.forEach(s -> contentBuilder.append(s).append("\n"));
//           // stream.forEach(s -> contentBuilder.append(map.put(s,map.get(s))));
//
//        }
//        catch (IOException e)
//        {
//            e.printStackTrace();
//        }
//        //System.out.println(map);
//        return contentBuilder.toString();
//    }
}