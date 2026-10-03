import java.util.*;
public class java_learn_3 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int n=sc.nextInt();
		/*for(int i=1;i<=4;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print(i);
		    }
		    System.out.println();
		}*/
		/*for(int i=1;i<=100;i+=2){
		  //  if(i%2==0){
		    System.out.print(i+" ");
		  //  }
		}*/
		int sum=0;
	    for(int i=0;i<=n;i++){
		    System.out.print(i);
		    if(i != n){
		        System.out.print("+");
		    }
		    sum=sum+i;
		}
		System.out.print("="+sum);
        // int fact=1;
        // for(int i=1;i<=n;i++){
        //     fact *=i;
        // }
        // System.out.print(fact);
	}
}

