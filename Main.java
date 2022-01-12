package sincronizacion;


public class Main {

	public static void main(String[] args) {
		Contador cont = new Contador();
		HiloA a = new HiloA("hilo A", cont);
		HiloB b = new HiloB("hilo B", cont);
		a.start();
		b.start();
	}

}
