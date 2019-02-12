package br.com.codenation;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.codenation.desafio.annotation.Desafio;
import br.com.codenation.desafio.app.MeuTimeInterface;
import br.com.codenation.desafio.exceptions.CapitaoNaoInformadoException;
import br.com.codenation.desafio.exceptions.IdentificadorUtilizadoException;
import br.com.codenation.desafio.exceptions.JogadorNaoEncontradoException;
import br.com.codenation.desafio.exceptions.TimeNaoEncontradoException;

public class DesafioMeuTimeApplication implements MeuTimeInterface {

	private  List<Time> times = new ArrayList<>();
	private  List<Jogador> jogadores = new ArrayList<>();

	@Desafio("incluirTime")
	public void incluirTime(Long id, String nome, LocalDate dataCriacao, String corUniformePrincipal,
			String corUniformeSecundario) {

		Time time = new Time(id, nome, dataCriacao, corUniformePrincipal, corUniformeSecundario);

		if (times.contains(time)) {
			throw new IdentificadorUtilizadoException();
		}

		times.add(time);
	}

	@Desafio("incluirJogador")
	public void incluirJogador(Long id, Long idTime, String nome, LocalDate dataNascimento, Integer nivelHabilidade,
			BigDecimal salario) {

		Jogador jogador = new Jogador(id, idTime, nome, dataNascimento, nivelHabilidade, salario);

		if (!times.contains(jogador.getTime())) {
			throw new TimeNaoEncontradoException();
		}

		if (jogadores.contains(jogador)) {
			throw new IdentificadorUtilizadoException();
		}

		jogadores.add(jogador);
	}

	@Desafio("definirCapitao")
	public void definirCapitao(Long idJogador) {

		Jogador jogadorEncontrado = buscaJogadorPorId(idJogador);

		for (Jogador jogador : jogadores) {
			if (jogador.getTime().getId().equals(jogadorEncontrado.getIdTime())) {
				if (jogador.isCapitao() && !jogador.getId().equals(idJogador)) {
					jogador.setCapitao(false);
				}
				if (jogador.getId().equals(idJogador)) {
					jogador.setCapitao(true);

				}

			}
		}	
	}

	@Desafio("buscarCapitaoDoTime")
	public Long buscarCapitaoDoTime(Long idTime) {

		Jogador jog = new Jogador();
		Time timeEncontrado = buscaTimePorId(idTime);

		for (Jogador jogador : jogadores) {
			if (jogador.getIdTime().equals(timeEncontrado.getId())){
				if (jogador.isCapitao()) {
					jog = jogador;
				}
			}
		}
		
		if (!jog.isCapitao()) {
			throw new CapitaoNaoInformadoException();
		}

		return jog.getId();

	}

	@Desafio("buscarNomeJogador")
	public String buscarNomeJogador(Long idJogador) {

		return buscaJogadorPorId(idJogador).getNome();

	}

	@Desafio("buscarNomeTime")
	public String buscarNomeTime(Long idTime) {

		return buscaTimePorId(idTime).getNome();

	}

	@Desafio("buscarJogadoresDoTime")
	public List<Long> buscarJogadoresDoTime(Long idTime) {

		List<Long> idJogadores = new ArrayList<>();
		verificaTimeExiste(idTime);

		for (int j = 0; j < jogadores.size(); j++) {
			if (jogadores.get(j).getTime().getId().equals(idTime)) {
				idJogadores.add(jogadores.get(j).getId());
			}
		}

		return idJogadores;

	}

	@Desafio("buscarMelhorJogadorDoTime")
	public Long buscarMelhorJogadorDoTime(Long idTime) {

		Integer melhorJogador = 0;
		Long idJogador = null;

		verificaTimeExiste(idTime);
		Time timeEncontrado = buscaTimePorId(idTime);

		for (int j = 0; j < jogadores.size(); j++) {
			if (jogadores.get(j).getTime().getId().equals(timeEncontrado.getId())) {
				if (jogadores.get(j).getNivelHabilidade() > melhorJogador) {
					melhorJogador = jogadores.get(j).getNivelHabilidade();
					idJogador = jogadores.get(j).getId();
				}
			}

		}
		return idJogador;

	}

