package com.company;

import java.util.Scanner;

public class mergeSort {
    public static void mergeSort1(int[] arr,int n){
        int temp[] = new int[arr.length];
        mergeSort1(arr, temp,0,arr.length-1);
    }
    public static void mergeSort1(int[] arr, int[] temp,int leftStart,int rightEnd){
        if(leftStart>=rightEnd){
            return;
        }
        int middle = (leftStart+rightEnd)/2;
        mergeSort1(arr,temp,leftStart,middle);
        mergeSort1(arr,temp,middle+1,rightEnd);
        merge(arr,temp,leftStart,middle,rightEnd);
    }
    public static void merge(int[] arr,int[] temp,int leftStart,int middle,int rightEnd){
        int left = leftStart;
        int leftEnd = middle;
        int rightStart = middle+1;
        int right = rightStart;
        int size = rightEnd - leftStart + 1;
        int index = leftStart;
        while(left<=leftEnd && right<=rightEnd){
            if(arr[left]<arr[right]){
                temp[index] = arr[left];
                left++;
            }
            else{
                temp[index] = arr[right];
                right++;
            }
            index++;
        }

        System.arraycopy(arr,left,temp,index,leftEnd-left+1);
        System.arraycopy(arr,right,temp,index,rightEnd-right+1);
        System.arraycopy(temp,leftStart,arr,leftStart,size);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        mergeSort1(arr,n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
