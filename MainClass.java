package pms;
import java.util.Scanner;

import pms.Login_All.user;

public class MainClass {
	//KHASHAM KHAN
	private static Scanner reader;

	public static void main(String[] args) {
		String field;
		reader = new Scanner(System.in);
		Login_All l = new Login_All();
		System.out.println("Choose your field");
		System.out.println("1) Admin");
		System.out.println("2) Customer");
		System.out.println("3) Faculty");
		field = reader.nextLine();
		field = field.toLowerCase();
		user getfield =user.valueOf(field);
		
		l.login(getfield);
	}

}
