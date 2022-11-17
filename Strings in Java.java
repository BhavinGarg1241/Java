import java.util.*;
class words{
    Scanner sc=new Scanner(System.in);
	String str;
    int len =0;
    public void input(){
		str = sc.nextLine();
		len = str.length();
	}	
	
    public void count(){
        int wordcount=1,vowelcount=0,frequency=0;
        for(int i=0;i<this.len;i++){
            char c = str.charAt(i);
            switch (c){
                case ' ':
                case '.':
                wordcount++; 
            }
 
            switch (c){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelcount++;
            }
            if(c >= 65 || c <= 90 || c>=97 || c<=122){
                frequency++;
            }
        }
        System.out.println("Number of words = " + wordcount);
        System.out.println("Number of vowels = " + vowelcount);
        System.out.println("Number of characters = "+ frequency);
    }
    public void occurence(){
        TreeMap<Character, Integer> hmap =
        new TreeMap<Character, Integer>();
  
        for (int i = 0; i < len; i++){
            Integer c = hmap.get(str.charAt(i));
  
            if (hmap.get(str.charAt(i)) == null)
               hmap.put(str.charAt(i), 1);
  
            else
              hmap.put(str.charAt(i), ++c);
        }
         
        for (Map.Entry m:hmap.entrySet()){
          System.out.println("Character = " + m.getKey() + " , Frequency = " + m.getValue());
        }
    }
}


public class Main
{
	public static void main(String[] args) {
		
	    words obj=new words();
	    obj.input();
		obj.count();
		obj.occurence();
	}
}
