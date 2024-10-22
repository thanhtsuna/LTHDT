package JAVA;

import java.util.Scanner;

public class BAI3 {
  public static void main(String[] args) {
	  char kitu;
	  Scanner keyboard = new Scanner(System.in);
	  System.out.print("nhap vao ki tu :");
	  kitu = keyboard.next().charAt(0);
	  System.out.println("mã ASCII  của"+kitu+"la"+(byte)kitu);
  }
}
