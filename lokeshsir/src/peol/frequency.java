package peol;

//import java.util.Scanner;

public class frequency {
public static void main(String[] args) {
	//Scanner sc=new Scanner(System.in);
	//System.out.println("enter the string");
	String str="bengalore";//sc.nextLine();
	char ch[]=str.toCharArray();
	int dup=-1;
	int fr[]=new int[ch.length];
	for(int i=0;i<ch.length;i++){
		int count=1;
		for(int j=i+1;j<ch.length;j++){
			if(ch[i]==ch[j]){
				count ++;
				fr[j]=dup;
			}
		}
		if(fr[i]!=dup){
			fr[i]=count;
		}
	}
	for(int i1=0;i1<fr.length;i1++){
		if(fr[i1]!=dup && ch[i1]!=' '){
			System.out.println(ch[i1]+"="+fr[i1]);
		}
	}
}
}
