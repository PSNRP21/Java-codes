


/*
Java
*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		
		boolean notfound=true;
		for(int i=1;i<n-1;i++){
		    if(a[i]>a[i-1]&&a[i]>a[i+1]){
		        System.out.print(i-1);
		        System.out.print(i);
		        System.out.print(i+1);
		        notfound=false;
		        break;
		    }
		    
		}
		if(notfound){
		    System.out.println(-1);
		}
	}
}
