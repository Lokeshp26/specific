package frequency;

import java.util.Scanner;

public class hiring {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the rows");
	int m=sc.nextInt();
	System.out.println("enter the columns");
	int n=sc.nextInt();
	int arr[][]=new int[m][n];
	System.out.println("enter tthe "+" "+m*n+"+elements");
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
		arr[i][j]=sc.nextInt();	
		}
		System.out.println();
	}
	System.out.println("enter the given matrix");
	for(int i1=0;i1<arr.length;i1++){
		for(int j1=0;j1<arr[i1].length;j1++){
			System.out.print(arr[i1][j1]);
		}
		System.out.println();
	}
	int sum=0;
	int no=arr.length;
	for(int j1=0;j1<arr.length;j1++){
		for(int j=0;j<arr[j1].length;j++){
			if(arr[j1]==arr[j]){
				sum=sum+arr[j1][no-1-j1];
			}
			
		}
	}
	System.out.println("sum of the diagonals"+sum);
}
}
