package eseguibile;
import classi.*;

public class ProgrammaPrincipale {

	public static void main(String[] args) {
	Prodotto p1 = new Prodotto("Pomodoro","Pachino grosso e grande",10.0,CategoriaProdotto.verdura,true,false);
	Dieta d1= new Dieta();
	d1.addProdotto(p1); //1
	d1.addProdotto(new Prodotto("mela","vero e grande",50.0,CategoriaProdotto.frutta,false,false));
	d1.addProdotto(new Prodotto("arancia"," grande",60.0,CategoriaProdotto.frutta,true,true));
	d1.StampaListaProdotti();
	
	FileDiet.newFile("C:\\Users\\Melu\\Desktop\\dieta");
	FileDiet.scriveFile(d1.getElencoSpesa(),"melissaFile1");
	
	}

}
