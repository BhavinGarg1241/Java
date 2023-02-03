import java.util.*;

public class Main{
    static String removeVowels(String str){
        return str.replaceAll("[aeiouAEIOU]","");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str;
        str=sc.nextLine();
        System.out.println(removeVowels(str));
    }
}
