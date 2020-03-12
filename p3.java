import java.util.*;
class p3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList <Integer> arr=new ArrayList<>();
		HashMap <Integer,ArrayList<String>> h=new HashMap<Integer,ArrayList<String>> ();
		String[] s1=sc.nextLine().split(" ");
		String m="a",p;
		int max=0,c=0;
		for(int i=0;i<s1.length;i++)
			{arr.add(Integer.parseInt(s1[i]));
			 p=Integer.toBinaryString(arr.get(i));
			 if(!h.containsKey(p.length()))
			 	{ArrayList<String> x=new ArrayList<String>();
			     x.add(p);
				 h.put(p.length(),x );
			 	}
			 else
				 h.get(p.length()).add(p);
			if(max<p.length())
				{max=p.length();
				m=Integer.toBinaryString(arr.get(i));
			}
			}
			for(int i=0;i<m.length();i++)
				if(m.charAt(i)=='1')
					c++;
				else
					break;
			String z=m.substring(c,m.length());
			int r=0;
			for(int k=z.length();k>=0;k--)
			{for(String i:h.get(k))
				{if((Integer.parseInt(z)^Integer.parseInt(i))>r)
					r=Integer.parseInt(z)^Integer.parseInt(i);}
				if(h.containsKey(k))
					break;
				
			}
			System.out.println(Integer.parseInt(m.substring(0,c)+Integer.toString(r),2));
			sc.close();
	}
}