package logic;

public class diamond5 {
	public static void main(String[] args) {
		int n=7;
		int star=7;
		int space=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			} 
			for(int k=1;k<=star;k++)
			{
				if(k%2==0)
				System.out.print("1");
				else
					System.out.print(" ");
			}
			System.out.println();
			if(i<=n/2)
			{
				star = star-2;
				space++;
			}
			else{
				star=star+2;
				space--;
			}
		}
	}

}
