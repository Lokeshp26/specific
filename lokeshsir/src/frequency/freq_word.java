package frequency;

import java.util.Scanner;

public class freq_word {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the word");
String str=sc.nextLine();
char ch[]=str.toCharArray();
int dupli=-1;
int fr[]=new int[ch.length];
for(int i=0;i<ch.length;i++){
	int count=1;
	for(int j=i+1;j<ch.length;j++){
		if(ch[i]==ch[j]){
			count ++;
			fr[j]=dupli;
		}
	}
	if(fr[i]!=dupli){
		fr[i]=count;
		}
}
for(int i1=0;i1<fr.length;i1++){
	if(fr[i1]!=dupli && ch[i1]!=' ' ){
		System.out.println(ch[i1]+"="+fr[i1]);
	}
}

}}