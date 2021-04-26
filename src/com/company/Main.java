package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int arrayA[] = new int[5];
        int arrayB[] = new int[5];
        int sumA = 0;
        int sumB = 0;
        Random random = new Random();

        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = random.nextInt(5);
            System.out.print("[" + arrayA[i] + "] ");
            sumA = sumA + arrayA[i];
        }
        System.out.println("Sum array 1 is : " + sumA);

        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = random.nextInt(5);
            System.out.print("[" + arrayB[i] + "] ");
            sumB = sumB + arrayB[i];
        }
        System.out.println("Sum array 2 is : " + sumB);

        if (sumA > sumB) {
            System.out.println("Sum array 1 biggest then array 2");
        } else if (sumB > sumA) {
            System.out.println("Sum array 2 biggest then array 1");
        } else {
            System.out.println("All array are equal");
        }


        int array[] = new int[8];

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(10) + 1;

            System.out.print("[" + array[i] + "] ");

            if (i != 0 & i % 2 != 0) {
                array[i] = 0;
            }

        }

        System.out.println("\n------------------");

        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "] ");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) array[i] = 0;
            System.out.println(array[i] + " ");
        }


        int b = 0;
        int array2[] = new int[15];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(10);
            System.out.print("[" + array2[i] + "] ");
            if (array2[i] > 0 & array2[i] % 2 == 0) b++;

        }
        System.out.print("\nчетных элементов в массиве : " + b);


        int a = 0;


        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) a++;
        }

        System.out.println("Value array " + a);

        int array3[] = new int[a];

        for (int i = 0, q = 1; i < array3.length; i++) {
            array3[i] = q;
            q++;
            if (q > 3) {
                q = 1;
            }
            System.out.print("[" + array3[i] + "] ");

        }


        for (int i = 0, c = 1; i < array3.length; i++) {
            array3[i] = c;
            c = c + 2;
            System.out.print("[" + array3[i] + "] ");
        }

        System.out.println("\n----------------\n");

        for (int i = array3.length - 1; i >= 0; i--) {
            System.out.print("[" + array3[i] + "] ");
        }


        int array4[] = new int[50];
        for (int i = 0, z = 2; i < array4.length; i++) {
            array4[i] = z;
            z = z + 2;
            System.out.print(array4[i] + " ");
            if (z > 20) {
                z = 2;
            }
        }

        System.out.println("\n----------------\n");


        int x = 0;

        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) x++;
        }

        System.out.println("\nvalue array is " + x);


        int array5[] = new int[x];

        for (int i = 2, y = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                array5[y] = i;
                System.out.print("[" + array5[y] + "] ");
                y++;
            }
        }

        System.out.println("\n------------------------\n");

        for (int i = 0; i < array5.length; i++) {
            System.out.print("[" + array5[i] + "] ");
        }


        System.out.println("\n------------------------\n");

        for (int i = 0; i < array5.length; i++) {

            if (i % 2 == 0) {
                array5[i] = i;
            }

            System.out.print("[" + array5[i] + "] ");

        }

        System.out.println("\n------------------------\n");


        int valueArray = 0;

        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) valueArray++;

        }

        System.out.println("Value Array is " + valueArray);
        System.out.println("\n------------------------\n");



        int array6[] = new int[valueArray];

        for (int i = 2, e = 0; i <= 20; i++) {

            if (i % 2 == 0) {
                array6[e] = i;
                System.out.print("[" + array6[e] + "] ");
                e++;
            }
        }
    }
}