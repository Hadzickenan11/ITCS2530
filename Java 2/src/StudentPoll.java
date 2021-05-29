 import java.io.File;
 import java.io.FileNotFoundException;
 import java.util.Formatter;
 import java.util.FormatterClosedException;
 import java.util.IllegalFormatException;
 import java.util.NoSuchElementException;
 import java.util.Scanner;

 public class StudentPoll
 {
 public void displayData()
 {
 int frequency[] = new int[ 11 ];

 Formatter writer = null;
 Scanner pollNumbers = null;

 try
 {
 pollNumbers = new Scanner(
 new File( "numbers.txt" ) );

 writer = new Formatter( "output.txt" );

 writer.format( "%-12s%-12s\n", "Rating", "Frequency" );

 
 while ( pollNumbers.hasNext() )
 ++frequency[ pollNumbers.nextInt() ];

 
 for ( int rating = 1; rating < frequency.length; rating++ )
 writer.format( "%-12d%-12d\n", rating, frequency[ rating ] );
 }
 catch ( FileNotFoundException fileNotFoundException )
 {
 System.err.println( "Error: Files cannot be opened." );
 }
 catch ( FormatterClosedException formatterClosedException )
 {
 System.err.println( "Error: Output file is closed." );
 } 
 catch ( SecurityException securityException )
 {
 System.err.println( "Error opening file for writing." );
 } 
 catch ( IllegalFormatException illegalFormatException )
 {
 System.err.println( "Error writing data to file." );
 } 
 catch ( NoSuchElementException noSuchElementException )
 {
 System.err.println( "Error reading from file." );
 } 
 catch ( IllegalStateException illegalStateException )
 {
 System.err.println( "Error: Input file is closed." );
 } 
 finally
 {
 if ( writer != null )
 writer.close();

 if ( pollNumbers != null )
 pollNumbers.close();
 } 
 }
 }