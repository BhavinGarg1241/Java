import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n,i,j,space=1;
	    System.out.print("Enter number of lines : ");
	    n=sc.nextInt();
	    System.out.print("Enter char : ");
		char s;
		s=sc.next().charAt(0);
		space=n-1;
		for (j = 1; j<= n; j++){
            for (i = 1; i<= space; i++){
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++){
                System.out.print(s);
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j<= n - 1; j++){
            for (i = 1; i<= space; i++){
                System.out.print(" ");
            }
            space++;
            for (i = 1; i<= 2 * (n - j) - 1; i++){
                System.out.print(s);
            }
            System.out.println("");
        }
	}
}

Credits :- Bhvain Garg
