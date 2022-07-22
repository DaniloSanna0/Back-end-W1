package ProgettoSettimanale;
//DEFINIAMO UNA CLASSE IMMAGINE PER GENERARE FILE "IMMAGINE"
public class Immagine extends Media implements Visualizza{
	
	int lumix;
	
	public Immagine(String titolo, int l) {
		super(titolo);
		lumix =l;
	}

	
	@Override
	//DEFINIAMO UN METODO PER "MOSTRARE" L'IMMAGINE IN CONSOLE
	public void show() {
		
		for(int i=0; i<lumix; i++) {
			lux += "*";
		}
		
		System.out.println("Immagine:"+titolo+" "+lux);
		
	}

	@Override
	//DEFINIAMO I METODI BASE DETTATI DELL'INTERFACCIA, COMUNQUE ANCHESSI, ABBASTANZA DESCRITTIVI 
	public void AumentaL() {
		lumix++;
		
	}

	@Override
	public void DiminuisciL() {
		lumix--;
		
	}

}
