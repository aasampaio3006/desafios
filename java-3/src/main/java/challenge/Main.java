package challenge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	private List<Jogador> jogadores = getJogadores();

	// Quantas nacionalidades (coluna `nationality`) diferentes existem no arquivo?
	public int q1() {

		Set<String> nationality = new HashSet<>();
		jogadores.stream().map(jogador -> nationality.add(jogador.getNationality())).collect(Collectors.toSet());

//		for (Jogador jogador : jogadores) {
//			nationality.add(jogador.getNationality());
//		}
		return nationality.size();
	}

	// Quantos clubes (coluna `club`) diferentes existem no arquivo?
	// Obs: Existem jogadores sem clube.
	public int q2() {
		Set<String> clubs = new HashSet<String>();

		jogadores.stream().filter(jogador -> !jogador.getClub().isEmpty()).map(jogador -> clubs.add(jogador.getClub()))
				.collect(Collectors.toSet());
		return clubs.size();

	}

	// Liste o primeiro nome (coluna `full_name`) dos 20 primeiros jogadores.
	public List<String> q3() {
		
		List<String> nomes = new ArrayList<String>();

		for (int i = 0; i <= jogadores.size(); i++) {
			if (i < 20) {
				nomes.add(jogadores.get(i).getFull_name());
			}
		}
		return nomes;
	}

	// Quem são os top 10 jogadores que possuem as maiores cláusulas de rescisão?
	// (utilize as colunas `full_name` e `eur_release_clause`)
	public List<String> q4() {
		return null;
	}

	// Quem são os 10 jogadores mais velhos (use como critério de desempate o
	// campo `eur_wage`)?
	// (utilize as colunas `full_name` e `birth_date`)
	public List<String> q5() {
		return null;
	}

	// Conte quantos jogadores existem por idade. Para isso, construa um mapa onde
	// as chaves são as idades e os valores a contagem.
	// (utilize a coluna `age`)
	public Map<Integer, Integer> q6() {
		return null;
	}

	public List<Jogador> getJogadores() {

		String csvFile = "C:\\Users\\andrade.sampaio\\codenation\\java-3\\src\\main\\resources\\data.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		List<Jogador> jogadores = new ArrayList<Jogador>();

		try {
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {

				Jogador jogador = new Jogador();

				String[] country = line.split(cvsSplitBy);
				if (!"ID".contains(country[0])) {
					jogador.setFull_name(country[2]);
					jogador.setClub(country[3]);
					jogador.setAge(Long.parseLong(country[6]));
					jogador.setBirth_date(LocalDate.parse(country[8], formatter));
					jogador.setNationality(country[14]);
					jogador.setEur_wage(Double.parseDouble(country[17]));
					jogador.setEur_release_clause(country[18]);
					jogadores.add(jogador);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return jogadores;

	}

}
