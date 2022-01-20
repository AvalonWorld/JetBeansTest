package com.test;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");

        Scanner scan = new Scanner(System.in);
        System.out.print("Index: " );
        int value = scan.nextInt();
        System.out.println("You Picked: "  + list.get(value));


    }
}