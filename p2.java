import java.util.*;
class p2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a,b,c values: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int or=a|b;
		int res=0;
		if(or==c)
			res=0;
		else
			{
			char[] binary_or=Integer.toBinaryString(or).toCharArray();
			char[] binary_c=Integer.toBinaryString(c).toCharArray();
			for(int i=0;i<binary_c.length;i++)
				if(binary_or[i]!=binary_c[i])
					if(binary_or[i]=='1' && binary_c[i]=='0')
						res=res+2;
					else if(binary_or[i]=='0' && binary_c[i]=='1')
						res=res+1;
			System.out.println(res);		
			}
		sc.close();	
	}
}