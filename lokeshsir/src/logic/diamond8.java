package logic;

public class diamond8 {
public static void main(String[] args) {
	int n=5;
	int star=1;
	int space=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
		
	for(int k=1;k<=n;k++)
	{
		for(int l=1;l<=space;l++)
		{
		if(l<=space)
			System.out.print("");
		
		else
			System.out.print(i);
		}
		System.out.println();
	if(i<=n){
	star=star-2;
		space++;}
		else{
			star=star+2;
	space--;
		}
	}
		
	}
}

}
