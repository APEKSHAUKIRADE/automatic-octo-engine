import java.util.Scanner;
class program2{  
    public static void main(String args[])  
    {
     Scanner sc = new Scanner(System.in);  
     System.out.println("Enter Number");
     
     int n1=0,n2=1,n3,i;    
     int n = sc.nextInt();
     System.out.print(n1+" "+n2);//printing 0 and 1    
     for(i=2;i<n;++i)//loop starts from 2 because 0 and 1 are already printed    
     {    
      n3=n1+n2;    
      System.out.print(" "+n3);    
      n1=n2;    
      n2=n3;    
     }    
      
    }}  