package zadatak;

public class vreme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ukupno = 3662;
		int sec;
		int cas;
		int minuti;
		
		
		cas = ukupno / 3600;
		
		ukupno = ukupno % 3600;
		
		minuti = ukupno / 60;
		
		sec = ukupno % 60;
		
		System.out.println("Vreme je: "+cas+"h "+minuti+"m "+sec+"s");
		
	}
}
