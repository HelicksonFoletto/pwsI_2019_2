package br.edu.udc_13_7;

import br.edu.udc_1_13.Data;
import br.edu.udc_1_13.HoraAproximada;

public class TesteHoraData {

	public static void main(String[] args) {
		HoraAproximada hora = new HoraAproximada();
		hora.iniciaHora(3,12,40);
		hora.mostraHoraAproximada();
		
		hora.setHora(11);
		hora.setMinutos(22);
		hora.setSegundos(45);
		System.out.print(hora.mostraHoraAproximada());
		
		HoraAproximada hora2 = new HoraAproximada();
		System.out.print(hora2.mostraHoraAproximada());
		
		Data data = new Data();
		Data data2 = new Data();
		
		data.iniciaData(25, 5, 2017);
		data.mostrarData();
		
		data.setDia(2);
		data.setMes(4);
		data.setAno(2007);
		data.mostrarData();
		
		data2.mostrarData();

	}

}
