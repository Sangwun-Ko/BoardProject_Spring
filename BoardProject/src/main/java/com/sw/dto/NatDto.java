package com.sw.dto;

import java.util.ArrayList;

import org.apache.ibatis.type.Alias;

@Alias("NatDto")
public class NatDto {
	private int nat_id;
	private String k_name;
	private String e_name;
	private String img;
	private String description;
	private String currency;
	private String volt;
	private String visa;
	private String timedi;
	private String flag;
	private String cities;
	private ArrayList<CityDto> city;
	
	
	public NatDto() { }
	public NatDto(int nat_id, String k_name, String e_name, String img, String description, String currency,
			String volt, String visa, String timedi, String flag, String cities, ArrayList<CityDto> city) {
		this.nat_id = nat_id;
		this.k_name = k_name;
		this.e_name = e_name;
		this.img = img;
		this.description = description;
		this.currency = currency;
		this.volt = volt;
		this.visa = visa;
		this.timedi = timedi;
		this.flag = flag;
		this.cities = cities;
		this.city = city;
	}
	
	public int getNat_id() {
		return nat_id;
	}
	public void setNat_id(int nat_id) {
		this.nat_id = nat_id;
	}
	public String getK_name() {
		return k_name;
	}
	public void setK_name(String k_name) {
		this.k_name = k_name;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getVolt() {
		return volt;
	}
	public void setVolt(String volt) {
		this.volt = volt;
	}
	public String getVisa() {
		return visa;
	}
	public void setVisa(String visa) {
		this.visa = visa;
	}
	public String getTimedi() {
		return timedi;
	}
	public void setTimedi(String timedi) {
		this.timedi = timedi;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getCities() {
		return cities;
	}
	public void setCities(String cities) {
		this.cities = cities;
	}
	public ArrayList<CityDto> getCity() {
		return city;
	}
	public void setCity(ArrayList<CityDto> city) {
		this.city = city;
	}
	
}
