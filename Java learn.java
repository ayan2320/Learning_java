//learn java programming
import java.util.*;
public class Main
{
	public static void main(String[] args) {
 		System.out.println("Hello World");
		int a=9;
		int b=2;
		int c=3;
		int d=5;
		int e=8;
		int sum=a+b;
		System.out.println("sum:"+sum);
		double avg=(a+b+c+d+e)/5.0;
		System.out.println("Avg:"+avg);
		Scanner sc=new Scanner(System.in);
		int f;
		System.out.println("Enter the number:");
		f=sc.nextInt();
		System.out.println(a/f);
		String g;
		System.out.println("Enter the Name:");
		g=sc.next();
		System.out.println("Enter the numbers");
		int y=sc.nextInt();
		int w=sc.nextInt();
		int x=sc.nextInt();
		double avge=(y+w+x)/3.0;
		System.out.println("Avg is:"+avge);
		float j=1.0f;
		double s=2.0;
		System.out.println("Enter char");
		char ch=sc.next().charAt(0);
		System.out.println(ch);
		System.out.println("Enter Float value:");
		float jhi=sc.nextFloat();
		System.out.print(jhi);
		
	}
}
