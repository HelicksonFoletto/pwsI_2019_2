package br.edu.udc_1_13;

public class DataHora {
	public  static  void  main ( String [] args ) {
		Data data= new Data();
		HoraAproximada hora =new HoraAproximada();
		
		data.iniciaData(29,2,2017);
		hora.iniciaHora(9, 23, 30);
		data.dataEValida();
	}
}
