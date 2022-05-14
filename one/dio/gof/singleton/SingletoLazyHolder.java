package one.dio.gof.singleton;

public class SingletoLazyHolder {

	
	public static class InstanceHolder{
			private static SingletoLazyHolder instancia = new SingletoLazyHolder();
	}

	private SingletoLazyHolder() {
		super();
	}
	
	public static SingletoLazyHolder getInstancia() {

		return InstanceHolder.instancia;
	}
	
}
