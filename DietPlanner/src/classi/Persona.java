package classi;

public class Persona {
	private String nome;
	private String cognome;
	private int eta;
	private double peso;
	private char sesso;
	private double altezza;
	private String intolleranza;
	
	public Persona() {
		
	}
	
	public Persona(String nome, String cognome, int eta, double peso, char sesso, double altezza, String intolleranza) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.peso = peso;
		this.sesso = sesso;
		this.altezza = altezza;
		this.intolleranza = intolleranza;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public int getEta() {
		return eta;
	}
	
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public char getSesso() {
		return sesso;
	}
	
	public void setSesso(char sesso) {
		this.sesso = sesso;
	}
	
	public double getAltezza() {
		return altezza;
	}
	
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	
	public String getIntolleranza() {
		return intolleranza;
	}
	
	public void setIntolleranza(String intolleranza) {
		this.intolleranza = intolleranza;
	}
	
	

}
