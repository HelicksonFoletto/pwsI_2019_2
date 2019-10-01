package br.edu.udc_1_13;

public class TesteHora {

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
		HoraAproximada hora1 = new HoraAproximada();
		hora1.iniciaHora(3,12,40);
		hora1.mostraHoraAproximada();
		
		hora.setHora(12);
		hora.setMinutos(45);
		hora.setSegundos(45);
		System.out.print(hora.mostraHoraAproximada());
		
		HoraAproximada hora3 = new HoraAproximada();
		System.out.print(hora3.mostraHoraAproximada());

	}

}
