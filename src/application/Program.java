package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Program {

	public static void main(String[] args) {

		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My Letter");
		p.print("My Letter");
		
		System.out.println();
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("My e-mail");
		System.out.println("Scan result: " + s.scan());
		
		System.out.println();
		ComboDevice cd = new ComboDevice("2081");
		cd.processDoc("My dissertation");
		cd.print("My dissertation");
		System.out.println("Scan result " + cd.scan());
	}
}