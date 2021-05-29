import java.util.Scanner;

public class exp144 {
    public static void main(String[] args) {

       
          Scanner input = new Scanner(System.in);
            int firstIndex;
            int secondIndex;

            System.out.print("Enter First String:"); 
                String stringNumberOne = input.nextLine();
            System.out.print("Enter Second String:");
                String stringNumberTwo = input.nextLine();


            System.out.print("Enter Starting Index for First String:"); 
                 firstIndex = input.nextInt();
            System.out.print("Enter Starting Index for Second String:"); 
                 secondIndex = input.nextInt(); 
            System.out.print("Enter Number of Characters to be Compared:"); 
                int numberCompared = input.nextInt(); 

            boolean results = stringNumberOne.regionMatches(firstIndex,
                    stringNumberTwo, secondIndex, numberCompared);   

            System.out.println(results);
    }
}