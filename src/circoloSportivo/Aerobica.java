package circoloSportivo;

/**
 * <h1>Classe Aerobica</h1>
 * La classe rappresenta la classe Aerobica, ereditando dalla classe {@link Disciplina}.
 * 
 * @author leonardo
 * @see Disciplina
 */
public class Aerobica extends Disciplina{

	/**
	 * Codice identificativo del corso
	 */
	private String codiceCorso;

	/**
	 * <h1>Costruttore classe Aerobica</h1>
	 * Richiama il costruttore della classe base {@link Disciplina}
	 * 
	 * @param mensile2 costo quota mensile 
	 * @param annuale2 costo quota annuale 
	 * @param nome2 nome del socio
	 * @param codiceCorso codice identificativo del corso
	 */
	public Aerobica(float mensile2, float annuale2, String nome2, String codiceCorso) {
	
		super(mensile2, annuale2, nome2);
		this.codiceCorso = codiceCorso;
		
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
	 * Permette di modificare il codice del corso impostandone uno nuovo.
	 * 
	 * @param codiceCorso nuovo codice da sostituire
	 */
	public void setCodiceCorso(String codiceCorso) {
		this.codiceCorso = codiceCorso;
	}
	
}
