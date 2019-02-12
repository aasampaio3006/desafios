package br.com.codenation;

import java.time.LocalDate;

public class Time implements Comparable<Time> {

	private Long id;
	private String nome;
	private LocalDate dataCriacao;
	private String corUniformePrincipal;
	private String corUniformeSecundario;

	public Time() {

	}

	public Time(Long id) {
		this.id = id;
	}

	public Time(Long id, String nome, LocalDate dataCriacao, String corUniformePrincipal,
			String corUniformeSecundario) {
		this.id = id;
		this.nome = nome;
		this.dataCriacao = dataCriacao;
		this.corUniformePrincipal = corUniformePrincipal;
		this.corUniformeSecundario = corUniformeSecundario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getCorUniformePrincipal() {
		return corUniformePrincipal;
	}

	public void setCorUniformePrincipal(String corUniformePrincipal) {
		this.corUniformePrincipal = corUniformePrincipal;
	}

	public String getCorUniformeSecundario() {
		return corUniformeSecundario;
	}

	public void setCorUniformeSecundario(String corUniformeSecundario) {
		this.corUniformeSecundario = corUniformeSecundario;
	}

	@Override
	public String toString() {
		return "Time [id=" + id + ", nome=" + nome + ", dataCriacao=" + dataCriacao + ", corUniformePrincipal="
				+ corUniformePrincipal + ", corUniformeSecundario=" + corUniformeSecundario + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Time other = (Time) obj;
		return this.id.equals(other.id);
	}

	@Override
	public int hashCode() {
		return this.id.hashCode();
	}

	@Override
	public int compareTo(Time outroTime) {

		return this.id.compareTo(outroTime.id);
	}

}
