import java.util.*;
import java.io.*;

class window{
    int n,k,maxSum=0;
    int[] arr;
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        n = sc.nextInt();
        System.out.println("Enter elements in array : ");
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter window size : ");
        k = sc.nextInt();
    }
    
    public int max(){
        if(n<k){
            System.out.println("Invalid");
            return -1;
        }
        for(int i=0;i<k;i++){
            maxSum+=arr[i];
        }
        int windowSum = maxSum;
        for(int j=k;j<n;j++){
            windowSum = windowSum + arr[k] - arr[j-k];
            maxSum=Math.max(maxSum,windowSum);
        }
        return maxSum;
    }
}

public class Main
{
	public static void main(String[] args) {
		window obj = new window();
		obj.input();
		System.out.println("Max Sum : " + obj.max());
	}
}
