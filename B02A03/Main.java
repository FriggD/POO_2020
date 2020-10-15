public class Main {

	public static void main(String[] args) {
		System.out.println("\n--------------------- Monitor ------------------\n");
		Monitor m = new Monitor("Marquinha Sapeca", "Modelim", 666.66, "45 Polegadas");
		System.out.println(m);
		System.out.println(m.descricaoPromocao());
		m.valorPromocao(1);
		m.valorPromocao(2);
		m.valorPromocao(6);
		m.valorPromocao(11);
		System.out.println("\n--------------------- Computador ------------------\n");
		Computador c = new Computador("Marquinha Quase Sapeca","Oto Modelim", 616.16, "12 gibas de memoria rambo","i10","Seagate 200MB");
		System.out.println(c);
		c.personalizar("Rosa Choque Tunado");
		System.out.println(c);
		System.out.println(c.descricaoPromocao());
		c.valorPromocao(1);
		c.valorPromocao(2);
		c.valorPromocao(5);
		c.valorPromocao(7);
	}

}