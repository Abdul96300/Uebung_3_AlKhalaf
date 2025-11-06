package h1;

public class H1_main {

	public static void main(String[] args) {
		
		double guthaben = 100;
		double monEingang = 200;
		int rating = -2;
		boolean warnhinweis = true;
		boolean negativ = false;
		double betrag_guthaben = guthaben;
		
		
		

		

		if (guthaben > 0) {
			rating +=3;
			negativ = false;
		} else if ( guthaben == 0) {
			rating += 2;
			negativ = false;
		} else {
			negativ =true;
			betrag_guthaben = Math.abs(guthaben); //Erster bis Dritter Punkt Rating

			if ( monEingang >= betrag_guthaben) {
				rating += 1;
			} //Vierter Punkt Rating 1
			else {
				rating -=  1;
			}// Fünfter Punkt Rating -1
		} 

		
		if ( guthaben < 0 && monEingang < betrag_guthaben && rating < 0) {
			warnhinweis = true;
		} else {
			warnhinweis = false;
		} //Letzter Punkt Warnhinweis
		
		//System.out.println( "Guthaben " + guthaben );
		//System.out.println( "moneingang" + monEingang );
		//System.out.println(  "rating " + rating );
		//System.out.println( "negativ " + negativ);
		//System.out.println( "warnhinweis "+warnhinweis );
		//System.out.println("betrag guthaben " + betrag_guthaben);
		

	}

}
