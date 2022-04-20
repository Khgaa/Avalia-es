package Hospital;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		ColecaoPaciente c = new ColecaoPaciente();
		
		Scanner in = new Scanner(System.in);
		
		c.add();
		c.list();
		c.quantidade();
		c.addPos();
		c.list();
		c.quantidade();
		c.remove();
		c.list();
		c.quantidade();
		c.search();

	}

}
