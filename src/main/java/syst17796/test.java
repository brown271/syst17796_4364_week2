/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syst17796;

import java.util.Scanner;

/**
 *
 * @author alex
 */
public class test {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
//        System.out.print("Please enter your name: ");
//        String name = in.nextLine();
//        char[] nameLetters = new char[name.length()];
//        for (int i = 0; i <name.length(); i++) {
//        nameLetters[i] = name.charAt(i);
//       }
//        System.out.println("Your name backwards is: ");
//        for (int i = name.length()-1; i >= 0; i--) {
//            System.out.print(nameLetters[i]);  
//       }
    Student[] s = new Student[5];
        for (int i = 0; i < 5; i++) {
            s[i] = new Student();
        }
        int curInt;
        String curString;
        for (Student x : s) {
            System.out.print("Enter the Student ID: ");
            x.setId(Integer.parseInt(in.nextLine()));
            System.out.print("Enter the Student Name: ");
            x.setName(in.nextLine());
            System.out.print("Enter the Student Program Name: ");
            x.setProgramName(in.nextLine());
            System.out.println("Created a new Student");
            System.out.println(x);
        }
   } 
    
}
