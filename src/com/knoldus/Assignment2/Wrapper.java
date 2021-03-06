package com.knoldus.Assignment2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class Wrapper{
    public static void main(String[] args) throws IOException {
        //var name = new HashMap<String,String>();
        String delimiter = ", ";
        Map<String, String> map = new HashMap<>();

        try(Stream<String> lines = Files.lines(Paths.get("/home/knoldus/Desktop/KUP/Java8_Features/InternToExpert/LearningJava/src/com/knoldus/learning/Database/EmployeeData.csv"))){
            lines.filter(line -> line.contains(delimiter)).forEach(
                    line -> map.putIfAbsent((line.split(delimiter)[1]),line.split(delimiter)[0])
            );
        }
//        map.forEach((key,value)->{
//            System.out.println(key+ " " +value);
//        });
        System.out.println(map);
    }
}