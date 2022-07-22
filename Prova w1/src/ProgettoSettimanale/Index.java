package ProgettoSettimanale;

import java.util.Scanner;

public class Index {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
//ANDIAMO A DEFINIRE UN ARRAY DI MEDIA CHE DEVE CONTENERE I NOSTRI OGGETTI CREATI
		Media[] m = new Media[5];
		// ANDIAMO A LANCIARE IL METODO PER POPOLARE L'ARRAY
		creazioneArray(m);
		
		scegliMedia(m);

	}

	
	public static void creazioneArray(Media[] m) {
		
		
		for (int i = 0; i < (m.length - 1); i++) {
			
			System.out.println("creazione oggetto multimediale n:" + (i + 1) + "/5");
			System.out.println("Seleziona la tipologia");
			System.out.println("(1=audio)");
			System.out.println("(2=video)");
			System.out.println("(3=immagine)");
			
			
			int tipologia = Integer.parseInt(scanner.nextLine());
			
			
			if (tipologia == 1) {
				
				System.out.println("Inserisci il titolo del brano");
				
				String titolo = scanner.nextLine();
				
				
				System.out.println("inserisci il volume");
				int volume = Integer.parseInt(scanner.nextLine());
				System.out.println("inserisci la durata");
				int durata = Integer.parseInt(scanner.nextLine());
				
				Audio x = new Audio(titolo, volume, durata);
				
				m[i] = x;
			} else if (tipologia == 2) {
				
				System.out.println("Inserisci il titolo del video");
				String titolo = scanner.nextLine();
				System.out.println("inserisci la luminosità");
				int lum = Integer.parseInt(scanner.nextLine());
				System.out.println("inserisci la durata");
				int durata = Integer.parseInt(scanner.nextLine());
				System.out.println("inserisci il Volume");
				int volume = Integer.parseInt(scanner.nextLine());
				Video x = new Video(titolo, lum, durata, volume);
				m[i] = x;
			} else {
				System.out.println("Inserisci il titolo dell'immagine");
				String titolo = scanner.nextLine();
				System.out.println("inserisci la luminosità");
				int lum = Integer.parseInt(scanner.nextLine());
				Immagine x = new Immagine(titolo, lum);
				m[i] = x;

			}

		}

	}

	// DEFINIAMO ADESSO IL METODO SCEGLI MEDIA, OVVERO IL METODO CHE TRAMITE UN
	// CICLO DO-WHILE, DA LA POSSIBILITà ALL'UTILIZZATORE DI "RIPRODURRE" UN
	// DETERMINATO MEDIA
	public static void scegliMedia(Media[] m) {
		
		int elementoMedia = 0;
		
		do {
			System.out
					.println("Cosa vuoi riprodurre? digita un numero da 1 a 5 oppure 0 per terminare la riproduzione");
			elementoMedia = Integer.parseInt(scanner.nextLine());
			
			int el = elementoMedia -1;

	
			

			if (elementoMedia == 0) {
				System.out.println("riproduzione terminata");
			}

			else if (m[el] instanceof Immagine && el > -1) {
				m[el].show();
			}

			else if (m[el] instanceof Audio || m[el] instanceof Video) {
				m[el].play();
			}
		} while (elementoMedia != 0);
	}
}
