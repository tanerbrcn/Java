package Lesson2Examples;

import java.security.PublicKey;

public class ParameterizedMethods {

	public static void main(String[] args) {
		
		String message ="Bugün hava çok güzel.";
		String newMessage=message.substring(0,2);
		System.out.println(newMessage);
	}

	public static void add() {
		System.out.println("Eklendi");
	}

	public static void delete() {
		System.out.println("Silindi");
	}

	public static void update() {
		System.out.println("Güncellendi");
	}

}
