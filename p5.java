import java.util.Scanner;
class p5
{
	int method(int a)
	{int c=0;
	while(a>0)
		{c=c+a&1;
		a=a>>1;}
	return c;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		p5 a=new p5();
		for(int i=0;i<=n;i++)
			System.out.print(a.method(i)+" ");	
		sc.close();
	}
}
