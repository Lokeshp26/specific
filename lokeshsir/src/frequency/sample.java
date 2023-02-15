package frequency;

import java.util.Scanner;

public class sample {
public static void main(String[] args) {
	System.out.println("enter the string");
Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	char ch[]=str.toCharArray();
	int dup=-1;
	int fr[]=new int[ch.length];
	for(int i=0;i<ch.length;i++){
		int count=1;
		for(int j=i+1;j<ch.length;j++){
			if(ch[i]==ch[j]){
				fr[j]=dup;
				count ++;
			}
		}
		if(fr[i]!=dup){
			fr[i]=count;
		}
	}
	int sum=0;
	for(int i=0;i<fr.length;i++){
		if(fr[i]!=dup && ch[i]!=' '){
			sum=sum+fr[i];
			System.out.println(ch[i]+"="+fr[i]);
		}
	}


System.out.println(str+"="+sum);
}}