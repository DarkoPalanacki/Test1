package zadatak;

public class Cetvr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		
		for (double i = -1; i<1.5; i+= 0.25){
			if (i%0.25 == 0){
				counter++;
				System.out.println("Gde se trenutno nalazim " + i);
			}
		}
		
		System.out.println("Cetvrtina ima: " + counter);
		
		
	}
	
	

}
