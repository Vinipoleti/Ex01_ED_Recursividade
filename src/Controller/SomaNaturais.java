package Controller;

public class SomaNaturais {

	public SomaNaturais() {
		super ();
	}
	public int soma( int N) {
		if (N<0) { // parada em zero, retornando zero, pois é o último natural conhecido
			return 0;
		} else {
			return N + soma(N-1); // retorna N mais a soma de N-1 enquanto não chegar a zero
		}
	}

}
