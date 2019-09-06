package br.edu.udc_10_4;

public class Funcionario {
	private String primeiroNome, sobrenome, departamento ;
	private String dataEntrada, RG, CPF;
	private float salario;
	
	public Funcionario() {
		 this.primeiroNome = "Fulano";
		 this.sobrenome = "de Tal";
		 this.departamento = "faxineiro";
		 this.dataEntrada = "01/01/2000";
		 this.RG = "00.000.000 - 0";
		 this.CPF = "000.000.000 - 00";
		 this.salario = (float) 0;		
	}
	public void entrada() {
		calculaGanhoAnual();
		recebeAumento();
	}
	public boolean verificarSalario(float sal) {
		if(sal > 0)
			return true;
		return false;
	}
	public void recebeAumento() {
		float aumento;
		
		aumento = (float) (salario * 0.10);
		
		System.out.printf("Novo salário: %.2f\n", aumento + salario);
	}
	public int calculaGanhoAnual() {
		return (int) (salario * 13);
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		if(verificarSalario(salario))
			this.salario = salario;
		else
			this.salario = 0;
	}

	@Override
	public String toString() {
		return "Nome: " + primeiroNome + "\nSobrenome: " + sobrenome + "\nDepartamento: "
				+ departamento + "\nData de entrada na empresa: " + dataEntrada + 
				"\nRG: " + RG + "\nCPF: " + CPF + "\nSalario: " + salario
				+ "";
	}	
}
