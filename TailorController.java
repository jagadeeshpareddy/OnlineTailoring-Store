package com.Tailoring.store.management.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.Tailoring.store.management.Service.TailorService;
import com.Tailoring.store.management.Service.UserService;
import com.Tailoring.store.management.Service.UserService;
import com.Tailoring.store.management.Service.UserServiceImpl;
import com.Tailoring.store.management.Model.DressAndCategory;
import com.Tailoring.store.management.Model.PatternAndCost;
import com.Tailoring.store.management.Model.Tailor;
import com.Tailoring.store.management.Model.User;
import com.Tailoring.store.management.Model.User;

@Controller
@SessionAttributes("name")
public class TailorController {

	@Autowired
	private TailorService tailorService;

	@RequestMapping(value = "/updateShopDetails", method = RequestMethod.GET)
	public String tailorFront(@ModelAttribute("tailor") Tailor tailorView) {
		return "tailor";
	}

	@RequestMapping(value="/tailorRegister",method = RequestMethod.POST)
	public String tailorRegistration(@ModelAttribute("tailor")Tailor tailorReg,ModelMap model){
		System.out.println(model.get("name"));
	tailorReg.setUserId((String)model.get("name"));
		if(tailorService.addTailor(tailorReg)) {
			model.put("updateStatus", "Details updated Successfully");
		}
		else {
			model.put("updateStatus", "Error Occured");
		}
		
		return "tailorSuccessLogin";
	}
	
	@RequestMapping(value="/updatePatterns", method=RequestMethod.GET)
	public String updatePatternAndCost(@ModelAttribute("update") PatternAndCost pattern,ModelMap model){
		List<String> dresstype= new ArrayList<String>();
		//List<DressType> dresstype= tailorService.readDressType();
	     dresstype=tailorService.readDressType();
		model.put("dresstype", dresstype);
		return "updatePatternAndCost";
	}
	

	@RequestMapping(value="/updatePatternsSuccess", method=RequestMethod.POST)
	public String updatePatternAndCostSuccess(@ModelAttribute("update") PatternAndCost pattern,ModelMap model){
		String name=(String) model.get("name");
		System.out.println((String) model.get("name"));
		if(tailorService.addPatternAndCost(pattern, name)) {
			model.put("updateStatus", "Pattern Added Successfully");
		}
		else {
			model.put("updateStatus", "Error Occured");
		}
		
		return "redirect:/updatePatterns";
	}
	
	
	
	@RequestMapping(value="/DressTypes", method=RequestMethod.GET)
	public String selectDressType(ModelMap model){
		List<DressAndCategory> tailordresstype= new ArrayList<DressAndCategory>();
		//List<DressType> dresstype= tailorService.readDressType();
		tailordresstype=tailorService.readTailorDressType();
		model.put("tailordresstype", tailordresstype);
		return "tailorDressType";
		
		
	}
	
	
	@RequestMapping(value="//tailorDressType", method=RequestMethod.GET)
	public String tailorDressType(@ModelAttribute("dress") DressAndCategory dressAndCategory,ModelMap model){
		String name=(String) model.get("name");
		System.out.println((String) model.get("name"));
		if(tailorService.addToTailorDressType(dressAndCategory, name)) {
			model.put("updateStatus", "Pattern Added Successfully");
		}
		else {
			model.put("updateStatus", "Error Occured");
		}
		
		return "redirect:/tailorDressType";
	}
	
	
	
	
	
	
	
	
	
}