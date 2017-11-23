package de.unistuttgart.iaas.pse.ex03.p1;


public class GeometryFunctions {

	/*
	 * Berechnet den Kreisumfang eines Kreises mit gegebenem Radius.
	 * @param r Der Radius des Kreises.
	 * @return Den Umfang des Kreises.
	 */
	public static double computeCircumference(double r) throws Exception {
		if (r < 0) {

			throw new Exception();
		} // end of if
		double a = 2 * Math.PI * r;
		return a;
	}

	/*
	 * Berechnet die Hypotenuse eines rechtwinkligen Dreiecks mit gegebener
	 * Kathete und Ankathete.
	 * @param a Eine Seite des Dreiecks.
	 * @param b Eine andere Seite des Dreiecks. 
	 * @return Die Länge der dritten Seite.
	 */
	public static double pythagorenTheorem(int a, int b) {
		if (a < 0 || b < 0) {
			return -1;
		} // end of if
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return c;
	}
  
	public static void main(String[] args) {
		// To test
		try {
			System.out.println(computeCircumference(-1));
		} catch (Exception e) {
			System.out.println("Es gibt keinen Kreis mit negativem Radius!");
		}
		try {
			System.out.println(computeCircumference(4));
		} catch (Exception e) {
			System.out.println("Es gibt keinen Kreis mit negativem Radius!");
		}
		System.out.println(pythagorenTheorem(2, 3));
	}
}
