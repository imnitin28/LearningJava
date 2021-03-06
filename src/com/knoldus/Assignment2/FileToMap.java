package com.knoldus.Assignment2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

class FileToMap {
	
    final static String filePath = "/home/knoldus/Desktop/KUP/Java8_Features/InternToExpert/LearningJava/src/com/knoldus/learning/Database/EmployeeData.csv";

    public static void main(String[] args) throws IOException {
		Map<String, String> mapFromFile = HashMapFromTextFile();
		mapFromFile.forEach((key,value)->{
			System.out.println(key+ " " +value);
		});
	}

//	public static Map<String, String> HashMapFromTextFile()
//	{
//
//		Map<String, String> map = new HashMap<String, String>();
//		BufferedReader br = null;
//
//		try {
//            File file = new File(filePath);
//            br = new BufferedReader(new FileReader(file));
//            String line = null;
//
//			while ((line = br.readLine()) != null) {
//
//				String[] parts = line.split(" ");
//
//                for(String word : parts)
//                {
//                    if(map.containsKey(word))
//                        map.put(word, Integer.toString((Integer.parseInt(map.get(word)) + 1)));
//                    else
//                        map.put(word, "1");
//                }
//                //
//				//Arrays.stream(parts).distinct().map(line.split(" ")));
//				//
//			}
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			if (br != null) {
//				try {
//					br.close();
//				}
//				catch (Exception e) {
//				};
//			}
//		}
//		return map;
//	}
	public static Map<String,String> HashMapFromTextFile() throws IOException {
		String delimiter = "";
		Map<String, String> map = new HashMap<>();

		try(Stream<String> lines = Files.lines(Paths.get("/home/knoldus/Desktop/KUP/Java8_Features/InternToExpert/LearningJava/src/com/knoldus/learning/Database/EmployeeData.csv"))){
			lines.filter(line -> line.contains(delimiter)).forEach(
					line -> map.putIfAbsent(line.split(delimiter)[0], (line.split(delimiter)[1]))
			);
		}
		return map;
	}
}
