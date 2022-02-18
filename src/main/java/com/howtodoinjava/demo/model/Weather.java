package com.howtodoinjava.demo.model;

public class Weather {

	public Weather() {
		
	}
	public Weather(String ville, String pays,String codePostal, Integer temp) {
		super();
		this.ville = ville;
		this.pays = pays;
		this.codePostal=codePostal;
		this.temp = temp;
	}
	

	private String pays;
	private String ville;
	private String codePostal;
	private Integer temp;

	
	public String getPays() {
		return pays;
	}
	public void setId(String id) {
		this.pays = pays;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public Integer getTemp() {
		return temp;
	}
	public void setTemp(String Temp) {
		this.temp = temp;
	}

	@Override
	public String toString() {
		return "Weather [pays=" + pays + ", ville=" + ville
				+ ", code postal=" + codePostal + ", température=" + temp + "]";
	}
}
