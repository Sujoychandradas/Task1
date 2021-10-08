/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;

/**
 *
 * @author sujoy
 */
import java.util.Scanner;

public class Task_2 {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
            
        for(int i = 1; i<=10; i++)
        {
            int n = input.nextInt();
            
            if(n>=0)
            {
                System.out.println(n + " is a Positive Number.");
            }
            else 
                System.out.println(n + " is a Negative Number.");
        }
    }
    
}