/*
 С консоли подается число. Посчитать сумму чисел этого числа.
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;
        
public class ForWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int res = sum(value);
        System.out.println(res);
    }
        public static int sum(int value){
          int res = 0;
          int currentValue=value;
          while (currentValue !=0){
              res += currentValue %10;
              currentValue /=10;
              }
          return res;
        }       
    }

