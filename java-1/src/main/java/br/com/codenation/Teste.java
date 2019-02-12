package br.com.codenation;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class Teste  {
	
	public static void main(String[] args) {
		
	
		DesafioMeuTimeApplication app = new DesafioMeuTimeApplication();
//
//		
		app.incluirTime(1l, "Brasil", LocalDate.of(2018, Month.JULY, 30), "Branco", "Preto");
 		app.incluirTime(2l, "Santos", LocalDate.of(2018, Month.JULY, 30), "Branco", "Preto");
 		app.incluirTime(3l, "Brasil", LocalDate.of(2018, Month.JULY, 30), "Branco", "Preto");
		
		// app.imprimir();
		//time3.incluirTime(2l, "Palmeira", LocalDate.of(2018, Month.JULY, 30), "Branco", "Preto");
		
		app.incluirJogador(1l, 1l,"Ronaldo",LocalDate.of(1989, Month.JULY, 30),110,BigDecimal.valueOf(10000.0));
		app.incluirJogador(2l, 1l,"Caio",LocalDate.of(1979, Month.JULY, 30),1,BigDecimal.valueOf(10000000.0));
		app.incluirJogador(3l, 1l,"Andre",LocalDate.of(1991, Month.JULY, 30),220,BigDecimal.valueOf(1000000.0));
	    app.incluirJogador(4l, 2l,"Souza",LocalDate.of(2018, Month.JULY, 30),25,BigDecimal.valueOf(1000.0));
//	    app.incluirJogador(5l, 1l,"Pele",LocalDate.of(2018, Month.JULY, 30),4,BigDecimal.valueOf(1000.0));
//	    app.incluirJogador(6l, 1l,"Paulo",LocalDate.of(2018, Month.JULY, 30),4,BigDecimal.valueOf(1000.0));
		
	    app.definirCapitao(1L);		
		app.definirCapitao(2l);
	
		System.out.println(app.buscarCapitaoDoTime(1L));		
		System.out.println(app.buscarJogadoresDoTime(1l));
		System.out.println(app.buscarMelhorJogadorDoTime(1l));
		System.out.println(app.buscarJogadorMaisVelho(1l));	
		System.out.println(app.buscarJogadorMaiorSalario(1l));
		System.out.println(app.buscarSalarioDoJogador(1l));
		app.buscarTopJogadores(1);		
		
		
	}

}
