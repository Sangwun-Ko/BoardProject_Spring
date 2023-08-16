package com.sw.dto;

import org.apache.ibatis.type.Alias;

@Alias("CityDto")
public class CityDto {
	private int city_id;
	private String name;
	private String img;
	private String sum;
	private String description;
	private double lat;
	private double lon;
	private int like_cnt;
	private String img_sub;
	private String exp_id;
	private int nat_id;
	private String tip;
	private String why;
	private int rank;
	
	public CityDto() { }
	public CityDto(int city_id, String name, String img, String sum, String description, double lat, double lon,
			int like_cnt, String img_sub, String exp_id, int nat_id, String tip, String why, int rank) {
		this.city_id = city_id;
		this.name = name;
		this.img = img;
		this.sum = sum;
		this.description = description;
		this.lat = lat;
		this.lon = lon;
		this.like_cnt = like_cnt;
		this.img_sub = img_sub;
		this.exp_id = exp_id;
		this.nat_id = nat_id;
		this.tip = tip;
		this.why = why;
		this.rank = rank;
	}
	
	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getSum() {
		return sum;
	}
	public void setSum(String sum) {
		this.sum = sum;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public int getLike_cnt() {
		return like_cnt;
	}
	public void setLike_cnt(int like_cnt) {
		this.like_cnt = like_cnt;
	}
	public String getImg_sub() {
		return img_sub;
	}
	public void setImg_sub(String img_sub) {
		this.img_sub = img_sub;
	}
	public String getExp_id() {
		return exp_id;
	}
	public void setExp_id(String exp_id) {
		this.exp_id = exp_id;
	}
	public int getNat_id() {
		return nat_id;
	}
	public void setNat_id(int nat_id) {
		this.nat_id = nat_id;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String getWhy() {
		return why;
	}
	public void setWhy(String why) {
		this.why = why;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
}
