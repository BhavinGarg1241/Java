import java.util.*;
public class Main
{
    static boolean checkPrime(int n){
        if(n<2){
            return false;
        }
        else if(n==2){
            return true;
        }
        else if(n%2==0){
           return false;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2){
            if(n%i==0){
                return false;
            }
        }
       return true;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n;
	    System.out.println("Enter Number to check if it's prime:");
	    n=sc.nextInt();
	    if(n<2){
	       System.out.println("Invalid Number\n");
	    }
	    else if(checkPrime(n)){
	        System.out.print("Prime\n");
	    }else if(!checkPrime(n)){
	        System.out.println("Not Prime\n");
	    }
	}
}
