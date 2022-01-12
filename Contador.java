package sincronizacion;

public class Contador {
	private int c = 0;

	Contador(int c) {
		this.c = c;
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
}
