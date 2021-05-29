 import java.io.FileNotFoundException;
 import java.util.Formatter;
 import java.util.FormatterClosedException;
 import java.util.IllegalFormatException;
 import java.util.NoSuchElementException;
 import java.util.Scanner;

 public class CreateResults
 {
 private int getValue()
 {
 int result = -1;
 Scanner scanner = new Scanner( System.in );


 System.out.print("Enter integer result (1 - 10), -1 to quit: " );

 try
 {
 result = scanner.nextInt();
 } 
 catch ( NoSuchElementException noSuchElementException )
 {
 System.err.println( "Error with input." );
 System.exit( 1 );
 }

 return result;
 }

 private void outputData()
 {
 Formatter pollNumbers = null;

 try
 {

 pollNumbers = new Formatter( "numbers.txt" );

 int pollValue = getValue(); 


 while ( pollValue != -1 )
 {

 if ( pollValue > 0 && pollValue < 11 )


 pollNumbers.format( "%d\n", pollValue );

 pollValue = getValue(); 
 } 

 pollNumbers.close();
 }
 catch( SecurityException securityException )
 {
 System.err.println( "Error opening file." );
 } 
 catch( FileNotFoundException fileNotFoundException )
 {
 System.err.println( "Output file cannot be found." );
 } 
 catch( IllegalFormatException illegalFormatException )
 {
 System.err.println( "Error with the output's format." );
 }
 catch( FormatterClosedException formatterClosedException )
 {
 System.err.println( "File has been closed." );
 }
 finally
 {
 if ( pollNumbers != null )

 pollNumbers.close();
 } 
 } 

 public static void main( String args[] )
 {
 CreateResults application = new CreateResults();
 application.outputData();
 }
 }