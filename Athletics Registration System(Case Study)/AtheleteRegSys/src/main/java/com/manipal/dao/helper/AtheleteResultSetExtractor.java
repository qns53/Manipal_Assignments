package com.manipal.dao.helper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.manipal.model.Athelete;

public class AtheleteResultSetExtractor implements ResultSetExtractor<List<Athelete>> {

	@Override
	public List<Athelete> extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		List<Athelete> athList = new ArrayList<>();
		while(rs.next()) {
			Athelete ath = new Athelete();
			ath.setId(rs.getInt(1));
			ath.setName(rs.getString(2));
			ath.setGender(rs.getString(3));
			ath.setCategory(rs.getString(4));
			ath.setEmail(rs.getString(5));
			ath.setMobile(rs.getString(6));
			
			athList.add(ath);
			}
		
		return athList;
	}

}
