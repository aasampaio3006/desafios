package challenge;


import java.time.LocalDate;

public class Jogador {
	
	private String full_name;
	private String club;
	private Integer age;
	private LocalDate birth_date;
	private String nationality;	
	private Double eur_wage;	
	private Double eur_release_clause;
	
	
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public LocalDate getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(LocalDate birth_date) {
		this.birth_date = birth_date;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public Double getEur_wage() {
		return eur_wage;
	}
	public void setEur_wage(Double eur_wage) {
		this.eur_wage = eur_wage;
	}
	public Double getEur_release_clause() {
		return eur_release_clause;
	}
	public void setEur_release_clause(Double eur_release_clause) {
		this.eur_release_clause = eur_release_clause;
	}

	@Override
	public String toString() {
		return "Jogador [full_name=" + full_name + ", club=" + club + ", age=" + age + ", birth_date=" + birth_date
				+ ", nationality=" + nationality + ", eur_wage=" + eur_wage + ", eur_release_clause="
				+ eur_release_clause + "]";
	}




	
}

	
	