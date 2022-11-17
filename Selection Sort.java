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
    
    public static void selectionSort(){
        for(int i=0;i<n;i++){
            int index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[index]){
                    index=j;
                }
            }
            int temp = arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }
        System.out.println();
        System.out.print("Array after Selection Sorting : ");
		for(int k=0;k<n;k++){
		    System.out.print(arr[k]+" ");
		}
    }
}

public class Main
{
    
	public static void main(String[] args) {
	    sort s = new sort();
	    s.selectionSort();
	}
}


