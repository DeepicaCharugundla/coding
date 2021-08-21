import java.util.*;

class insertionSort
{
    static void insert(int arr[],int i)
    {
        // Your code here
        int key = arr[i];
        int j = i-1;

        while(j>=0 && arr[j] > key){
            arr[j+1] = arr[j];
            j = j-1;
        }
        arr[j+1] = key;
    }
    //Function to sort the array using insertion sort algorithm.
    public static void insertionSort1(int arr[], int n)
    {
        //code here
        for(int i = 1; i< n;i++){
            insert(arr,i);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        insertionSort1(arr,n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}

