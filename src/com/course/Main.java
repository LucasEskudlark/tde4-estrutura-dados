package com.course;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        InsertionSort insertionSort = new InsertionSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();
        SelectionSort selectionSort = new SelectionSort();
        ShellSort shellSort = new ShellSort();

        // Vetor ordenado em forma decrescente
        System.out.println("----- Teste com vetor em ordem decrescente ----- ");
        int[] descendingArr = createDescending(500000);

        //quickSort.sort(descendingArr, 0, descendingArr.length - 1);
        selectionSort.sort(descendingArr);
        heapSort.sort(descendingArr);
        insertionSort.sort(descendingArr);
        mergeSort.mergesort(descendingArr, 0, descendingArr.length -1);
        shellSort.sort(descendingArr);

        // Vetor ordenado de forma aleatoria
        System.out.println("----- Teste com vetor desordenado ----- ");
        int[] unorderedArr = createUnordered(500000);

        quickSort.sort(unorderedArr, 0, unorderedArr.length - 1);
        selectionSort.sort(unorderedArr);
        heapSort.sort(unorderedArr);
        insertionSort.sort(unorderedArr);
        mergeSort.mergesort(unorderedArr, 0, unorderedArr.length -1);
        shellSort.sort(unorderedArr);

        // Vetor ordenado de forma aleatoria
        System.out.println("----- Teste com vetor quase ordenado ----- ");
        int[] nearlyOrderedArr = createNearlyOrdered(500000);

        //quickSort.sort(nearlyOrderedArr, 0, nearlyOrderedArr.length - 1);
        selectionSort.sort(nearlyOrderedArr);
        heapSort.sort(nearlyOrderedArr);
        insertionSort.sort(nearlyOrderedArr);
        mergeSort.mergesort(nearlyOrderedArr, 0, nearlyOrderedArr.length -1);
        shellSort.sort(nearlyOrderedArr);
    }



    public static int[] createNearlyOrdered(int size) {
        int[] arr = new int[size];
        for (int a = 0; a < arr.length; a++) {
            arr[a] = a + 1;
        }

        int value = (int) (size * 0.1);


        for (int a = (int) (size * 0.2); a < arr.length; a += (int) (size * 0.2)) {
            int atual = arr[a];
            int anterior = arr[a-5];
            arr[a] = anterior;
            arr[a-5] = atual;
        }

        return arr;
    }

    /* Método para criar um vetor em ordem decrescente de acordo com o tamanho informado*/
     public static int[] createDescending(int size) {
        int[] arr = new int[size];
         for (int a = 0; a < arr.length; a++) {
             arr[a] = a + 1;
         }

         /*
         * Multiplica todos os índices por -1
         * Ordena o vetor de forma ascendente
         * Multiplica todos os índices por -1
         */
         for(int i=0;i<arr.length;i++) {
             arr[i]=-arr[i];
         }

         Arrays.sort(arr);

         for(int i=0;i<arr.length;i++) {

             arr[i]=-arr[i];
         }
        return arr;
    }

    public static int[] createUnordered(int size) {
        int[] arr = new int[size];
        for (int a = 0; a < arr.length; a++) {
            arr [a] = (int) (Math.random () * 9999);
        }

        return arr;
    }


}
