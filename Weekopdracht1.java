import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Weekopdracht1 {


	public static void main(String[] args) {
		System.out.println("Welkom bij het spel blackjack!");
		System.out.println("De kaarten zijn geschud:");
		int aantalkaarten = 0;
		int aantalpunten = 0;
		int kaartwaarde;
	
		String[] kaartsoorten = { "harten", "schoppen", "ruiten", "klaver" };
		String[] getallen = { "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw",
				"heer", "aas" };
		ArrayList<String> kaartspel = new ArrayList<>();
		
		int y = 0;
		while (y < 52) {
			Random kaartsoort = new Random();
			int k = kaartsoort.nextInt(kaartsoorten.length);
			Random cijfer = new Random();
			int g = cijfer.nextInt(getallen.length);
			if (!kaartspel.contains(kaartsoorten[k] + " " + getallen[g])) {
				kaartspel.add(kaartsoorten[k] + " " + getallen[g]);
				y += 1;
			}
			
			
			
		}
		System.out.println(String.join(",", kaartspel));
		int totaleKaartwaarde = 0;
		String gepaktekaarten = ""; 
		for (int i = 0; i < 10; ){ 
			if (kaartspel.get(i).equals("harten twee") || kaartspel.get(i).equals("ruiten twee") || kaartspel.get(i).equals("schoppen twee") || kaartspel.get(i).equals("klaver twee")){
				kaartwaarde = 2;
				System.out.println(kaartwaarde);
			}
			else if (kaartspel.get(i).equals("harten drie") || kaartspel.get(i).equals("ruiten drie") || kaartspel.get(i).equals("schoppen drie") || kaartspel.get(i).equals("klaver drie")){
				kaartwaarde = 3;
			}
			else if (kaartspel.get(i).equals("harten vier") || kaartspel.get(i).equals("ruiten vier") || kaartspel.get(i).equals("schoppen vier") || kaartspel.get(i).equals("klaver vier")){
				kaartwaarde = 4;
			}
			else if (kaartspel.get(i).equals("harten vijf") || kaartspel.get(i).equals("ruiten vijf") || kaartspel.get(i).equals("schoppen vijf") || kaartspel.get(i).equals("klaver vijf")){
				kaartwaarde = 5;
			}
			else if (kaartspel.get(i).equals("harten zes") || kaartspel.get(i).equals("ruiten zes") || kaartspel.get(i).equals("schoppen zes") || kaartspel.get(i).equals("klaver zes")){
				kaartwaarde = 6;
			}
			else if (kaartspel.get(i).equals("harten zeven") || kaartspel.get(i).equals("ruiten zeven") || kaartspel.get(i).equals("schoppen zeven") || kaartspel.get(i).equals("klaver zeven")){
				kaartwaarde = 7;
			}
			else if (kaartspel.get(i).equals("harten acht") || kaartspel.get(i).equals("ruiten acht") || kaartspel.get(i).equals("schoppen acht") || kaartspel.get(i).equals("klaver acht")){
				kaartwaarde = 8;
			}
			else if (kaartspel.get(i).equals("harten negen") || kaartspel.get(i).equals("ruiten negen") || kaartspel.get(i).equals("schoppen negen") || kaartspel.get(i).equals("klaver negen")){
				kaartwaarde = 9;
			}
			else if (kaartspel.get(i).equals("harten aas") || kaartspel.get(i).equals("ruiten aas") || kaartspel.get(i).equals("schoppen aas") || kaartspel.get(i).equals("klaver aas")){
				kaartwaarde = 11;
			}
			else {
				kaartwaarde = 10;
				
			}
		System.out.println("Speler 1. Voer k in om een kaart te krijgen, q om te stoppen en p om te passen");
		Scanner sc = new Scanner(System.in);
		String invoer = sc.nextLine();
		
		if (invoer.equals("k")) {
			aantalkaarten += 1;
			System.out.println("Je hebt een " + kaartspel.get(i) + " gepakt");
			System.out.println("Je hebt nu " + aantalkaarten + " kaarten.");
		
			gepaktekaarten += kaartspel.get(i) + ", "; 
			// gepaktekaarten.add(kaartspel.get(i));
			System.out.println("Je hebt de volgende kaarten gepakt: " + gepaktekaarten);
			totaleKaartwaarde += kaartwaarde;
			System.out.println("De kaarten hebben een waarde van " + totaleKaartwaarde);
			i += 1;
		} 
		else if (invoer.equals("q")) {
			System.out.println("Je bent gestopt. Dit was het einde van het spel");
			i = 10;
		} 
		else if (invoer.equals("p")) {
			System.out.println("Je hebt gepast. Dit zijn je gepakte kaarten: " + gepaktekaarten);
			System.out.println("De kaarten hebben een waarde van " + totaleKaartwaarde);
			i = 10;
		} 
		else {
			i = 10;
		}
		}
	
}
}
