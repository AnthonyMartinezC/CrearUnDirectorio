package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.nio.file.Files.createDirectory;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        createDirectory("./src/test-octubre");

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



}