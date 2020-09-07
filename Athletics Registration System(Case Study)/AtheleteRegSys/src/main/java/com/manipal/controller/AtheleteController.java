package com.manipal.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.manipal.model.Athelete;
import com.manipal.service.AtheleteServiceImpl;

@Controller
public class AtheleteController {
	
	@Autowired
	AtheleteServiceImpl athSer;
	
	@RequestMapping(value="athRegForm")
	public String getForm() {
		return "addAthForm";
	}
	
	@RequestMapping(value="delAth")
	public String getForm1() {
		return "delAth";
	}
	
	@RequestMapping(value="updAth")
	public String getForm2() {
		return "updAth";
	}
	
	@RequestMapping(value="home")
	public String getHome() {
		return "home";
	}
	
	@RequestMapping(value="/addAthelete", method=RequestMethod.POST)	
	public ModelAndView addAthDetails(@ModelAttribute Athelete ath) {
		String st="";
		try {
		st=athSer.addAthelete(ath);
		}
		catch(Exception e) {
			return new ModelAndView("Status","message","All the fields are Required and should have valid values for Record Insertion");
			
		}
		ModelAndView modelAndView=new ModelAndView("Status","message",st);
		return modelAndView;
		
	}
	
	@RequestMapping(value="/delAthelete", method=RequestMethod.POST)	
	public ModelAndView delAthDetails(@RequestParam String athId) {
		String st="";
		try {
		st=athSer.deleteAthlete(athId);
		}
		catch(Exception e) {
			return new ModelAndView("Status","message","All the fields are Required and should have valid values for Record Deletion");
			
		}
		ModelAndView modelAndView=new ModelAndView("Status","message",st);
		return modelAndView;
		
	}
	
	@RequestMapping(value="/updAthelete", method=RequestMethod.POST)	
	public ModelAndView updAthDetails(@RequestParam String updId,@ModelAttribute Athelete ath) {
		String st="";
		
		try {
		ath.setId(Integer.parseInt(updId));
		st=athSer.updateAthlete(ath);
		}
		catch(Exception e) {
			return new ModelAndView("Status","message","Fields should have valid values for Record Updation");
			
		}
		ModelAndView modelAndView=new ModelAndView("Status","message",st);
		return modelAndView;
		
	}
	
	@RequestMapping(value="/showAtheletes", method=RequestMethod.GET)
	public ModelAndView showAthDetails() {
		ModelAndView modelAndView;
		List<Athelete> list=athSer.getAllAtheletes();
		if(list.size()==0) {
			modelAndView=new ModelAndView("Status","message","No Records Found");
			return modelAndView;
		}
		modelAndView=new ModelAndView("showAth","list",list);
		return modelAndView;

	}
	
}
