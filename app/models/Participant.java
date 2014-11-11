package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import play.db.ebean.Model;

@Entity
@Table(name = "participants")
public class Participant extends Model {
	private static final long serialVersionUID = 1L;

	@Id
	public Long id;
	
	@ManyToOne
	@NotNull
	public Transaction transaction;
	
	@ManyToOne
	@NotNull
	public User participantUser;
	
	@NotNull
	public Boolean isParticipant;
	
	public Boolean vote;
	
	@NotNull
	public Double amount;
}
