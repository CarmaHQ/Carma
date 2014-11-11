package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import play.db.ebean.Model;

@Entity
@Table(name = "transactions")
public class Transaction extends Model {
	private static final long serialVersionUID = 1L;

	@Id
	public Long id;
	
	@ManyToOne
	public Transaction rolledBackByTransaction;
	
	@ManyToOne
	public Transaction rollsBackTransaction;
	
	@NotNull
	public Date dateTime;	
	
	@NotNull
	public String title;
	
	public String description;
	
	@ManyToOne
	@NotNull
	public User initiatorUser;
	
	@Enumerated(EnumType.ORDINAL)
	@NotNull
	public StatusType status;
	
	@NotNull
	public Double totalAmount;	
}
