import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,hcf=0;
		System.out.print("Enter First Number : ");
		a=sc.nextInt();
		System.out.print("Enter Second Number : ");
		b=sc.nextInt();
		for(int i=1;i<=a || i<=b;i++){
		    if(a%i==0 && b%i==0){
		        hcf=i;
		    }
		}
		System.out.print("\nHCF of "+a+" and "+b+" is "+hcf);
		int lcm;
		lcm=(a*b)/hcf;
		System.out.print("\n\nLCM of "+a+" and "+b+" is "+lcm);
	}
}

