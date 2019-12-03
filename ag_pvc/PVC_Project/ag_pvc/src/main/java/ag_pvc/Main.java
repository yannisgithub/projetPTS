package ag_pvc;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GestionnaireCircuit gestionCircuit = new GestionnaireCircuit(); 
		
		
		   Ville ville1 = new Ville(2.287592, 48.862725, "Paris");
		   gestionCircuit.ajouterVille(ville1);
		   
		   Ville ville2 = new Ville(3.0635282,50.6365654, "Lille");
		   gestionCircuit.ajouterVille(ville2);
		   
		   Ville ville3 = new Ville(4.84699,45.7539, "Lyon");
		   gestionCircuit.ajouterVille(ville3);
		   
		   Ville ville4 = new Ville(5.3699525,43.2961743, "Marseille");
		   gestionCircuit.ajouterVille(ville4);
		   
		   Ville ville5 = new Ville(7.2683912,43.7009358, "Nice");
		   gestionCircuit.ajouterVille(ville5);

		   System.out.println(ville1.distance(ville2) + " kilometres.");
		   
		   
		   Circuit c1 = new Circuit(gestionCircuit);
		   c1.getVille(1);
		   
	}

}
