package br.edu.udc_10_4;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();
		
		f1.setPrimeiroNome("Helickson");
		f1.setSobrenome("Foletto");
		f1.setDepartamento("gerente");
		f1.setDataEntrada("12/04/1997");
		f1.setRG("12.345.678.9");
		f1.setCPF("123.456.789-12");
		f1.setSalario(998.00f);	
		
		System.out.println(f1);
		f1.entrada();
		
		System.out.println("\n\n");
		
		Funcionario f2 = new Funcionario();
		System.out.println(f2);
		f2.entrada();
	}
}
