package h3;

public class H3_main {

	public static void main(String[] args) {
		int max = 5;
		int fix = 2;
		int wartend = 12;
		boolean istVoll = false;
		
		while (wartend > 0 && fix < max) {
            fix++;
            wartend--;
        }
        
        
        if (fix == max) {
            istVoll = true;
        } else {
            istVoll = false;
        }

		System.out.println("fix " + fix + " wartend " + wartend);
	}


}