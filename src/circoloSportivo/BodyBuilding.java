package circoloSportivo;

/**
 * <h1>Classe BodyBuilding</h1>
 * La classe rappresenta la disciplina Body Building,
 * ereditando dalla classe astratta {@link Disciplina}.
 * 
 * @author Leonardo Chirivì
 * @see Disciplina
 */
public class BodyBuilding extends Disciplina {
	
	/**
	 * categoria di pesi
	 */
	private String peso;

	/**
	 * <h1>Costruttore classe BodyBuilding</h1> 
	 * Richiama il costruttore della classe base {@link Disciplina}.
	 * 
	 * @param peso categoria di peso
	 * @param mensile costo quota mensile
	 * @param annuale costo quota annuale
	 * @param nome nome del socio
	 */
	public BodyBuilding(String peso, float mensile, float annuale, String nome) {
		
		super(mensile, annuale, nome);
		this.peso = peso;
		
	}

	/**
	 * Ritorna la categoria di pesi di questa disciplina
	 * 
	 * @return categoria di peso
	 */
	public String getPeso() {
		return peso;
	}

	/**
	 * Permette di impostare la categoria di peso
	 * 
	 * @param peso nuova categoria da impostare
	 */
	public void setPeso(String peso) {
		this.peso = peso;
	}
	
}
