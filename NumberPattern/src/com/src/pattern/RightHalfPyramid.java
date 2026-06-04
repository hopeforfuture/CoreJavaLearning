package com.src.pattern;

/**
 *
 * @author Manojit Nandi
 */
public class RightHalfPyramid {
    public static void printRightHalfPyramid(int row) {
        int i,j,k;
        for(i = 0; i < row; i++) {
            for(j = 0; j <= i; j++) {
                k = j + 1;
                System.out.print(k + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int row = 5;
        printRightHalfPyramid(row);
    }
}
