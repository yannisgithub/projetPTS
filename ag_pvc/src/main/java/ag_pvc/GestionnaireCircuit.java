package ag_pvc;

import java.util.ArrayList;

public class GestionnaireCircuit {

	ArrayList<Ville> villesDestinations = new ArrayList<Ville>();
			   
			   public void ajouterVille(Ville ville) {
			      this.villesDestinations.add(ville);
				}
	
			   public Ville getVille(int index) {
			      return this.villesDestinations.get(index);
			   }
			   
			   
			   
			   public int nombreVilles() {
			      return this.villesDestinations.size();
			    		  }
			    		  
}
