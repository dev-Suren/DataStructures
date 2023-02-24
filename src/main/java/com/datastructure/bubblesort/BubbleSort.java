package com.datastructure.bubblesort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {4,3,6,7,3,4,1,2,5,1,7,1};
        int n = arr.length;
        bubbleSort(arr,n);

    }

    public static void bubbleSort(int[] arr, int n){
        for(int i = 0;i<n-1;i++){
            for (int j = 0;j <n-1;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                     arr[j]= arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        display(arr);
    }

    public static void display(int[] arr){
        for (int arays:
             arr) {
            System.out.println(arays);

        }
    }

}
