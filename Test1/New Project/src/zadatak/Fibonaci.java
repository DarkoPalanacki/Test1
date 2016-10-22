package zadatak;

import java.util.Scanner;

public class Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0;
		int y = 1;
		int z = 0;
		
		System.out.println("Unesite broj za Fib : ");
		 Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
		
		for (int i=1; i<n; i++){
			z =x+y;
			x=y;
			y=z;
		}
		
		System.out.println("Bibonacijev broj je: " + z);
		System.out.println(z);
	}

}
