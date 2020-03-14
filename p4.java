import java.util.Scanner;
class A{  
int result(int n) 
{ if (n == 1) 
       return 0; 
  else if (n % 2 == 0) 
       return (result(n/2)+1); 
  else
       return (1+Math.min(result(n-1),result(n+1))); 
} 
public static void main(String args[]) 
{  Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
A a=new A();
  System.out.println(a.result(n)); 
  sc.close();
} 
} 
