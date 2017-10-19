package classi;
import java.io.*;
import java.util.ArrayList;


public class FileDiet {
	
	
	// Listato 1. Creazione di un file vuoto
	public static void newFile(String pathFile) {
	    String path =pathFile;
	 
	    try {
	        File file = new File(path);
	         
	        if (file.exists())
	            System.out.println("Il file " + path + " esiste");
	        else if (file.createNewFile())
	            System.out.println("Il file " + path + " è stato creato");
	        else
	            System.out.println("Il file " + path + " non può essere creato");
	     
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	public static void scriveFile(ArrayList<Prodotto> p,String nomeFile) {
		  try
		     {
		          FileOutputStream prova = new FileOutputStream("C:\\Users\\Melu\\Desktop\\dieta\\"+nomeFile+".txt");
		          PrintStream scrivi = new PrintStream(prova);
		          for(int i=0;i<p.size();i++)
		          {
		                scrivi.println(p.get(i).toString());
		          }
		      }
		      catch (IOException e)
		      {
		          System.out.println("Errore: " + e);
		         
		      }
		
	}
	
	

}
