package frequency;

import java.util.Scanner;

public class tester {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no of rows");
	int m=sc.nextInt();
	System.out.println("enter the no of colums");
	int n=sc.nextInt();
	int arr[][]=new int[m][n];
	System.out.println("enter the"+m*n+"elements");
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
			arr[i][j]=sc.nextInt();
		}
		System.out.println();
	}
	System.out.println("given matrix");
	for(int k=0;k<arr.length;k++){
		for(int l=0;l<arr[k].length;l++){
			System.out.print(arr[k][l]);
		}
		System.out.println();
	}
	int sum=0;
	int no=arr.length;
	for(int l=0;l<arr.length;l++){
		for(int j=0;j<arr[l].length;j++){
			if(arr[l]==arr[j]){
				sum=sum+arr[l][no-1-l];
			}
		}
	}

	System.out.println("sum of the diagonals"+sum);
}
}
