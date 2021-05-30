#include <iostream>  //Spent a lot of time figuring out how to get the a compiler to work on OSX.

int main()
{
	std::cout << "******************************************************" << std::endl;
	std::cout <<  "************Welcome to my First Program!**************" << std::endl;  //wondering if theres a better way to insert the text between the stars
	std::cout << "It converts a large number of seconds into hours, minutes, and seconds!"<< std::endl; //wanted to change the verbiage a bit to show it's my work
	std::cout << "******************************************************" << std::endl;
	
	int sec; 
	int hours;
	int min;
	
	
	
	std::cout << "Please enter a large number of seconds: "; //Want to test this far first
	std::cin >> sec;
	
	min = sec / 60;  //Want to make sure it calculates correctly after testing input
	

	
	std::cout << "The number of Hours is: " << hours << std::endl;
	std::cout << "The number of Minutes is: " << min << std::endl;
	std::cout << "The number of Seconds is: " << sec;
	
	return 0;
	
}
