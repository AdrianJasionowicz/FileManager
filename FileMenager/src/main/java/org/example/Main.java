package org.example;

import java.io.File;
import java.util.Scanner;

import org.example.FileManager;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe uzytkownika ");
        String id = scanner.nextLine();
        System.out.println(id);
        fileManager.sortFilesInDirectory("/Users/KKKOP/documents");
    }
}