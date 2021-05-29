import java.io.*;
import java.util.Scanner;

public class PhoneNumber {

	
	public static void main(String[] args)

	{
		
		Scanner input = new Scanner(System.in);

		
		Character phoneNumbersInDigits[] = new Character[7];

		
		String userNumber;

		
		char[] two = { 'A', 'B', 'C' };
		char[] three = { 'D', 'E', 'F' };
		char[] four = { 'G', 'H', 'I' };
		char[] five = { 'J', 'K', 'L' };
		char[] six = { 'M', 'N', 'O' };
		char[] seven = { 'P', 'R', 'S' };
		char[] eight = { 'T', 'U', 'V' };
		char[] nine = { 'W', 'X', 'Y' };

		
		char charAt0[] = new char[3];
		char charAt1[] = new char[3];
		char charAt2[] = new char[3];
		char charAt3[] = new char[3];
		char charAt4[] = new char[3];
		char charAt5[] = new char[3];
		char charAt6[] = new char[3];

		
		int count = 0;

		
		System.out.print("Enter a Phone Number: ");
		userNumber = input.nextLine();

		
		for (int i = 0; i < userNumber.length(); i++) {
			if (i != 3) {
				if (!Character.isDigit(userNumber.charAt(i))) {
					System.out.println("Invalid phone number format ###-####, # is a digit");
					System.exit(0);
				}
			}

			if (userNumber.charAt(i) == '0' || userNumber.charAt(i) == '1'
					|| userNumber.charAt(3) != '-') {
				System.out.println("Invalid phone number with 0 or 1 or without '-' in correct position");
				System.exit(0);
			}
		}

		int index = 0;
		for (int i = 0; i < userNumber.length(); i++) {
			if (i == 3)
				continue;
			else {
				phoneNumbersInDigits[index] = userNumber.charAt(i);
				index++;
			}
		}

		

		if (phoneNumbersInDigits[0].equals('2'))
			System.arraycopy(two, 0, charAt0, 0, charAt0.length);
		else if (phoneNumbersInDigits[0].equals('3'))
			System.arraycopy(three, 0, charAt0, 0, charAt0.length);
		else if (phoneNumbersInDigits[0].equals('4'))
			System.arraycopy(four, 0, charAt0, 0, charAt0.length);
		else if (phoneNumbersInDigits[0].equals('5'))
			System.arraycopy(five, 0, charAt0, 0, charAt0.length);
		else if (phoneNumbersInDigits[0].equals('6'))
			System.arraycopy(six, 0, charAt0, 0, charAt0.length);
		else if (phoneNumbersInDigits[0].equals('7'))
			System.arraycopy(seven, 0, charAt0, 0, charAt0.length);
		else if (phoneNumbersInDigits[0].equals('8'))
			System.arraycopy(eight, 0, charAt0, 0, charAt0.length);
		else if (phoneNumbersInDigits[0].equals('9'))
			System.arraycopy(nine, 0, charAt0, 0, charAt0.length);

		

		if (phoneNumbersInDigits[1].equals('2'))
			System.arraycopy(two, 0, charAt1, 0, charAt1.length);
		else if (phoneNumbersInDigits[1].equals('3'))
			System.arraycopy(three, 0, charAt1, 0, charAt1.length);
		else if (phoneNumbersInDigits[1].equals('4'))
			System.arraycopy(four, 0, charAt1, 0, charAt1.length);
		else if (phoneNumbersInDigits[1].equals('5'))
			System.arraycopy(five, 0, charAt1, 0, charAt1.length);
		else if (phoneNumbersInDigits[1].equals('6'))
			System.arraycopy(six, 0, charAt1, 0, charAt1.length);
		else if (phoneNumbersInDigits[1].equals('7'))
			System.arraycopy(seven, 0, charAt1, 0, charAt1.length);
		else if (phoneNumbersInDigits[1].equals('8'))
			System.arraycopy(eight, 0, charAt1, 0, charAt1.length);
		else if (phoneNumbersInDigits[1].equals('9'))
			System.arraycopy(nine, 0, charAt1, 0, charAt1.length);

		

		if (phoneNumbersInDigits[2].equals('2'))
			System.arraycopy(two, 0, charAt2, 0, charAt2.length);
		else if (phoneNumbersInDigits[2].equals('3'))
			System.arraycopy(three, 0, charAt2, 0, charAt2.length);
		else if (phoneNumbersInDigits[2].equals('4'))
			System.arraycopy(four, 0, charAt2, 0, charAt2.length);
		else if (phoneNumbersInDigits[2].equals('5'))
			System.arraycopy(five, 0, charAt2, 0, charAt2.length);
		else if (phoneNumbersInDigits[2].equals('6'))
			System.arraycopy(six, 0, charAt2, 0, charAt2.length);
		else if (phoneNumbersInDigits[2].equals('7'))
			System.arraycopy(seven, 0, charAt2, 0, charAt2.length);
		else if (phoneNumbersInDigits[2].equals('8'))
			System.arraycopy(eight, 0, charAt2, 0, charAt2.length);
		else if (phoneNumbersInDigits[2].equals('9'))
			System.arraycopy(nine, 0, charAt2, 0, charAt2.length);

	

		if (phoneNumbersInDigits[3].equals('2'))
			System.arraycopy(two, 0, charAt3, 0, charAt3.length);
		else if (phoneNumbersInDigits[3].equals('3'))
			System.arraycopy(three, 0, charAt3, 0, charAt3.length);
		else if (phoneNumbersInDigits[3].equals('4'))
			System.arraycopy(four, 0, charAt3, 0, charAt3.length);
		else if (phoneNumbersInDigits[3].equals('5'))
			System.arraycopy(five, 0, charAt3, 0, charAt3.length);
		else if (phoneNumbersInDigits[3].equals('6'))
			System.arraycopy(six, 0, charAt3, 0, charAt3.length);
		else if (phoneNumbersInDigits[3].equals('7'))
			System.arraycopy(seven, 0, charAt3, 0, charAt3.length);
		else if (phoneNumbersInDigits[3].equals('8'))
			System.arraycopy(eight, 0, charAt3, 0, charAt3.length);
		else if (phoneNumbersInDigits[3].equals('9'))
			System.arraycopy(nine, 0, charAt3, 0, charAt3.length);


		if (phoneNumbersInDigits[4].equals('2'))
			System.arraycopy(two, 0, charAt4, 0, charAt4.length);
		else if (phoneNumbersInDigits[4].equals('3'))
			System.arraycopy(three, 0, charAt4, 0, charAt4.length);
		else if (phoneNumbersInDigits[4].equals('4'))
			System.arraycopy(four, 0, charAt4, 0, charAt4.length);
		else if (phoneNumbersInDigits[4].equals('5'))
			System.arraycopy(five, 0, charAt4, 0, charAt4.length);
		else if (phoneNumbersInDigits[4].equals('6'))
			System.arraycopy(six, 0, charAt4, 0, charAt4.length);
		else if (phoneNumbersInDigits[4].equals('7'))
			System.arraycopy(seven, 0, charAt4, 0, charAt4.length);
		else if (phoneNumbersInDigits[4].equals('8'))
			System.arraycopy(eight, 0, charAt4, 0, charAt4.length);
		else if (phoneNumbersInDigits[4].equals('9'))
			System.arraycopy(nine, 0, charAt4, 0, charAt4.length);


		if (phoneNumbersInDigits[5].equals('2'))
			System.arraycopy(two, 0, charAt5, 0, charAt5.length);
		else if (phoneNumbersInDigits[5].equals('3'))
			System.arraycopy(three, 0, charAt5, 0, charAt5.length);
		else if (phoneNumbersInDigits[5].equals('4'))
			System.arraycopy(four, 0, charAt5, 0, charAt5.length);
		else if (phoneNumbersInDigits[5].equals('5'))
			System.arraycopy(five, 0, charAt5, 0, charAt5.length);
		else if (phoneNumbersInDigits[5].equals('6'))
			System.arraycopy(six, 0, charAt5, 0, charAt5.length);
		else if (phoneNumbersInDigits[5].equals('7'))
			System.arraycopy(seven, 0, charAt5, 0, charAt5.length);
		else if (phoneNumbersInDigits[5].equals('8'))
			System.arraycopy(eight, 0, charAt5, 0, charAt5.length);
		else if (phoneNumbersInDigits[5].equals('9'))
			System.arraycopy(nine, 0, charAt5, 0, charAt5.length);

		

		if (phoneNumbersInDigits[6].equals('2'))
			System.arraycopy(two, 0, charAt6, 0, charAt6.length);
		else if (phoneNumbersInDigits[6].equals('3'))
			System.arraycopy(three, 0, charAt6, 0, charAt6.length);
		else if (phoneNumbersInDigits[6].equals('4'))
			System.arraycopy(four, 0, charAt6, 0, charAt6.length);
		else if (phoneNumbersInDigits[6].equals('5'))
			System.arraycopy(five, 0, charAt6, 0, charAt6.length);
		else if (phoneNumbersInDigits[6].equals('6'))
			System.arraycopy(six, 0, charAt6, 0, charAt6.length);
		else if (phoneNumbersInDigits[6].equals('7'))
			System.arraycopy(seven, 0, charAt6, 0, charAt6.length);
		else if (phoneNumbersInDigits[6].equals('8'))
			System.arraycopy(eight, 0, charAt6, 0, charAt6.length);
		else if (phoneNumbersInDigits[6].equals('9'))
			System.arraycopy(nine, 0, charAt6, 0, charAt6.length);

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				for (int k = 0; k < 3; k++) {

					for (int l = 0; l < 3; l++) {

						for (int m = 0; m < 3; m++) {

							for (int n = 0; n < 3; n++) {

								for (int o = 0; o < 3; o++) {

									if (count < 10 || count > 2176) {

										System.out.print(count + ": ");
										System.out.print(charAt0[i]);
										System.out.print(charAt1[j]);
										System.out.print(charAt2[k]);
										System.out.print(charAt3[l]);
										System.out.print(charAt4[m]);
										System.out.print(charAt5[n]);
										System.out.print(charAt6[o]);
										System.out.print('\n');
									}

									if (count == 2174)
										System.out.println("...");

									count++;

								}
							}
						}
					}
				}

			}

		}

	}
}