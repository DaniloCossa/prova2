/**
 * CossaDaniloClass
 * 
 * @author <b>Cossa Danilo</b> <u>4BI</u> <i>04/05/2022</i>
 * @version 1
 *
 */
public class CossaDaniloClass {
	/**
	 * 
	 * Costruttore della classe CossaDaniloClass
	 * 
	 */
	public CossaDaniloClass() { 
		
	} 
	
	/**
	 * Metodo che calcola la sommatoria da f a 0
	 * @param f valore massimo della sommatoria
	 * @return risultato che viene ritornato dalla funzione
	 * 
	 * PRIMO ERRORE: r va inizializzato a 0
	 * 
	 * SECONDO ERRORE: la prima condizione del ciclo for i deve essere uguale a 0
	 * 				   la seconda condizione i<=f per andare da 0 a f
	 * 
	 * TERZO ERRORE: r+=i, non *
	 */
	
	public int cossaMet(int f) {
		int r = 0;
		for(int i=0; i<=f; i++) {
			r+=i;
		}
		return r;
	}
	
	/**
	 * metodo main
	 * @param args
	 */
	
	public static void main(String[] args) {
		CossaDaniloClass f = new CossaDaniloClass();
		System.out.println(f.cossaMet(5));
	}
}