package circoloSportivo;

/**
 * <h1>Classe Nuoto</h1>
 * La classe rappresenta la disciplina nuoto, ereditando dalla classe {@link Disciplina}.
 * 
 * @author Leonardo Chirivì
 * @see Disciplina
 */
public class Nuoto extends Disciplina{

	/**
	 * Codice relativo al corso da seguire
	 */
	private String codiceCorso; 
	
	/**
	 * Corsia riservata per seguire il corso
	 */
	public int corsia;
	
	/**
	 * <h1>Costruttore classe Nuoto</h1>
	 * Richiama il costruttore della classe base {@link Disciplina}.
	 * 
	 * @param mensile2 costo quota mensile
	 * @param annuale2 costo quota annuale
	 * @param nome2 nome del socio
	 * @param codiceCorso codice identificativo del corso
	 * @param corsia corsia riservata per il corso
	 */
	public Nuoto(float mensile2, float annuale2, String nome2, String codiceCorso, int corsia) {
	
		super(mensile2, annuale2, nome2);
		this.codiceCorso = codiceCorso;
		this.corsia = corsia;
	
	}

	/**
	 * Ritorna il codice identificativo del corso
	 * 
	 * @return codice del corso
	 */
	public String getCodiceCorso() {
		return codiceCorso;
	}

	/**
	 * Permette di impostare il codice del corso
	 * 
	 * @param codiceCorso nuovo codice da impostare
	 */
	public void setCodiceCorso(String codiceCorso) {
		this.codiceCorso = codiceCorso;
	}
	
}
