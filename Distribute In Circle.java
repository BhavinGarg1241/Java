import java.util.*;
public class Main
{
    static int distributeInCircle(int n, int m, int k){
        if(m<=n-k+1){
            return m+k-1;
        }
        m=m-(n-k+1);
        return (m%n==0) ? n : (m%n);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n,m,k;
      System.out.println("Enter total numer of positions in circle:");
	    n=sc.nextInt();
      System.out.println("Enter total numer of items to be distributed:");
	    m=sc.nextInt();
      System.out.println("Enter position from where to start distribution:");
	    k=sc.nextInt();
		System.out.println(distributeInCircle(n,m,k));
	}
}
