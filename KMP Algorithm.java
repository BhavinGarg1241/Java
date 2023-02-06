import java.util.*;
public class Main
{
    static void KMPSearch(String pat, String txt){
        int M = pat.length();
        int N = txt.length();
        int i=0,j=0;
        int lps[] = new int[M];
        computeLPSArray(pat,M,lps);
        while((M-j)<=(N-i)){
            if(pat.charAt(j)==txt.charAt(i)){
                j++;
                i++;
            }
            if(j==M){
                System.out.println("Pattern Found at index : "+(i-j));
                j=lps[j-1];
            }else if(i<N && pat.charAt(j)!=txt.charAt(i)){
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
        }
    }
    
    static void computeLPSArray(String pat, int M, int lps[]){
        int len=0;
        int i=1;
        lps[0]=0;
        while(i<M){
            if(pat.charAt(i)==pat.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len!=0){
                    len=lps[len-1];
                }else{
                    lps[i]=len;
                    i++;
                }
            }
        }
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String txt,pat;
		System.out.println("Enetr Text : ");
		txt = sc.nextLine();
		System.out.println("Enetr Pattern to Search : ");
		pat = sc.nextLine();
		KMPSearch(pat,txt);
	}
}
