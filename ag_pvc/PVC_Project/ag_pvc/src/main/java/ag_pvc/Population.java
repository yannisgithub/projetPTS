package ag_pvc;

import java.util.ArrayList;

public class Population {
	
private ArrayList<Circuit> circuits = new ArrayList<Circuit>();

	// une population est un ensemble d'individus ( un ensemble de circuit )

	 public Population(GestionnaireCircuit gestionnaireCircuit, int taillePopulation) {
	      for i in range(0, taillePopulation) {
	         self.circuits.append(None)
	      }
	      if init:
	         for i in range(0, taillePopulation):
	            nouveauCircuit = Circuit(gestionnaireCircuit)
	            nouveauCircuit.genererIndividu()
	            self.sauvegarderCircuit(i, nouveauCircuit)

}
