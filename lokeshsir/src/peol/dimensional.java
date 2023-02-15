package peol;

import java.util.Scanner;

public class dimensional {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the rows");
	int m=sc.nextInt();
	System.out.println("enter the columns");
	int n=sc.nextInt();
	int arr[][]=new int[m][n];
	System.out.println("enter the"+m*n+" "+"elements");
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
			arr[i][j]=sc.nextInt();
		}
		System.out.println();
	}
	System.out.println("given matrix");
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
			//if(j1 == 0 && j == 0 || j1 == 0 || j == 2 || j1 == 2 && j == 0 || j1 == 2 && j == 2 ){
			if(arr[0][0]+arr[0][j-1]+arr[j-1][0]+arr[j-1][j1-1])	{
			sum=sum+arr[j][j1];
				//-arr[j][j1];
				//-arr[j1][no+1+j1];
			}
		}
	}
	System.out.println(sum);
}
}