	@Desafio("buscarJogadorMaisVelho")
	public Long buscarJogadorMaisVelho(Long idTime) {

		LocalDate jogadorMaisVelho = LocalDate.now();
		Long idJogador = null;

		Time timeEncontrado = buscaTimePorId(idTime);

		for (int j = 0; j < jogadores.size(); j++) {
			if (jogadores.get(j).getTime().getId().equals(timeEncontrado.getId())) {
				if (jogadores.get(j).getDataNascimento().isBefore(jogadorMaisVelho)) {
					jogadorMaisVelho = jogadores.get(j).getDataNascimento();
					idJogador = jogadores.get(j).getId();
				}
			}
		}
		return idJogador;

	}

	@Desafio("buscarTimes")
	public List<Long> buscarTimes() {
		
		List<Long> todosTimes = new ArrayList<>();

		for (int i = 0; i < times.size(); i++) {
			todosTimes.add(times.get(i).getId());
		}

		return todosTimes;

	}

	@Desafio("buscarJogadorMaiorSalario")
	public Long buscarJogadorMaiorSalario(Long idTime) {

		List<Jogador> jogadoresTime = new ArrayList<>();
		verificaTimeExiste(idTime);
		
		for (Jogador jogador : jogadores) {
			if(jogador.getIdTime().equals(idTime)) {
				jogadoresTime.add(jogador);
				
			}
		}
		
		jogadoresTime.sort(Comparator.comparing(Jogador::getSalario).reversed().thenComparing(Comparator.comparing(Jogador::getId)));

		return jogadoresTime.get(0).getId();


	}

	@Desafio("buscarSalarioDoJogador")
	public BigDecimal buscarSalarioDoJogador(Long idJogador) {
		 return buscaJogadorPorId(idJogador).getSalario();
	}

	@Desafio("buscarTopJogadores")
	public List<Long> buscarTopJogadores(Integer top) {

		List<Long> idJogadores = new ArrayList<>();
		
		jogadores.sort(Comparator.reverseOrder());				
		
		for (int i = 0; i < top; i++) {				
				idJogadores.add(jogadores.get(i).getId());
			}
			
		return idJogadores;
	
	}

	@Desafio("buscarCorCamisaTimeDeFora")
	public String buscarCorCamisaTimeDeFora(Long timeDaCasa, Long timeDeFora) {
		
	    Time idTimeDaCasa = buscaTimePorId(timeDaCasa);
	    Time idTimeDaFora = buscaTimePorId(timeDeFora);
	    
	    if(idTimeDaCasa.getCorUniformePrincipal().equals(idTimeDaFora.getCorUniformePrincipal())) {
	    	return idTimeDaFora.getCorUniformePrincipal();
	    }
	    
	    if (!idTimeDaCasa.getCorUniformePrincipal().equals(idTimeDaFora.getCorUniformePrincipal())) {
	    	return idTimeDaFora.getCorUniformeSecundario();
		}else{
			return idTimeDaFora.getCorUniformePrincipal();
		}
	}

	public void verificaTimeExiste(Long idTime) {
		if (!times.contains(new Time(idTime))) {
			throw new TimeNaoEncontradoException();
		}
	}

	public void verificaJogadorExiste(Long idJogador) {
		if (!jogadores.contains(new Jogador(idJogador))) {
			throw new JogadorNaoEncontradoException();
		}
	}

	public Time buscaTimePorId(Long idTime) {
		Time timeEncontrado = null;
		for (Time time : times) {
			if (time.getId().equals(idTime)) {
				timeEncontrado = time;
			}
		}
		if (!times.contains(timeEncontrado)) {
			throw new TimeNaoEncontradoException();
		}
		return timeEncontrado;
	}

	public Jogador buscaJogadorPorId(Long idJogador) {
		Jogador jogadorEncontrado = null;
		for (Jogador jogador : jogadores) {
			if (jogador.getId().equals(idJogador)) {
				jogadorEncontrado = jogador;
			}

		}
		if (!jogadores.contains(jogadorEncontrado)) {
			throw new JogadorNaoEncontradoException();
		}

		return jogadorEncontrado;
	}

}
