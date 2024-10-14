package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.nio.file.Files.createDirectory;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        //createDirectory("./src/test-octubre");

        //createFileWithText();

        readTextFileSequentially();

    }

    public static void createDirectory(String dirName) {
        Path path = Paths.get(dirName);
        try{
            Files.createDirectory(path);
            System.out.println("Directory created: " + path.toAbsolutePath());
            logger.log(Level.INFO,"Directory created:" + path.toAbsolutePath());



        } catch (IOException e) {
            System.err.println("Failed to create directory:" + e.getMessage());
        }





    }
    public static void createFileWithText(){
        Path path = Paths.get("./src/test-octubre/test.txt");

        try{
            Files.write(path,"Utad mola pero ADAT no tanto jeje.".getBytes());
        }catch(IOException e){
            System.err.println("Failed to create file:" + e.getMessage());

        }
    }
    private static void readTextFileSequentially(){
        Path path = Paths.get("./src/test-octubre/test.txt");
        try{
            List<String> lines = Files.readAllLines(path);
            for(String line : lines){
                System.out.println(line);
            }
        }catch (IOException e){
            System.err.println("Failed to read file: " + e.getMessage());
        }
    }

}