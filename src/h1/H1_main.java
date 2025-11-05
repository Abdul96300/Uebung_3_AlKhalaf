package h1;

public class H1_main {

	public static void main(String[] args) {
		
		double guthaben = -100;
		double monEingang = 200;
		int rating = -2;
		boolean warnhinweis;
		boolean negativ;
		double betrag_guthaben = guthaben;
		
		if (guthaben < 0) {
			betrag_guthaben = -1 * (guthaben);
		}
		if ( guthaben < 0) {
			negativ = true;
		} else {
			negativ = false;
		}
		if ( guthaben > 0 ) {
			rating += 3;
		}
		if ( guthaben == 0) {
			rating += 2;
		}
		if ( guthaben < 0 && monEingang >= betrag_guthaben) {
			rating += 1;
		}
		if ( guthaben < 0 && monEingang < betrag_guthaben ) {
			rating -= 1;
		}
		if ( guthaben < 0 && monEingang < betrag_guthaben && rating < 0) {
			warnhinweis = true;
		} else {
			warnhinweis = false;
		}
		
		System.out.println( guthaben );
		System.out.println( monEingang );
		System.out.println( rating );
		System.out.println( negativ);
		System.out.println( warnhinweis );
		System.out.println(betrag_guthaben);

	}

}
