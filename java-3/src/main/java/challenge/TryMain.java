package challenge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TryMain {

	public static void main(String[] args){

		Main main = new Main();

		List<Jogador> jogadores = main.getJogadores();
	//	Map<Integer, Integer> idades = new HashMap<>();
		
		
//		Map<Integer, Long> idades = jogadores.stream().
//				collect(Collectors.groupingBy(Jogador::getAge, Collectors.counting()));
//		
//		
//		System.out.println(idades);
		
//		     jogadores.stream()
//		        .sorted(Comparator.comparing(Jogador::getEur_release_clause)
//				.reversed())
//		        .filter(jogador -> !jogador.size() <= 10)
//		        .map(jogador -> salarios.add(jogador.getEur_release_clause()))		        
//		        .collect(Collectors.toList());    
//		        
//		        
//		for (String jogador : salarios) {
//			System.out.println(jogador);
//		}
//		
		
		//List<String> clubs = new  ArrayList<String>();
		
//		jogadores.sort(Comparator.comparing(Jogador::getEur_release_clause)
//				.reversed());		
		
	
//		jogadores.stream()
//        .sorted((j1, j2) -> j1.getEur_wage().compareTo(j2.getEur_wage()))
//        .forEach(j -> System.out.println(j.getAge()));
		
		
//		for (int i = 0; i <= jogadores.size(); i++) {
//			
//			if(i < 20) {
//				clubs.add(jogadores.get(i).getFull_name());
//		
//		}	
//			
//		
//		}
//		clubs.forEach(System.out::println);
//        //.map(jogador -> jogador.getEur_release_clause())
//		
//		
//		
//		
		
//		jogadores.stream()
//			.filter(jogador -> !jogador.getClub().isEmpty())
//			.map(jogador -> clubs.add(jogador.getClub()))
//			.collect(Collectors.toSet());
		// jogadores.forEach(jogador -> System.out.println(jogador.getFull_name()));

		/*
		 * jogadores.forEach(jogador -> { if (!jogador.getClub().isEmpty()) {
		 * System.out.println(jogador.getClub()); clubs.add(jogador.getClub()); } });
		 */
//		 for (Jogador jogador : jogadores) {
//			 if(!"".equals(jogador.getClub())) {
//			 clubs.add(jogador.getClub());
//			 }
//		}  

		// clubs.forEach(System.out::println);
		//System.out.println(clubs.size());
	}
}