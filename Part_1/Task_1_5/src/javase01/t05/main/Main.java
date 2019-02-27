package javase01.t05.main;

import java.util.Scanner;

/*
    Задание 5
    Единичная Х-образная матрица
 */


public class Main {

    public static void main(String[] args) {
	    System.out.println("Enter array size");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[][] arr = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j=0; j< size; j++){
                if(i == j || Math.abs(size - 1 - i) == j )
                    arr[i][j] = 1;
                else
                    arr[i][j] = 0;
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
