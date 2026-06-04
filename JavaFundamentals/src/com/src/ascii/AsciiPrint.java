package com.src.ascii;

/**
 *
 * @author Manojit Nandi
 */
public class AsciiPrint {
    public static void main(String[] args) {
        for(int i = 0; i < 127; i++) {
            System.out.printf("%d %c \n", i, i);
        }
    }
}
