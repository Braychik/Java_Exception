package org.example.sem_3.homework.controller;

import org.example.sem_3.homework.modul.NoFolder;
import org.example.sem_3.homework.modul.User;

public interface SaveUserInter {
    String saveUser(User user) throws NoFolder;
}
