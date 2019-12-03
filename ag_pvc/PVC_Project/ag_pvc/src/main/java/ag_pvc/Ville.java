package ag_pvc;

public class Ville {
	
	private double lon;
	private double lat;
	private String nom;
	private double distanceX;
	private double distanceY;
	private double distance;
	
		public Ville() {
			this.lon=0;
			this.lat=0;
			this.nom="default";
		}
		
		public Ville(double lon,double lat,String nom){
		      this.lon = lon;
		      this.lat = lat;
		      this.nom = nom;
		}
	 

	   public double distance(Ville ville) {
		   
	      distanceX = (ville.lon-this.lon)*40000*Math.cos((this.lat+ville.lat)*Math.PI/360)/360;
	    	  distanceY = (this.lat-ville.lat)*40000/360;
	    	  distance = Math.sqrt( (distanceX*distanceX) + (distanceY*distanceY) );
	      
	      return distance;
	    		
	   }
	   
}