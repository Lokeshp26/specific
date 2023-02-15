package peol;

import java.util.Scanner;

public class sentence {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the sentence");
	String str=sc.nextLine();
	String ch[]=str.split(" ");
	int dupli=-1;
	int fr[]=new int[ch.length];
	for(int i=0;i<ch.length;i++){
		int count=1;
		for(int j=i+1;j<ch.length;j++){
			if(ch[i]==ch[j]){
				fr[j]=dupli;
				count ++;
			}
		}
		if(fr[i]!=dupli){
			fr[i]=count;
		}
	}
	for(int i=0;i<fr.length;i++){
		if(fr[i]!=dupli && ch[i]!=" "){
			System.out.println(ch[i]+"="+fr[i]);
		}
	}
}
}
