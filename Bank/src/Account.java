import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Account {
	static void Menue() { 
		
	Scanner scan = new Scanner(System.in);
	Scanner input = new Scanner(System.in);

	double Geld = 0;
	int Transaktion = 0;
	boolean repeat = true;
	
		
	while(repeat) {
		
			String Eingabe = scan.nextLine();
			
			switch(Eingabe) {
				case "1": System.out.println("Wieviel Geld möchten Sie einzahlen:");

						String EinzahlenString = input.nextLine();
						int Einzahlen = 0;
						
						try {
							Einzahlen = Integer.parseInt(EinzahlenString);}
						catch(Exception WrongInput) {							
						}

						if(Einzahlen > 0){
							Geld = Geld + Einzahlen;
							Transaktion = Einzahlen;
							System.out.println("===================================\n"
												+"Einzahlung erfolgreich: +" + Einzahlen +"€"
												+"\n===================================");
							}
						else{
							System.out.println("Bitte geben Sie eine positive Zahl ein!");
							Wait1();
							}
						Wait1();
						//Overlay2();
						Overlay();						
						break;
				case "2": System.out.println("Wieviel Geld möchten Sie abheben:");
				
						String AbhebenString = input.nextLine();
						int Abheben = 0;
						
						try {
							Abheben = Integer.parseInt(AbhebenString);}
						catch(Exception WrongInput) {							
						}
						
						if(Abheben > 0){
						Geld = Geld - Abheben;
						Transaktion = -Abheben;
						System.out.println("===================================\n"
								+"Abhebung erfolgreich: -" + Abheben +"€"
								+"\n===================================");
						}
						else {
							System.out.println("Bitte geben Sie eine positive Zahl ein!");
							Wait1();
						}
						Wait1();
						Overlay();						
						break;
				case "3": System.out.println("===========================\n"
						+"Ihr Kontostand: " + Geld +"€"
						+"\n===========================");
				
						Wait3();
						Overlay();
						break;
				case "4": if(Transaktion > 0){
					System.out.println("===================================\n"
							+"Ihre letzte Transaktion: +" + Transaktion +"€"
							+"\n===================================");
							}
						else if(Transaktion < 0){
							System.out.println("===================================\n"
									+"Ihre letzte Transaktion: " + Transaktion +"€"
									+"\n===================================");
									}
						else {
							System.out.println("=============================================\n"
									+"Sie haben noch keine Transaktion getätigt!"
									+"\n=============================================");
							
						}
						
						Wait3();
						Overlay();
						break;
				case "5": System.out.println("Error 404: Unresolved compilation problem");
						Wait3();
						Wait1();
						System.out.println("War nur ein Witz!");
						System.out.println("Auf Wiedersehen!");
						repeat = false;
						break;
				case "Hallo": System.out.println("Herzlich willkommen!");
							  Wait3();
							  break;
				
				default: System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 5 ein!");
						}
					
			


			}
		}

		
	
	static void Overlay() { 
		System.out.println(
				"-------------------------------------------\n"
				+ "Geben Sie die Zahl ein und bestätigen Sie mit Enter:\n"
				+ "1: Einzahlen\n"
				+ "2: Abheben\n"
				+ "3: Aktueller Kontostand\n"
				+ "4: Letzte Transaktion\n"
				+ "5: Beenden"
				);
	}
	static void Overlay2() {
		System.out.println("\n\nGeben Sie eine Zahl ein!");
	}
	static void Wait1() {
		try
		{TimeUnit.SECONDS.sleep(1);}
		catch(Exception e) {}
	}
	static void Wait3() {
		try
		{TimeUnit.SECONDS.sleep(2);}
		catch(Exception e) {}
	}
}
