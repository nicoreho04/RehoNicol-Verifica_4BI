/**
 * classe RehoNicoloCLass
 * @author <g>Reho Nicol�</g>
 * <U>4�BI</U> 
 * <i>13/05/2022</i>
 * @version 0.0
 *
 */
public class RehoNicol�Class {
/**
 * costruttore RehoNicoloCLass	
 */
	public RehoNicol�Class() {}
/**
 * metodo che calcola la somma dei numeri interi compresi fra l'indice iniziale"f" e "0"	
 * @param f indice iniziale 
 * @return r sommatoria
 */
	public int rehoMet(int f) {
		int r=0;
		for(int i=f; i>0; i--) {
			r = r+i;
		}/* innanzi tutto inizializiamo r a 0 poi mettiamo che i sia maggiore di 0 altrimenti 
		non si entrerebbe nel ciclo for, decrementiamo il contatore poich� nella traccia mi veniva chiesto di
		fare la sommatoria dal numero pi� grande fino ad arrivare a 0 e infine cambio da prodotto a somma perch� la traccia me lo richiedeva 
		*/
		return r;
	}

	public static void main(String[] args) {
		RehoNicol�Class r = new RehoNicol�Class();
		System.out.println(r.rehoMet(5));

	}

}
