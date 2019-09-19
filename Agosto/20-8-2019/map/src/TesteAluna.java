import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteAluna {

	public static void main(String[] args) {
		
		List<Aula> lista = new ArrayList<Aula>();
		lista.add(new Aula("Classe", 10));
		lista.add(new Aula("Objeto", 5));
		lista.add(new Aula("Heran�a", 20));

		lista.forEach(aula -> {
			System.out.println(aula);
		});
		
		//ordena��o por conte�do
		lista.sort(Comparator.comparing(Aula::getDuracao));
		
		System.out.println(lista);
		
		
	}

}
