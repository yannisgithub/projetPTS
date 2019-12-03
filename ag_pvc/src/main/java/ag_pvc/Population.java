package ag_pvc;

import java.util.ArrayList;

public class Population {
	
private ArrayList<Circuit> circuits = new ArrayList<Circuit>();

	// une population est un ensemble d'individus ( un ensemble de circuit )

	 public Population(GestionnaireCircuit gestionnaireCircuit, int taillePopulation) {
		 
	      for(int i=0;i<taillePopulation;i++) {
	              Circuit nouveauCircuit = new Circuit(gestionnaireCircuit);
	              nouveauCircuit.genererIndividu();
	              this.sauvegarderCircuit(i, nouveauCircuit);
	      }
	 }
	 
	
	public Circuit getCircuit(int i) {
	      return this.circuits.get(i);
	}
	 
	public void sauvegarderCircuit(int index, Circuit circuit) {
	      this.circuits.add(index, circuit);
	}
	
	 public Circuit getFittest() {
	      Circuit fittest = this.circuits.get(0);
	      for(int i=0;i<this.taillePopulation();i++){
	         if(fittest.getFitness() <= this.getCircuit(i).getFitness()){
	            fittest = this.getCircuit(i);
	            }
	         }
	      return fittest;
	 }
	 
	   public int taillePopulation() {
	      return this.circuits.size();
	   }
	    		  
}
