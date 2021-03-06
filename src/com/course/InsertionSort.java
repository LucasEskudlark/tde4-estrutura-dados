package com.course;

public class InsertionSort {

    /*Function to sort array using insertion sort*/
    void sort(int arr[])
    {
        long tempoInicial = System.currentTimeMillis();
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        long tempoFinal = System.currentTimeMillis();
        float tempoResultado = (tempoFinal - tempoInicial) / 1000F;
        System.out.println("InsertionSort = " + tempoResultado + " s");
    }

}
