	import java.util.*;
public class java_learn5
{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
// 		int[] arr1={1,4,2,5,3,6};
 		
//  		System.out.println(arr1); //id
//  		System.out.println(arr); //id
 		System.out.print("Enter size of array");
 		int n=sc.nextInt();
 		int[] arr=new int[n];
 		for(int i=0;i<n;i++){
 		    System.out.print("enter value");
 		    arr[i]=sc.nextInt();
 		}
 	    System.out.print("array is:");
 		for(int i=0;i<n;i++){
 		    System.out.print(arr[i]+" ");
 		}
 		System.out.println("Enter Target:");
 		int target=sc.nextInt();
 		boolean found=false;
 		int i=0;
 		for(i=0;i<n;i++){
 		    if(arr[i]==target){
 		        found=true;
 		        System.out.println("require value index:"+i);
 		        break;
 		    }
 		}
 		   System.out.println(found);}
    }