package sincronizacion;

public class HiloA extends Thread {
	private Contador contador;

	public HiloA(String n, Contador c) {
		setName(n);
		contador = c;
	}

	public void run() {
		synchronized (contador) {

			for (int i = 0; i < 20; i++) {
				contador.incrementa();
			}
			System.out.println(getName() + " contador vale " + contador.getValor());
		}
	}
}
