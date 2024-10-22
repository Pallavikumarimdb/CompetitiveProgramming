//Pattern-2: Right-Angled Triangle Pattern
//Problem Statement: Given an integer N, print the following pattern :
//*
//* *
//* * *
//* * * *
//* * * * *
//* * * * * *


import java.util.Scanner;

public class _02_PatternPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        pattern1(a);
    }

    public static void pattern1(int a){
        for (int i = 1; i <=a; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
