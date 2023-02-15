package logic;

public class diamond7 {
public static void main(String[] args) {
	int n=5;
	int x=0;
	for(int i=1;i<=n;i++)
	{
		x=i;
		for(int j=1;j<=i;j++)
		{
			System.out.print(x);
			x=x+n-j;
		}
		System.out.println();
	}
}
}
