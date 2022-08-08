package one.digitalInnovationOne;

import one.digitalInnovationOne.facade.Facade;
import one.digitalInnovationOne.ogf.singleton.SingletonEager;
import one.digitalInnovationOne.ogf.singleton.SingletonLazy;
import one.digitalInnovationOne.ogf.singleton.SingletonLazyHolder;
import one.digitalInnovationOne.strategy.Comportamento;
import one.digitalInnovationOne.strategy.ComportamentoAgressivo;
import one.digitalInnovationOne.strategy.ComportamentoDefensivo;
import one.digitalInnovationOne.strategy.ComportamentoNormal;
import one.digitalInnovationOne.strategy.Robo;

public class Teste {

	public static void main(String[] args) {

		//SingleTon
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder.getInstancia();
		System.out.println(lazyHolder);

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager.getInstancia();
		System.out.println(eager);
		
		//Strategy
		Comportamento agressivo = new ComportamentoAgressivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		
		Robo robo = new Robo();
		robo.setStrategy(normal);
		robo.mover();
		robo.mover();
		
		robo.setStrategy(defensivo);
		robo.mover();
		robo.mover();
		
		robo.setStrategy(agressivo);
		robo.mover();
		robo.mover();
		
		//Facade
		Facade facade = new Facade();
		facade.migrarCliente("Daniel", "72640458");
	}

}
