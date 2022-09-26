/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamassive;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class JavaMassive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        int numbers = 101;
        int summary = 0;
        System.out.println("Одномерные Массивы");
        int[] massive = new int[numbers];
        for (int i = 0; i < massive.length; i++) {
            while(true){
                int rundNumberrs = random.nextInt(100);
                if (rundNumberrs % 2 != 0){
                    massive[i] = rundNumberrs;
                    break;
                }
            }
        }
        Arrays.sort(massive);    
        for (int i = 1; i < massive.length; i++) {
            System.out.printf("%-4d", massive[i]);
            summary += massive[i];  
            if (i%10==0){
                System.out.println("");
            }
               
        }
        System.out.println();
        System.out.println("Среднее арифметическое: " + summary/numbers);
    }
    
}
