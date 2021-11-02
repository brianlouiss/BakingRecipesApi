package com.shake.bake.bakeshake;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ingredient {
	private @Id @GeneratedValue Long id; 
	private Double measurement;
	private String unit;
	private String name;
	private String step; // BNB: this needs a better name, this is a place holder for if the recipe has multiple parts such as dough, topping, etc.

	Ingredient() {}
	
	Ingredient(Double measurement, String unit, String name, String step) {
		this.measurement = measurement;
		this.unit = unit;
		this.name = name;
		this.step = step;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public Double getMeasurement() {
		return this.measurement;
	}
	
	public String getUnit() {
		return this.unit;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getStep() {
		return this.step;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setMeasurement(Double measurement) {
		this.measurement = measurement;
	}
	
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setStep(String step) {
		this.step = step;
	}
	
	@Override
	public String toString() {
		return "Ingredient{" + "id=" + this.id + ", name=" + this.name + ", measurement=" + this.measurement + ", unit=" + this.unit + ", step=" + this.step + "}";
	}
}
