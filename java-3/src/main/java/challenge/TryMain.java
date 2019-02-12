package challenge;

import java.util.ArrayList;
import java.util.List;

public class TryMain {

	public static void main(String[] args) {

		Main main = new Main();

		List<Jogador> jogadores = main.getJogadores();
		List<String> clubs = new  ArrayList<String>();
		
		
		for (int i = 0; i <= jogadores.size(); i++) {
			
			if(i < 20) {
				clubs.add(jogadores.get(i).getFull_name());
		
		}	
			
		
		}
		clubs.forEach(System.out::println);
        
		
		
		
		
		
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
		System.out.println(clubs.size());
	}
}