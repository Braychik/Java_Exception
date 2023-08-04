package org.example.sem_3.homework.modul;

import java.io.IOException;

public class NoFolder extends IOException {
    public NoFolder(){
        super("Папки 'data' небыло, я ее уже создал, повторите операцию.");
    }
}
