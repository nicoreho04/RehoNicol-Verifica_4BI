/**
 * classe RehoNicoloCLass
 * @author <g>Reho Nicolò</g>
 * <U>4°BI</U>
 * <i>13/05/2022</i>
 * @version 0.0
 *
 */
public class RehoNicolòClass {
/**
 * costruttore RehoNicoloCLass	
 */
	public RehoNicolòClass() {}
/**
 * metodo che calcola la somma dei numeri interi compresi fra l'indice iniziale"f" e "0"	
 * @param f indice iniziale 
 * @return r sommatoria
 */
	public int rehoMet(int f) {
		int r=1;
		for(int i=f; i<0; i++) {
			r = r*i;
		}
		return r;
	}

	public static void main(String[] args) {
		RehoNicolòClass r = new RehoNicolòClass();
		System.out.println(r.rehoMet(5));

	}

}
