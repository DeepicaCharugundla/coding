public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t>0){
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            import java.util.*;

            Class GFG{
                arr[i] = sc.nextInt();

            }

            bubbleSort obj = new bubbleSort();
            obj.bubbleSort1(arr,n);

            for(int i=0;i<n;i++){
                System.out.println(arr[i]+" ");
            }
            System.out.println();
            t--;
        }
    }
}
class bubbleSort
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort1(int arr[], int n)
    {
        //code here
        for(int i = 0 ; i < n-1; i++){
            for(int j =0; j< n-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
