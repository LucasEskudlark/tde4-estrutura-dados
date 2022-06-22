package com.course;

public class SelectionSort {

    void sort(int arr[])
    {
        long tempoInicial = System.currentTimeMillis();
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        long tempoFinal = System.currentTimeMillis();
        float tempoResultado = (tempoFinal - tempoInicial) / 1000F;
        System.out.println("SelectionSort = " + tempoResultado + " s");
    }

}
