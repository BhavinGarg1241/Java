import java.util.*;

class matrix{
    private int mat[][]=new int [3][3];
    private int i,j;
    public void input(){
        Scanner sc=new Scanner(System.in);
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print("Enter numbers to insert in 2-D Array : \n");
                mat[i][j]=sc.nextInt();
            }
        }
    }
    public void display(){
        System.out.print("Matrix : \n");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}

public class Main{
    public static void main(String[] args){
        matrix a=new matrix();
        a.input();
        a.display();
    }
}


Credits :- Bhavin Garg
