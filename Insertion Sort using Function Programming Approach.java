import java.util.*;
public class Main
{
    public static void insertionSort(int arr[]){
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
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n;
		System.out.print("Enter Size of array : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter elements of array : \n");
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.println();
		System.out.print("Array : ");
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
		System.out.println();
		insertionSort(arr);
		System.out.println();
		System.out.print("Array after Insertion Sorting : ");
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}

