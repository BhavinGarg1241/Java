import java.util.*;

class matrix{
    private int mat[][]=new int [3][3];
    private int i,j,sum;
    public void input(){
        Scanner sc=new Scanner(System.in);
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print("Enter numbers to insert in 2-D Array at ["+i+"] ["+j+"] : ");
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.print("\n");
    }
    
    public matrix multiplymatrix(matrix mat1,matrix mat2){
        matrix d=new matrix();
        
        for(i=0;i<3;i++){
            sum=0;
            for(j=0;j<3;j++){
                sum=0;
                for(int k=0;k<3;k++){
                    sum+=mat1.mat[i][k]*mat2.mat[k][j];
                    d.mat[i][j]=sum;
                }
            }
        }
        return d;
    }
    
    public void display(){
        System.out.print("\nAddition Matrix : \n");
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
        matrix b=new matrix();
        a.input();
        b.input();
        matrix c=a.multiplymatrix(a,b);
        c.display();
        
    }
}


Credits :- Bhavin Garg
