import java.util.*;
public class Main
{
    static void primefactors(int n){
        while(n%2==0){
            System.out.println("2");
            n/=2;
        }
        for(int i=3;i<=Math.sqrt(n);i++){
            while(n%i==0){
               System.out.println(i);
               n/=i; 
            }
        }
        if(n>2){
            System.out.println(n);
        }
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n;
	    System.out.println("Enter Number to check if it's prime:");
	    n=sc.nextInt();
	    if(n<2){
	       System.out.println("Invalid Number\n");
	    }
	    else{
	        primefactors(n);
	    }
	}
}
