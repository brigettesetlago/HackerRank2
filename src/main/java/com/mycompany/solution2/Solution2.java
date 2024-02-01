/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.solution2;

import java.util.Scanner;

/**
 *
 * @author Capaciti
 */
public class Solution2 {

  
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            
            if (n % 2 != 0) {
                System.out.println("Weird");
            } else if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
    }
}

    

