package challenge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ListaDeJogadores {
	
	
	
	public static List<Jogador>  getJogadores(){
		
		String csvFile = "C:\\Users\\andrade.sampaio\\codenation\\java-3\\src\\main\\resources\\data.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		List<Jogador> jogadores = new  ArrayList<Jogador>();
		
		 try {			    
	            br = new BufferedReader(new FileReader(csvFile));
	            while ((line = br.readLine()) != null) {
	            	
	            	Jogador jogador = new Jogador();
	            	
	                   String[] country = line.split(cvsSplitBy);
	              		if(!"ID".contains(country[0])) {	                	
	                		jogador.setFull_name(country[2]);
	 		                jogador.setClub(country[3]);      	                
	 		                jogador.setAge(Long.parseLong(country[6]));		                		                
	 		                jogador.setBirth_date(LocalDate.parse(country[8],formatter));		                
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
