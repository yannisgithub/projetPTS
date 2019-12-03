package ag_pvc;

import java.util.ArrayList;
import java.util.Collections;

public class Circuit {
	
private GestionnaireCircuit gestionnaireCircuit = new GestionnaireCircuit();

private double fitness;
private double distance;
private ArrayList<Ville> circuit = new ArrayList<Ville>();
private double circuitDistance;
private Ville villeOrigine;
private Ville villeArrivee;

	public Circuit(GestionnaireCircuit gestionnaireCircuit) {
		this.gestionnaireCircuit = gestionnaireCircuit;
		this.circuit = circuit;
	    this.fitness = 0.0;
	    this.distance = 0;
	      
	   
	      }

	// Méthodes à rajouter
		
	public Ville getVille(int circuitPosition) {
	     return this.circuit.get(circuitPosition);
	}

	public void setVille(int circuitPosition, Ville ville) { // ici il avait mis fitness et distance a 0 mais c'est pas logique
		
		this.circuit.set(circuitPosition, ville);
		
	   }
	
	public int len() {
	      return this.circuit.size();
	}
	
	public void genererIndividu() {
	     for(int i=0; i<this.gestionnaireCircuit.nombreVilles(); i++) {
	        this.setVille(i, this.gestionnaireCircuit.getVille(i));
	        }
	     Collections.shuffle(this.circuit);
	}
	
	public double getDistance() {
	     if(this.distance == 0) {
	        circuitDistance = 0;
	        for(int indiceVille=0;indiceVille<this.len();indiceVille++){
	           villeOrigine = this.getVille(indiceVille);
	           villeArrivee = null;
	           if(indiceVille+1 < this.len()){
	              villeArrivee = this.getVille(indiceVille+1);
	           }
	           else{
	              villeArrivee = this.getVille(0);
	           }
	           circuitDistance += villeOrigine.distance(villeArrivee);
	        this.distance = circuitDistance;
	        		}
	        }
	     return this.distance;
	}
	
	public double getFitness() {
		if(this.fitness == 0){
			this.fitness = 1/(double)(this.getDistance());
		}
		return this.fitness;
	}
	
	public boolean contientVille(Ville ville) {
		if(this.circuit.contains(ville)) {
			return true;
		}
		else {
			return false;
		}
	     }
	   
}
