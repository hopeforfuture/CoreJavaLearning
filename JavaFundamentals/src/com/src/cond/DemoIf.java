package com.src.cond;

/**
 *
 * @author Manojit Nandi
 */
public class DemoIf {
    public static void main(String[] args) {
        int num = 10;
        boolean flag = false;
        if(num == 1 || num == 0) {
            System.out.println(num + " is not a prime number");
        }
        else if(num == 2) {
            System.out.println(num + " is a prime number");
        }
        else {
            for(int i = 2; i <= (num/2); i++) {
                if(num % i == 0) {
                    System.out.println(num + " is not a prime number");
                    flag = true;
                    break;
                }
            }

            if(!flag) {
                System.out.println(num + " is a prime number");
            }
       }
    }
}
