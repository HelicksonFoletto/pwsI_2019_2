package br.edu.udc_1_13;

public class TesteData {

	public static void main(String[] args) {
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
