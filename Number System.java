import java.util.*;
class decimal{
    public int decnum;
    public int[] bin=new int[100];
    public int[] oct=new int[100];
    public int[] hex=new int[100];
    Scanner sc=new Scanner(System.in);
    public void input(){
        System.out.print("Enter decimal number : ");
        decnum=sc.nextInt();
    }
    public void convertbin(){
        int i=0;
        while(decnum>0){
            bin[i]=decnum%2;
            decnum=decnum/2;
            i++;
        }
        System.out.print("Binary : ");
            for (int j = i - 1; j >= 0; j--){
                System.out.print(bin[j]);
            }
        System.out.print("\n\n");
    }
    public void convertoct(){
        int i=0;
        while(decnum>0){
            oct[i]=decnum%8;
            decnum=decnum/8;
            i++;
            
        }
        System.out.print("Octal : ");
        for (int j = i - 1; j >= 0; j--){
                System.out.print(oct[j]);
            }
        System.out.print("\n\n");
    }
    public void converthex(){
        int i=0;
        while(decnum>0){
            hex[i]=decnum%16;
            decnum=decnum/16;
            i++;
            
        }
        System.out.print("Hexadecimal : ");
        for (int j = i - 1; j >= 0; j--) {
                if (hex[j] > 9){
                    System.out.print((char)(55 + hex[j]));
                }else{
                    System.out.print(hex[j]);
                }
                    
        }
        System.out.print("\n\n");
    }
}


public class Main
{
	public static void main(String[] args) {
	    decimal d=new decimal();
	    boolean bool=true;
		while(bool==true){
		    System.out.println("\nPress 1 to convert decimal to binary.\nPress 2 to convert decimal to Octal.\nPress 3 to convert decimal to Hexadecimal.\nPress 4 to exit.\n\nEnter Choice : ");
		    int choice;
		    Scanner dec=new Scanner(System.in);
		    choice=dec.nextInt();
		    switch(choice){
		        case 1:
		            d.input();
		            d.convertbin();
		            break;
		        case 2:
		            d.input();
		            d.convertoct();
		            break;
		        case 3:
		            d.input();
		            d.converthex();
		            break;
		        case 4:
		            System.out.print("\nThankyou\n\n");
		            bool=false;
		            break;
		        default:
		            System.out.print("Invalid Choice.");
		    }
		}
	}
}


Credits :- Bhavin Garg
