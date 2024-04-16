public class Nodo_Stringa
{
	// Questo è il valore conteuto in elemento
	String value;
	// Questo è il puntatore al prossimo elemento
	Nodo_Stringa next;
	
	/*
	 * Suggerimento:
	 * Per scorrere una lista si crea un elemento temporaneo (temp)
	 * di tipo Nodo_Stringa e ogni volta che si esegue l'istruzione 
	 * temp = temp.next, temp conterrà l'elemento successivo della lista
	 */ 	
	
	public Nodo_Stringa(String valore)
	{
		this.value = valore;
	}
}
