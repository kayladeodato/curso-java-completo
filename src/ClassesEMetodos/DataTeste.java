package ClassesEMetodos;

public class DataTeste {
	public static void main(String[] args) {
		
		Data data = new Data();
		Data data1 = new Data(05,06,2022);
		Data data2 = new Data();
		data2.ano = 2021;
		
		System.out.println(data.obterdataFormatada());
		System.out.println(data1.obterdataFormatada());
		System.out.println(data2.obterdataFormatada());
	}

}
