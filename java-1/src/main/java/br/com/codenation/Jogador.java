package br.com.codenation;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Jogador implements Comparable<Jogador>{

	private Long id;
	private Long idTime;
	private Time time;
	private String nome;
	private LocalDate dataNascimento;
	private Integer nivelHabilidade;
	private BigDecimal salario;
	private boolean capitao;
	
	public Jogador(Long id) {
		this.id = id;
	}

	public Jogador(Long id, Long idTime, String nome, LocalDate dataNascimento, Integer nivelHabilidade,
			BigDecimal salario) {
		this.id = id;
		this.time = new Time();
		time.setId(idTime);
		this.idTime = idTime;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.nivelHabilidade = nivelHabilidade;
		this.salario = salario;
	}


	public Jogador() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdTime() {
		return idTime;
	}

	public void setIdTime(Long idTime) {
		this.idTime = idTime;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Integer getNivelHabilidade() {
		return nivelHabilidade;
	}

	public void setNivelHabilidade(Integer nivelHabilidade) {
		this.nivelHabilidade = nivelHabilidade;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public boolean isCapitao() {
		return capitao;
	}

	public void setCapitao(boolean capitao) {
		this.capitao = capitao;
	}

	@Override
	public boolean equals(Object obj) {
		Jogador other = (Jogador) obj;
		;
		return this.id.equals(other.id);
	}

	@Override
	public int hashCode() {
		return this.id.hashCode();
	}

	@Override
	public String toString() {
		return "Jogador [id=" + id + ", idTime=" + idTime + ", time=" + time + ", nome=" + nome + ", dataNascimento="
				+ dataNascimento + ", nivelHabilidade=" + nivelHabilidade + ", salario=" + salario + "]";
	}

	@Override
	public int compareTo(Jogador outrojagador) {
		
		return this.nivelHabilidade.compareTo(outrojagador.nivelHabilidade);
	  
	}


	

	
}
