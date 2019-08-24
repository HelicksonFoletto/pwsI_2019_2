package br.edu.udc_4_2_6;

public class Teste {

	public static void main(String[] args) {
		
		Operacao i = new Operacao();
		i.entrada();

	}

}
/* O resultado será mostrado pois a variavel não suportará o tamanho do número que será amarzenado. A classe int 
ao ser reservado a variável, contém apenas 4 bits e quando mudado para long a sua capacidade se eleva para 8 bits,
podendo assim suportar o tamanho da representação daquele valor. */