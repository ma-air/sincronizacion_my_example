package sincronizacion;

public class CompartirInfi {

	public static void main(String[] args) {
		Contador cont = new Contador(100);
		HiloA a = new HiloA("hilo A", cont);
		HiloB b = new HiloB("hilo B", cont);
		a.start();
		b.start();
	}

}
