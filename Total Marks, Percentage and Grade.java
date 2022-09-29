import java.util.*;

class student{
    public int roll,sem;
    public String name,course;
    Scanner sc=new Scanner(System.in);
    public void inputdata(){
        System.out.print("Enter Name : ");
        name=sc.next();
        System.out.print("Enter Roll Number : ");
        roll=sc.nextInt();
        System.out.print("Enter Course : ");
        course=sc.next();
        System.out.print("Enter Semester : ");
        sc.nextInt();
    }
    public void displaydata(){
        System.out.print("\n\nName : "+name+"\nRoll Number : "+roll+"\nCourse : "+course+"\nSemester : "+sem+"\n\n");
    }
}

class exam extends student{
    float sub1,sub2,sub3,sub4,sub5,total,per;
    char grade;
    public void input(){
        System.out.print("Enter Marks of Subject 1 : ");
        sub1=sc.nextFloat();
        System.out.print("Enter Marks of Subject 2 : ");
        sub2=sc.nextFloat();
        System.out.print("Enter Marks of Subject 3 : ");
        sub3=sc.nextFloat();
        System.out.print("Enter Marks of Subject 4 : ");
        sub4=sc.nextFloat();
        System.out.print("Enter Marks of Subject 5 : ");
        sub5=sc.nextFloat();
    }
    public void calculate(){
        total=sub1+sub2+sub3+sub4+sub5;
        per=(total/5);
        if(per>=70){
            grade='A';
        }else if(per>=60 && per<70){
            grade='B';
        }else if(per>=50 && per<60){
            grade='C';
        }else if(per>=40 && per<50){
            grade='D';
        }else if(per<40){
            grade='F';
        }
    }
    public void display(){
        System.out.print("Total Marks : "+total+"\nPercentage : "+per+"\nGrade : "+grade+"\n\n");
    }
    
}

public class Main
{
	public static void main(String[] args) {
		exam e=new exam();
		e.inputdata();
		e.input();
		e.calculate();
		e.displaydata();
		e.display();
	}
}


Credits :- Bhavin Garg
