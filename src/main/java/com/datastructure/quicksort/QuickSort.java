package com.datastructure.quicksort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void quickSort(int arr[], int low , int high){
        if(low>=high){
            return;
        }
        int left = low;
        int right = high;
        int pivotElement = arr[high];

        while(left<=right){
            while(arr[left]<pivotElement){
                left++;
            }
            while (arr[right]>pivotElement){
                right--;
            }
            if(left<=right){
                int tmp = arr[left];
                arr[left]= arr[right];
                arr[right]= tmp;

                left++;
                right--;
            }
        }
        quickSort(arr,low,right);
        quickSort(arr,left,high);

    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[1000];
        int i=0;
        while(i <arr.length){
            arr[i]= random.nextInt(100);
            i++;
        }

        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }


}
