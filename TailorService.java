package com.Tailoring.store.management.Service;



import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Tailoring.store.management.Model.Admin;
import com.Tailoring.store.management.Model.DressAndCategory;
import com.Tailoring.store.management.Model.PatternAndCost;
import com.Tailoring.store.management.Model.Tailor;
import com.Tailoring.store.management.Model.User;

@Service
public interface TailorService {
	//this method is used for to add tailor data in Database(OnlineTailoring System)
	public boolean addTailor(Tailor tailor);
	
	//this method is used to fetch Tailor data from Database(OnlineTailoring System)
	public List<Tailor> read();
	public List<String> readDressType();
	
	public boolean addPatternAndCost(PatternAndCost pattern,String name);
	public List<DressAndCategory> readTailorDressType();

	public boolean addToTailorDressType(DressAndCategory dressAndCategory, String name);
}
