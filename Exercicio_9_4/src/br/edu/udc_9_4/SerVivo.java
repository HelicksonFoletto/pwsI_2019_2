package br.edu.udc_9_4;

public abstract class SerVivo {
	protected boolean extinto;
	
	public SerVivo() {
		this.extinto = false;
	}
	
	public abstract void extinguir();
	public abstract void nascer(String Data);
	public abstract void morrer(String Data);

	@Override
	public String toString() {
		return "SerVivo [extinto=" + extinto + "]";
	}
}
