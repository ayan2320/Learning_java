import java.util.*;
public class java_learn_2{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter Age:");
		int age=sc.nextInt();
		if(age>=18){
		    System.out.println("Can Vote");
		}
		else{
		    System.out.println("CANNOT VOTE");
		}
		System.out.println("Enter MArks:");
		int marks=sc.nextInt();
		if(marks>90){
		    System.out.println("a");
		}
		else if(marks>80 && marks<=90){
		    System.out.println("b");
		}
		else if(marks>70 && marks<=80){
		    System.out.println("c");
		}
		else{
		    System.out.println("d");
		}
		System.out.print("ENTER RESIDENT AGE");
		int person_age=sc.nextInt();
		System.out.print("ENTER RESIDENT YEAR");
		int year=sc.nextInt();
		if(person_age>18){
		    if(year>=10){
		        System.out.print("Can Apply for Citizenship");
		    }
		    else{
		        System.out.print("Not eligible");
		    }
		}*/
		System.out.print("MENU:");
		System.out.print("1.Addition \n 2.Subtraction \n 3.Multiply \n 4.Divide \n");
		System.out.print("ENTER BOTH NUMBERS");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.print("Your choice");
		int option=sc.nextInt();
		switch(option){
		    case 1:
		        System.out.print(a+b);
		        break;
		    case 2:
		        System.out.print(a-b);
		        break;
		    case 3:
		        System.out.print(a*b);
		        break;
		    case 4:
		        System.out.print(a/b);
		        break;
		    default:
		    System.out.print("invalid");
		        
		}
	}
    
}
