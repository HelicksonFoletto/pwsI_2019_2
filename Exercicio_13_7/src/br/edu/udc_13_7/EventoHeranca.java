package br.edu.udc_13_7;

import br.edu.udc_1_13.Data;
import br.edu.udc_1_13.DataHora;
import br.edu.udc_1_13.HoraAproximada;

public class EventoHeranca extends DataHora {
	String tipo;

	EventoHeranca(Data data, HoraAproximada hora) {
		super();
		tipo = "Heran�a";
	}

	EventoHeranca() {
		super();
		
		tipo = "Heran�a";
	}

	public String getTipo() { 
		return tipo; 
	}
}
