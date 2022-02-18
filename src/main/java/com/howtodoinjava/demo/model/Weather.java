package com.howtodoinjava.demo.model;

import io.swagger.annotations.ApiModelProperty;

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

	@ApiModelProperty(notes = "Name of the pays",name="pays",required=true,value="France")
	private String pays;
	@ApiModelProperty(notes = "Name of the ville",name="ville",required=true,value="Nice")
	private String ville;
	@ApiModelProperty(notes = "Name of the code postal",name="codePostal",required=true,value="06000")
	private String codePostal;
	@ApiModelProperty(notes = "Name of the temp",name="temp",required=true,value="18")
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
