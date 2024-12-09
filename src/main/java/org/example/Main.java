package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println(" Введите количество баллов (от 0 до 100) и мы выведем соответствующую оценку:  ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 101 & a>90 ){
            System.out.println("Оценка А");
        }else if (a > 80 & a < 90){
            System.out.println("Оценка B");
        }else if (a > 70 & a < 79) {
            System.out.println("Оценка C");
        }else if (a > 60 & a < 69) {
            System.out.println("Оценка D");
        }else if (a < 59){
            System.out.println("Оценка F");
        }
    }
}
