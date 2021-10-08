/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_4;

/**
 *
 * @author sujoy
 */
import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {

        Scanner  input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

       System.out.println("\n" + "1. Addition (+).\n" + "2. Subtraction (-).\n" 
             + "3. Multiplication (*).\n" + "4. Division (/).");

        System.out.print("\nEnter operation number: ");
        int c = input.nextInt();
        int result = 0;
        switch(c)
        {
            case 1 -> result = a + b;
            case 2 -> result = a - b;
            case 3 -> result = a * b;
            case 4 -> result = a / b;
        }
        System.out.println("\nThe result is : " + result);
    }
    
}