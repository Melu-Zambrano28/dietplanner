package classi;

public class Prodotto {
	private String nome;
	private String descrizione;
	private CategoriaProdotto categoria;
	private double calorie;
	private boolean contieneGlutine;
	private boolean contieneLattosio;
	
	public Prodotto() {
		
	}
	
	
	
	public Prodotto(String nome, String descrizione, double calorie,CategoriaProdotto categoria,
					boolean intolleranzaGlutine, boolean intollerazaLattosio) {
		super();
		this.nome = nome;
		this.descrizione = descrizione;
		this.categoria = categoria;
		this.calorie = calorie;
		this.contieneGlutine = intolleranzaGlutine;
		this.contieneLattosio = intollerazaLattosio;
	}



	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public CategoriaProdotto getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaProdotto categoria) {
		this.categoria = categoria;
	}

	public double getCalorie() {
		return calorie;
	}

	public void setCalorie(double calorie) {
		this.calorie = calorie;
	}

	public boolean iscontieneGlutine() {
		return contieneGlutine;
	}

	public void setContieneGlutine(boolean intolleranzaGlutine) {
		this.contieneGlutine = intolleranzaGlutine;
	}

	public boolean isContieneLattosio() {
		return contieneLattosio;
	}

	public void setContieneLattosio(boolean intollerazaLattosio) {
		this.contieneLattosio = intollerazaLattosio;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	private String controlloIntolleranza() {
		if(this.iscontieneGlutine()&& this.isContieneLattosio())
			return "Glutine e lattosio";
		if(this.iscontieneGlutine())
			return "Gutine";
		if(this.isContieneLattosio())
			return "Lattosio";
		return "Nessuno";
	}
	
	
	
	public String toString() {
		return "Nome: "+this.getNome()+"\r\nCategorie: "+this.getCategoria()+"\r\nCalorie: "+this.getCalorie()+"\r\nDescrizione: "+this.getDescrizione()+"\r\nContiene: "+this.controlloIntolleranza()+"\r\n";
		
	}

}
