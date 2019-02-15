package challenge;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TryMain {

	public static void main(String[] args){

		Main main = new Main();

		List<Jogador> jogadores = main.getJogadores();
			
		List<String> idades = jogadores.stream()
				.sorted(Comparator.comparing(Jogador::getBirth_date)
				.thenComparing(Jogador::getEur_wage))
				.limit(10)
				.map(Jogador::getFull_name).collect(Collectors.toList());
	
		idades.forEach(System.out::println);

	}
}