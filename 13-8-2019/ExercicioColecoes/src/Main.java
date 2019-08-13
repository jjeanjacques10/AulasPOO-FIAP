import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Aula> listaAula = new LinkedList<Aula>() ;
		listaAula.add(new Aula("Programa��o Java", 10));
		listaAula.add(new Aula("Redes de Computadores", 5));
		listaAula.add(new Aula("Python para Web", 20));

		//Op��o dispon�vel JAVA 8 ou superior
		listaAula.forEach(aula -> {
			System.out.println(aula);
		});
		
		//ordena��o por conte�do
		listaAula.sort(Comparator.comparing(Aula::getConteudo));
		
		System.out.println(listaAula);
	}

}
