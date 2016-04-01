package circoloSportivo;

import java.util.ArrayList;

/**
 * <h1>Classe CircoloSportivo</h1>
 * La classe rappresenta il circolo sportivo al quale si iscrivono i membri
 * che intendono praticare le discipline offerte: {@link BodyBuilding}, {@link Nuoto} o {@link Aerobica}.
 * 
 * @author Leonardo Chirivì
 *
 */
public class CircoloSportivo {
	
	/**
	 * Nome de circolo sportivo
	 */
	public String nome;
	
	/**
	 * Lista contenente l'elenco degli iscritti al circolo.
	 * Non vi è limite al numero di soci.
	 * 
	 */
	private ArrayList<Socio> soci = new ArrayList<Socio>();
	
	/**
	 * <h1>Costruttore CircoloSportivo</h1>
	 * Il costruttore accetta come parametro una stringa contenente il nome
	 * da assegnare al circolo
	 * 
	 * @param nome nome del corcolo sportivo
	 */
	public CircoloSportivo( String nome ) {
		this.nome = nome;
	}
	
	/**
	 * Stampa l'elenco dei soci presenti nella lista {@link CircoloSportivo#soci}
	 */
	public void elencoIscritti() {
		
	}
	
	/**
	 * Itera la lista {@link CircoloSportivo#soci}, e per ogni {@link Socio}, vengono confrontate
	 * le discipine alle quali è iscritto, se la disciplina passata come parametro è
	 * presente tra quelle praticate dal socio, allora viene aggiunto il nome e cognome del socio
	 * all elenco da stampare.
	 * 
	 * @param disc disciplina della quale si vuole conoscere chi è iscritto
	 */
	public void elencoIscrittiPerDisciplina( String disc ) {
		
	}
	
	/**
	 * Permette di aggiungere un nuovo socio al circolo.
	 * Vengono usati i metodi relativi alla classe ArrayList.
	 * 
	 * @param s Socio da aggiungere all'elenco.
	 * @see java.util.ArrayList
	 */
	public void aggiungiSocio( Socio s ) {
		
	}
	
	/**
	 * Permette di rimuovere un socio dal circolo se quest'ultimo decide di lasciarlo.
	 * Vengono usati i metodi relativi alla classe ArrayList.
	 * 
	 * @param s Socio da rimuovere dall'elenco.
	 * @see java.util.ArrayList
	 */
	public void rimuoviSocio( Socio s ) {
		
	}
	
}
