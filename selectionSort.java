package com.company;


import java.util.Scanner;

class selectionSort
{
    public static int  select(int arr[], int i)
    {
        // code here such that selectionSort() sorts arr[]
        int min1 = arr[i];
        int index = i;
        for(int j=i;j<arr.length;j++){
            if(arr[j]<min1){
                min1=arr[j];
                index = j;
            }
        }

        return index;
    }

    public static void selectionSort1(int arr[], int n)
    {
        //code here
        int num = 0;
        for(int i=0;i<n;i++){
            num = select(arr,i);
            int temp = arr[i];
            arr[i] = arr[num];
            arr[num] = temp;
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        selectionSort1(arr,n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}

