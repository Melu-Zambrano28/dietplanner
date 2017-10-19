package classi;
import java.util.ArrayList;

public class Dieta {
	private String nome;
	private String descrizione;
	private ArrayList<Prodotto>elencoSpesa;
	
	public Dieta() {
		elencoSpesa= new ArrayList<Prodotto>();
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public ArrayList<Prodotto> getElencoSpesa() {
		return elencoSpesa;
	}

	public void setElencoSpesa(ArrayList<Prodotto> elencoSpesa) {
		this.elencoSpesa = elencoSpesa;
	}
	
	//mtodo add ???? database;
	
	public void addProdotto(Prodotto p) {
		elencoSpesa.add(p);
	}
	
	public void StampaListaProdotti() {
		for(int i=0; i<elencoSpesa.size(); i++) {
			System.out.println((i+1)+". "+elencoSpesa.get(i).toString());
		}
		
	}
	


}
