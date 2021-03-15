package com.Tailoring.store.management.Model;

import org.springframework.stereotype.Component;

@Component
public class DressAndCategory {
private String dressType;
private String category;



public String getDressType() {
	return dressType;
}
public void setDressType(String dressType) {
	this.dressType = dressType;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
@Override
public String toString() {
	return "DressAndCategory [dressType=" + dressType + ", category=" + category + "]";
}
}
