package ClassesEMetodos;

public class Data {
	
	int dia;
	int mes;
	int ano;
	String diaSemana;
	
	Data() {
		dia = 01;
		mes = 01;
		ano = 1970;
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	String obterdataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	

}
