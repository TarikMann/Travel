package fr.tarik.domaine;

public class Bagage {

	private Integer idBagage;
	private Integer nbrBagage;
	private String libBagage;
	private Voyage idfkVouage;

	// Constructeur
	public Bagage() {
		super();
	}

	public Bagage(Integer idBagage, Integer nbrBagage, String libBagage, Voyage idfkVouage) {
		super();
		this.idBagage = idBagage;
		this.nbrBagage = nbrBagage;
		this.libBagage = libBagage;
		this.idfkVouage = idfkVouage;
	}

	// Get & Set
	public Voyage getIdfkVouage() {
		return this.idfkVouage;
	}

	public void setIdfkVouage(Voyage idfkVouage) {
		this.idfkVouage = idfkVouage;
	}

	public Integer getIdBagage() {
		return this.idBagage;
	}

	public void setIdBagage(Integer idBagage) {
		this.idBagage = idBagage;
	}

	public Integer getNbrBagage() {
		return this.nbrBagage;
	}

	public void setNbrBagage(Integer nbrBagage) {
		this.nbrBagage = nbrBagage;
	}

	public String getLibBagage() {
		return this.libBagage;
	}

	public void setLibBagage(String libBagage) {
		this.libBagage = libBagage;
	}

}
