package sincronizacion;

public class HiloA extends Thread {
	private Contador contador;

	public HiloA(String n, Contador c) {
		setName(n);
		contador = c;
	}

	// LANZAR EL HILO
	public void run() {
		synchronized (contador) {

			for (int i = 0; i < 100; i++) {
				contador.incrementa();
			}
			System.out.println(getName() + " contador vale " + contador.getValor());
		}
	}

	/*
	 * public void run() { for (int i = 0; i < 100; i++) { contador.incrementa(); }
	 * System.out.println(getName() + " contador vale " + contador.getValor()); }
	 */
}
