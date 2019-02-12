package challenge;

import java.time.LocalDate;

public class Jogador {
	
	String full_name;
	String club;
	Long age;
	LocalDate birth_date;
	String nationality;	
	Double eur_wage;	
	String eur_release_clause;
	
	
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public void setBirth_date(LocalDate birth_date) {
		this.birth_date = birth_date;
	}
	public String getFull_name() {
		return full_name;
	}
	public String getClub() {
		return club;
	}
	public Long getAge() {
		return age;
	}
	public LocalDate getBirth_date() {
		return birth_date;
	}
	public String getNationality() {
		return nationality;
	}
	public Double getEur_wage() {
		return eur_wage;
	}
	public String getEur_release_clause() {
		return eur_release_clause;
	}
	public void setEur_wage(Double eur_wage) {
		this.eur_wage = eur_wage;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public void setEur_release_clause(String eur_release_clause) {
		this.eur_release_clause = eur_release_clause;
	}
	
	@Override
	public String toString() {
		return "Jogador [full_name=" + full_name + ", club=" + club + ", nationality=" + nationality + ", birth_date="
				+ birth_date + ", eur_wage=" + eur_wage + ", age=" + age + ", eur_release_clause=" + eur_release_clause
				+ "]";
	}
	
}
//	Long id;
//	String name;	
//	String club_logo;
//	Long special;	
//	String league;
//	Double height_cm;
//	Double weight_kg;
//	String body_type;
//	Boolean real_face;
//	String flag;	
//	String photo;
//	Double eur_value;
//	Double overall;
//	Double potential;
	
	