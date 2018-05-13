package fr.tarik.domaine;

public class Voyage {
	private Integer idVoyage;
	private String typeVoyage;
	private Integer budget;
	private String description;
	private String dateDepart;
	private String dateRetour;

	// Constructeur
	public Voyage(Integer idVoyage, String typeVoyage, Integer budget, String description, String dateDepart,
			String dateRetour) {
		super();
		this.idVoyage = idVoyage;
		this.typeVoyage = typeVoyage;
		this.budget = budget;
		this.description = description;
		this.dateDepart = dateDepart;
		this.dateRetour = dateRetour;
	}

	public Voyage() {
		super();
	}

	// Get & Set

	public Integer getIdVoyage() {
		return idVoyage;
	}

	public void setIdVoyage(Integer idVoyage) {
		this.idVoyage = idVoyage;
	}

	public String getTypeVoyage() {
		return typeVoyage;
	}

	public void setTypeVoyage(String typeVoyage) {
		this.typeVoyage = typeVoyage;
	}

	public Integer getBudget() {
		return budget;
	}

	public void setBudget(Integer budget) {
		this.budget = budget;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(String dateDepart) {
		this.dateDepart = dateDepart;
	}

	public String getDateRetour() {
		return dateRetour;
	}

	public void setDateRetour(String dateRetour) {
		this.dateRetour = dateRetour;
	}

	// To String()
	

	public String toString() {
	
		return super.toString();
	}

}
