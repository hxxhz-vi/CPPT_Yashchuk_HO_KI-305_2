package com.nulp.Lab1;

import java.io.*;
import java.util.*;

/**
 * Клас Lab1YashchukKI305 реалізує приклад програми до лабораторної роботи №1
 */

public class Lab1YashchukKI305 {
    /**
     * Статичний метод main є точкою входу в програму
     *
     * @param args
     * @throws FileNotFoundException
     *
     */
    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        char[][] arr;
        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        System.out.print("Enter size square matrix: ");
        nRows = in.nextInt();
        in.nextLine();

        arr = new char[nRows][];
        for(int i = 0; i < nRows; i++) {
            arr[i] = new char[i+1];
        }

        System.out.print("\nEnter symbol for filling: ");
        filler = in.nextLine();

        exit:

        for(int i = 0; i < nRows; i++) {
            for(int j = 0; j < nRows - i - 1; j++) {
                System.out.print("  ");
                fout.print("  ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print(filler + " ");
                fout.print(filler + " ");
            }
            System.out.print("\n");
            fout.print("\n");
        }
        fout.flush();
        fout.close();
    }
}
