package circoloSportivo;

/**
 * <h1>Classe socio</h1>
 * <p>
 * Classe rappresentate il socio di una società sportiva.
 * Ogni socio è caratteizzato da un {@link nome}, un {@link cognome} e un {@link cf}. 
 * Inoltre è presente un riferimento alla classe {@link CircoloSportivo}.
 *  
 * @author Leonardo Chirivì
 *
 */
public class Socio {
	
	/**
	 * Nome del socio
	 */
	private String nome;
	
	/**
	 * Cognome del socio
	 */
	private String cognome;
	
	/**
	 * Codice Fiscale del socio
	 */
	private String cf;
	
	/**
	 * Array contente le discipline praticate dal socio.</br>
	 * Ogni socio può praticare al massimo tre discipline contemporaneamente
	 */
	private Disciplina[] discipline = new Disciplina[3];
	
	/**
	 * <h1>Costruttore classe Socio</h1>
	 * 
	 * @param nome nome del socio
	 * @param cognome cognome del socio
	 * @param cf codice fiscale del socio
	 */
	public Socio( String nome, String cognome, String cf) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
		
	}
	
	/**
	 * Metodo per il calcolo della retta di ciascun socio
	 * Il metodo scorre le discipline praticate dal socio, contenute nell'array
	 * {@link discipline}, saltando le posizioni dell'array che hanno valore 
	 * <code>null</code>.
	 * <p>
	 * Per il calcolo della retta controllo se per ogni disciplina il socio 
	 * è iscritto annualmente oppure mensilmente, grazie al parametro isAnnuale.
	 * A seconda dell'iscrizione chiamo il metodo {@link Disciplina#getAnnuale()} oppure
	 * {@link Disciplina#getMensile()}.
	 * <p>
	 * Se il socio non è iscritto al circolo si otterrà il messaggio "Non iscritto"
	 * 
	 * @param isAnnuale valore booleano per determinare se l'iscrizione è annuale
	 * @return l'ammontare da pagare
	 */
	public double calcoloRetta(  boolean isAnnuale ) {
		return 0.0;
	}
	
	/**
	 * Ritorna il nome del socio
	 * 
	 * @return nome del socio
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Permette di moificare il nome del socio
	 * 
	 * @param nome nuovo nome da inserire
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Restituisce il cognome del socio
	 * 
	 * @return cognome del socio
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * Permette di modificare il cognome del socio
	 * 
	 * @param cognome nuovo cognome da inserire
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	/**
	 * Restituisce il codice fiscale del socio
	 * 
	 * @return codice fiscale del socio
	 */
	public String getCf() {
		return cf;
	}

	/**
	 * Permette di modificare il codice fiscale del socio
	 * 
	 * @param cf nuovo codice fiscale da inserire 
	 */
	public void setCf(String cf) {
		this.cf = cf;
	}
	
	/**
	 * Permette di agguingere all array {@link Socio#discipline} le discipline alle quali il socio si iscrive.
	 * 
	 * @param d disciplina da aggiungere
	 */
	public void aggiungiDisciplina( Disciplina d ) {
		
	}
	
	/**
	 * Permette di rimuovere dall array {@link Socio#discipline} la disciplina che il socio 
	 * non intende più praticare.
	 * 
	 * @param d disciplina da rimuovere
	 */
	public void rimuoviDisciplina( Disciplina d ) {
		
	}
	
}
