/*
 * Program: HV_D13_P1_Processor
 * Author: Harsha Vardhan
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Day 13 - Program 1
 * KL University - Placement Training
 */

import java.util.Scanner;

public class HV_D13_P1_Processor {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        System.out.println("Day 13 - Program 1");
        System.out.println("Created by: Harsha Vardhan");
        
        System.out.print("Enter a number: ");
        int inputNumber = userInputScanner.nextInt();
        System.out.println("You entered: " + inputNumber);
        
        userInputScanner.close();
    }
}
