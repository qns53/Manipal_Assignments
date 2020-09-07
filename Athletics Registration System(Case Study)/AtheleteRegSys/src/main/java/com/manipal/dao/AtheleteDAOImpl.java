package com.manipal.dao;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.manipal.dao.helper.AtheleteResultSetExtractor;
import com.manipal.dao.helper.SingleAtheleteResultSetExtractor;
import com.manipal.model.Athelete;

public class AtheleteDAOImpl implements IAtheleteDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public int addAthelete(Athelete ath) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO athelete VALUES(?,?,?,?,?,?)";
		int status = jdbcTemplate.update(query, ath.getId(), ath.getName(),ath.getGender(),ath.getCategory(),ath.getEmail(),Long.parseLong(ath.getMobile()));
		return status;	
	}

	@Override
	public List<Athelete> getAllAtheletes() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM athelete";
		List<Athelete> athList = jdbcTemplate.query(sql, new AtheleteResultSetExtractor());
		return athList;
	}
	
	public int deleteAthlete(String id) {
		String sql="DELETE FROM athregsys.athelete WHERE athelete_id="+id;
		int status = jdbcTemplate.update(sql);
		return status;	
	}
	
	public Athelete getAthlete(int id) {
		String sql="SELECT * FROM athelete WHERE athelete_id="+id;
		Athelete ath = jdbcTemplate.query(sql, new SingleAtheleteResultSetExtractor()); 
		return ath;
		}
	
	public int updateAthlete(Athelete ath) {
		String sql="UPDATE athelete SET ";
		Map<String,String> map=new LinkedHashMap<String,String>();
		if(ath.getName()!=null&&ath.getName().length()!=0) {
		map.put("athelete_name",ath.getName());
		}
		if(ath.getGender()!=null&&ath.getGender().length()!=0) {
			map.put("athelete_gender",ath.getGender());
		}
		if(ath.getCategory()!=null&&ath.getCategory().length()!=0) {
			map.put("category",ath.getCategory());
		}
		if(ath.getEmail()!=null&&ath.getEmail().length()!=0) {
			map.put("athelete_email",ath.getEmail());
		}
		if(ath.getMobile()!=null&&ath.getMobile().length()!=0) {
			map.put("athelete_mobile",ath.getMobile());
		}
		int i=map.size();
		for(Map.Entry<String, String> m : map.entrySet()) {
			if(m.getKey().equals("athelete_mobile")) {
				sql=sql+m.getKey()+"="+Long.parseLong(m.getValue())+" ";
			}
			else if(i==1) {
				sql=sql+m.getKey()+"='"+m.getValue()+"' ";
			}
			else {
			sql=sql+m.getKey()+"='"+m.getValue()+"', ";
			}
			i--;
		}
		sql=sql+"WHERE athelete_id="+ath.getId();
		int status = jdbcTemplate.update(sql);
		return status;	
	}
	public int getAutoId() {
		String sql = "SELECT * FROM athelete";
		List<Athelete> athList = jdbcTemplate.query(sql, new AtheleteResultSetExtractor());
		if(athList.size()==0)return 1000;
		int id=1000;
		for(Athelete ath: athList) {
			if(ath.getId()>id) {
				id=ath.getId();
			}
		}
		return id+1;
	}

}
