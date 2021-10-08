/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_5;

/**
 *
 * @author sujoy
 */
import java.util.Scanner;

public class Task_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter " + n + " integers : ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int b = input.nextInt();
        int cnt = 0;

        for (int x : arr) {
            if (x == b) {
                cnt++;
            }
        }
        System.out.println(b + " occurred " + cnt + " times in the array.");
    }
}
