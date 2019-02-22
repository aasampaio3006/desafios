package challenge;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="scripts")
public class Quote {

	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="actor")
	private String actor;
	
	@Column(name="detail")
	private String quote;
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getActor() {
		return actor;
	}


	public void setActor(String actor) {
		this.actor = actor;
	}


	public String getQuote() {
		return quote;
	}


	public void setQuote(String quote) {
		this.quote = quote;
	}


	@Override
	public String toString() {
		return "Quote [id=" + id + ", actor=" + actor + ", quote=" + quote + "]";
	}

}
