import java.util.*;
class p6
{
	int bin(int a)
	{  int r;
	String x=" ";
		while(a>0)
		{r=a%2;
		x=r+x;
		a=a/2;}
		return Integer.parseInt(x.substring(0,x.length()-1));
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList <Integer> arr=new ArrayList<>();
		int s=0,n=1,r,a=0;
		String[] s1=sc.nextLine().split(" ");
		p6 p=new p6();
			for(int i=0;i<s1.length;i++)
			{arr.add(Integer.parseInt(s1[i]));	
			s=s+p.bin(arr.get(i));
			}
			while(s>0)
			{
				r=(s%10)%3;
				a=a+r*n;
				s=s/10;
				n=n*10;
			}
			System.out.println(Integer.parseInt(Integer.toString(a),2));
		sc.close();
	}
}