import java.util.Scanner;
   
	public class exp143
	{
	   public static void main( String args[] )
	   {
	   
		 
		 Scanner scan = new Scanner(System.in);
		 
		 
		  System.out.print("Enter your first string: ");
		  String s1 = scan.next();

		  System.out.print("Enter your second string: ");
		  String s2 = scan.next();
		 
		  System.out.printf( "s1 == s is " + (s1 == s2));
		  
		 

		 
		  if ( s1.equals( s2 )) 
		  System.out.printf( "\n%s and %s are equal\n",s1 ,s2 );
		  else
		 System.out.printf( "\n%s and %s are not equal\n",s1 ,s2 );


		
		  System.out.printf(
		 "\ns1.compareTo( s2 ) is %d", s1.compareTo( s2 ));
		  System.out.printf(
		 "\ns2.compareTo( s1 ) is %d", s2.compareTo( s1 ));
		  System.out.printf(
		 "\ns1.compareTo( s1 ) is %d\n\n", s1.compareTo( s1 ));

		 }
	  }