import java.util.*;
public class Main
{
	static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(arr[j-1] > arr[j]){  
                temp = arr[j-1];  
                arr[j-1] = arr[j];  
                arr[j] = temp;  
                }  
            }  
         }  
}
    
    static void binarySearch(int arr[],int x){
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
        if(arr[mid]==x){
            System.out.print("Key found at : "+mid);
        }else if(arr[mid]<x){
            System.out.print("Key found at : "+(mid+1));
        }else if(arr[mid]>x){
            System.out.print("Key found at : "+(mid-1));
        }else{
            System.out.print("Key not found");
        }
    }
    
    public static void main(String[] args) {  
                Scanner s = new Scanner(System.in);
                int n;
                System.out.print("Enter Size : ");
                n=s.nextInt();
                System.out.print("Enter "+n+" Elements in array:\n");
                int arr[] =new int [n];  
                for(int i=0;i<n;i++){
                    arr[i]=s.nextInt();
                }
                 
                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                
                bubbleSort(arr);
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();
                System.out.println();  
                int x;
                System.out.println("Enter key you want to find : ");
                x=s.nextInt();
                binarySearch(arr,x);
                System.out.println();
        }  
}


