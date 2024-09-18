import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: 
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Mad Libs!");
		System.out.println("What's your name?");
		String name = ("Give me a name: ");
		//flush
		in.nextLine();
		System.out.println("What year are we in");
		String year = ("Give me a year");
		in.nextInt();
		
		System.out.println("Give me a street: ");
		String street  = ("Give me a street: ");
		in.nextInt();
		//flush
		
		System.out.println("Give me a fast food restaurant");
		String restaurant = ("Give me a fast food restaurant");
		in.nextLine();
		System.out.println("One day, "+name+" rode around in they're "+year+" Dodge Charger Hellcat in "+street+" before turning in to the nearest "+restaurant+""!");
	}

}
