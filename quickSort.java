package com.company;
import java.util.*;
import java.math.*;
import java.text.*;
import java.io.*;


public class quickSort {
    public static int partition(int[] arr, int left, int right, int pivot){
        while(left <= right){
            if(arr[left] < pivot){
                left++;
            }
            if(arr[right] > pivot){
                right--;
            }

            if(left <= right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        return left;
    }
    public static void quickSort(int[] arr, int left, int right){
        if(left >= right){
            return;
        }

        int pivot = arr[(left+right)/2];
        int index = partition(arr,left,right,pivot);
        quickSort(arr,left,index-1);
        quickSort(arr,index,right);
    }
    public static void quickSort(int[] arr, int n){
        quickSort(arr,0,arr.length-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr,n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
