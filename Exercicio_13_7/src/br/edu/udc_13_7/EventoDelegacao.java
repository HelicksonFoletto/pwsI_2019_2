package br.edu.udc_13_7;

import br.edu.udc_1_13.Data;
import br.edu.udc_1_13.DataHora;
import br.edu.udc_1_13.HoraAproximada;

public class EventoDelegacao {
	DataHora data_hora;
	String tipo;

	EventoDelegacao(Data data, HoraAproximada hora) {
		this.data_hora = new DataHora();

		tipo = "Delegação/Composição";
	}

	EventoDelegacao() {
		this.data_hora = new DataHora();

		tipo = "Delegação/Composição";
	}

	public String getTipo() { 
		return tipo; 
	}
}
