/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_3;
import java.util.Scanner;
/**
 *
 * @author sujoy
 */
public class Task_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        for(int i = 1; i<=n; i++ )
        {
            for(int j = n; j > i; j--)
            {
                System.out.print("  ");
            }
               for(int k = 1; k <= i; k++)
               {
                   System.out.print(k + " ");
               }
               System.out.println();
        }
    }
    
}
