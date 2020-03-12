import java.util.*;
class p1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array:");
		ArrayList <Integer> array=new ArrayList <Integer> ();
		String arr[] = sc.nextLine().split(" "); 
		for(String i:arr)
			array.add(Integer.parseInt(i));
		System.out.println("Enter no. of query:");
		int noq=sc.nextInt();
		System.out.println("Enter the query:");
		int[][] query=new int[noq][2];
		for(int i=0;i<noq;i++)
			{query[i][0]=sc.nextInt();
			 query[i][1]=sc.nextInt();}
		ArrayList <Integer> result=new ArrayList<Integer>();
		int res;
		for(int i=0;i<noq;i++)
			{res=array.get(query[i][0]);
			for(int j=query[i][0]+1;j<=query[i][1];j++)
				res=res^array.get(j);
		result.add(res);}
		for(int i:result)
			System.out.print(i+" ");
		sc.close();
	}
}