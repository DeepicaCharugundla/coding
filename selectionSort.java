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

            selectionSort obj = new selectionSort();
            obj.selectionSort1(arr,n);

            for(int i=0;i<n;i++){
                System.out.println(arr[i]+" ");
            }
            System.out.println();
            t--;
        }
    }
}
class selectionSort
{
	int  select(int arr[], int i)
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
	
	void selectionSort1(int arr[], int n)
	{
	    //code here
	    int num = 0;
	    for(int i=0;i<n;i++){
	        num = this.select(arr,i);
	        int temp = arr[i];
	        arr[i] = arr[num];
	        arr[num] = temp;
	    }
	    
	}
}
