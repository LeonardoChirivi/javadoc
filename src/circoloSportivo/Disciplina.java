package circoloSportivo;

/**
 * <h1>Classe Disciplina</h1>
 * La classe astratta Disciplina rappresenta la base per le tre discipline praticate
 * nel circolo.
 * 
 * @author Leonardo Chirivì
 * @see BodyBuilding
 * @see Nuoto
 * @see Aerobica
 */
public abstract class Disciplina {
	
	/**
	 * Quota mensile da pagare, viene inizializzata a 0 se
	 * il socio intende pagare annualmente.
	 */
	private float mensile;
	
	/**
	 * Quota annuale da pagare, viene inizializzata a 0 se
	 * il socio intende pagare mensilmente.
	 */
	private float annuale;
	
	/**
	 * Nome della disciplina
	 */
	public String nome;
	
	/**
	 * Costruttore astratto chiamato dalle classi figle
	 * 
	 * @param mensile2 valore retta mensie
	 * @param annuale2 valore retta annuale
	 * @param nome2 nome disciplina
	 */
	public Disciplina(float mensile2, float annuale2, String nome2) {
		mensile = mensile2;
		annuale = annuale2;
		nome = nome2;
	}

	/**
	 * Ritorna il valore della retta mensile
	 * 
	 * @return costo della retta mensile
	 */
	public float getMensile() {
		return mensile;
	}
	
	/**
	 * Imposta il costo della retta mensile
	 * 
	 * @param mensile nuovo prezzo da impostare
	 */
	public void setMensile(float mensile) {
		this.mensile = mensile;
	}
	
	/**
	 * Ritorna il valore della retta annuale
	 * 
	 * @return costo della retta annuale
	 */
	public float getAnnuale() {
		return annuale;
	}
	
	/**
	 * Imposta il costa della retta annuale
	 * 
	 * @param annuale nuovo prezzo da impostare
	 */
	public void setAnnuale(float annuale) {
		this.annuale = annuale;
	}
	
}
