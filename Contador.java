package sincronizacion;

public class Contador {
	private int c;

	Contador() {
		this.c = 0;
	}

	public void incrementa() {
		 c++;
	}

	public void decrementa() {
		c--;
	}

	public int getValor() {
		return c;
	}
/*	public synchronized void incrementa() {
		 c++;
	}

	public synchronized void decrementa() {
		c--;
	}

	public synchronized int getValor() {
		return c;
	}*/

}
