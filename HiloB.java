package sincronizacion;

public class HiloB extends Thread {
	private Contador contador;

	public HiloB(String n, Contador c) {
		setName(n);
		contador = c;
	}

	//LANZAR UN HILO
	public void run() {
		synchronized (contador) {
			for (int i = 0; i < 100; i++) {
				contador.decrementa();
			}
			System.out.println(getName() + " contador vale " + contador.getValor());
		}
	}
	/*
	 * public void run() { for (int i = 0; i < 100; i++) { contador.decrementa(); }
	 * System.out.println(getName() + " contador vale " + contador.getValor()); }
	 */
}
