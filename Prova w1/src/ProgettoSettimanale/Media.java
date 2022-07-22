package ProgettoSettimanale;
//CREAZIONE CLASSE PRINCIPALE ASTRATTA CON GLI ATTRIBUTI COMUNI A TUTTI GLI ELEMENTI
public abstract class Media {
	
	protected String titolo;
	
	public Media(String titolo) {
		
		this.titolo = titolo;
		
	}
	
	public void play(){};
	public void show(){};
}
