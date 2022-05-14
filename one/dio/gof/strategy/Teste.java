package one.dio.gof.strategy;

import one.dio.gof.facade.Facade;

public class Teste {
	
	
	public static void main(String[] args) {
		
		IComportamento normal = new ComportamentoNomral();
		IComportamento defensivo = new ComportamentoDefensivo();
	
		Robo robo = new Robo();
		robo.setComportamento(defensivo);
		
		robo.mover();
		
		// ---------- FACADE
		
		Facade facade = new Facade();
		facade.migrarCliente("Dayane", "123456788");
		
	}
}
