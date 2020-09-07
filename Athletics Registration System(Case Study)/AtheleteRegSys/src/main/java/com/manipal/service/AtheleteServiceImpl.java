package com.manipal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.manipal.dao.AtheleteDAOImpl;
import com.manipal.model.Athelete;

public class AtheleteServiceImpl implements IAtheleteService {
	@Autowired
	AtheleteDAOImpl athDao;
	
	public String addAthelete(Athelete ath) {
		String fail="Record Insertion Failed";
		if(!validateName(ath.getName())) {
			return fail+": Name should be present with first letter Uppercase and its length should be less than 40";
		}
		if(!validateGender(ath.getGender())) {
			return fail+": Gender should be selected";
		}
		if(!validateCategory(ath.getCategory())) {
			return fail+": Select Category Properly";
		}
		if(!validateEmail(ath.getEmail())) {
			return fail+": Enter Valid Email Address";
		}
		if(!validateMobile(ath.getMobile())) {
			return fail+": Enter Valid Mobile Number";
		}
		int autoId=athDao.getAutoId();
		ath.setId(autoId);
		if(athDao.addAthelete(ath)==0) {
			return fail;
		}
		
		return "Record Added Successfully\n Auto Generated id is: "+autoId;
	}
	
	public List<Athelete> getAllAtheletes(){
		return athDao.getAllAtheletes();
	}
	
	public String deleteAthlete(String id) {
		String s="Record Deletion failed";
		try {
			Integer.parseInt(id);
		}
		catch(Exception e) {
			return s+": Enter Valid ID";
		}
		
		if(athDao.deleteAthlete(id)==0) {
			return s;
		}
		
		return "Record Successfully Deleted";
		
	}
	public String updateAthlete(Athelete ath) {
		Athelete ath_1=athDao.getAthlete(ath.getId());
		if(ath_1==null)return "Please Enter Valid Id";
		
		if(ath.getName()!=null&&ath.getName().length()!=0) {
			if(!validateName(ath.getName()))return "Enter Valid Name";
			}
			if(ath.getGender()!=null&&ath.getGender().length()!=0) {
				if(!validateGender(ath.getGender()))return "Enter Valid Number";;
			}
			if(ath.getCategory()!=null&&ath.getCategory().length()!=0) {
				if(!validateCategory(ath.getCategory()))return "Enter valid Category";
			}
			if(ath.getEmail()!=null&&ath.getEmail().length()!=0) {
				if(!validateEmail(ath.getEmail()))return "Enter Valid Email";
			}
			if(ath.getMobile()!=null&&ath.getMobile().length()!=0) {
				if(!validateMobile(ath.getMobile()))return "Enter Valid mobile";
			}
			
			if(athDao.updateAthlete(ath)==0) {
				return "Record Updation Failed";
			}
			
			return "Record Updated Successfully";
		}
	
	
	@Override
	public boolean validateName(String name) {
		// TODO Auto-generated method stub
		if(name.length()==0)return false;
		if(!Character.isUpperCase(name.charAt(0)))return false;
		if(name.length()>40)return false;
		return true;
	}

	@Override
	public boolean validateGender(String gender) {
		// TODO Auto-generated method stub
		if(gender.equals("male"))return true;
		if(gender.equals("female"))return true;
		return false;
	}

	@Override
	public boolean validateCategory(String category) {
		// TODO Auto-generated method stub
		if(category.equals("Running"))return true;
		if(category.equals("High jump"))return true;
		if(category.equals("Hurdles"))return true;
		if(category.equals("Relay"))return true;
		if(category.equals("Javelin Throw"))return true;
		if(category.equals("Shot put"))return true;
		
		return false;
	}

	@Override
	public boolean validateEmail(String email) {
		// TODO Auto-generated method stub
		int at=0;
		int dot=0;
		for(int i=0;i<email.length();i++) {
			if(email.charAt(i)=='@') {
				at=i;
			}
			else if(email.charAt(i)=='.') {
				dot=i;
			}
		}
		
		if(dot!=0&&at!=0&&dot>at)return true;
		return false;
	}

	@Override
	public boolean validateMobile(String mob) {
		// TODO Auto-generated method stub
		
		if(mob.length()==10)return true;
		return false;
	}

}
