import java.util.*;

class sort{
    
        public static int n;
        public static int arr[];
    sort(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of array : ");
        n=sc.nextInt();
        System.out.println("Enter elements of array : ");
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void insertionSort(){
        int key,i,j;
        for(i=1;i<arr.length;i++){
            key=arr[i];
            j=i-1;
            
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println();
        System.out.print("Array after Insertion Sorting : ");
		for(int k=0;k<n;k++){
		    System.out.print(arr[k]+" ");
		}
    }
}

public class Main
{
    
	public static void main(String[] args) {
	    sort s = new sort();
	    s.insertionSort();
	}
}

