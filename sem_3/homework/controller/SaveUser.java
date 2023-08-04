package org.example.sem_3.homework.controller;

import org.example.sem_3.homework.modul.NoFolder;
import org.example.sem_3.homework.modul.User;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.APPEND;

public class SaveUser implements SaveUserInter{
    @Override
    public String saveUser(User user) throws NoFolder {
        String str = user.toString() + "\n";
        String path = "C:\\ProjectsJava\\isklucheniy\\src\\main\\" +
                "java\\org\\example\\homeWork\\lesson3\\data\\" + user.getname() + ".txt";
        if (!checkFile(path)){
            File f = new File(path);
            try {
                f.createNewFile();
            } catch (IOException e){
                new File("C:\\ProjectsJava\\isklucheniy\\src\\main\\" +
                        "java\\org\\example\\homeWork\\lesson3\\data").mkdirs();
                throw new NoFolder();

            }
            if (f.exists()){
                try {
                    Files.write(Paths.get(path), str.getBytes(), APPEND);
                } catch (IOException e){
                    System.out.println(e.getMessage());
                    System.out.println("2");
                }
            }
        } else {
            try {
                Files.write(Paths.get(path), str.getBytes(), APPEND);
            } catch (IOException e){
                System.out.println(e.getMessage());
                System.out.println("3");
            }
        }
        return "готово!";
    }

    private boolean checkFile(String nameFile) {
        File f = new File(nameFile);
        if (f.exists()){
            return true;
        }
        return false;
    }
}
