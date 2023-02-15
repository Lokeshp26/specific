package peol;

import java.util.Scanner;

public class corner {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the rows");
	int m=sc.nextInt();
	System.out.println("enter the columns");
	int n=sc.nextInt();
	int arr[][]=new int[m][n];
	System.out.println("given matrix");
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
			arr[j][i]=sc.nextInt();
		}
		System.out.println();
	}
int sum=0;
for(int i1=0;i1<arr.length;i1++){
	for(int j1=0;j1<arr[i1].length;j1++){
		System.out.print(arr[j1][i1]);
		if(i1==0 && j1==0 || i1==0 && j1==arr.length-1 || i1==arr.length-1 && j1==0 || i1==arr.length-1 && j1==arr.length-1 ){
			sum=sum+arr[j1][i1];
		}
}
System.out.println();
}


System.out.println("The sum of the corners is"+ sum);
}}