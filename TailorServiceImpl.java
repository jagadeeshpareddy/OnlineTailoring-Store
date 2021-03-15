package com.Tailoring.store.management.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Tailoring.store.management.Model.DressAndCategory;
import com.Tailoring.store.management.Model.PatternAndCost;
import com.Tailoring.store.management.Model.Tailor;


@Service("tailorService")
public class TailorServiceImpl implements TailorService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	// --------------------------------------------------------
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// --------------------------------------------------------
	public boolean addTailor(Tailor register) {
		String sql = "insert into tailor_table(shop_name,address,contact_number,working_hours,available_services,courier,user_id) values(?,?,?,?,?,?,?)";
		int id = 0;
		try { 
			String sql1 = "SELECT id FROM user_table WHERE username ='"+ register.getUserId()+ "'";
	     id= jdbcTemplate.queryForObject(sql1, Integer.class);
			int counter = jdbcTemplate.update(sql,
					new Object[] { register.getShopName(), register.getAddress(), register.getContactNumber(),
							register.getWorkingHours(), register.getAvailableServices(), Integer.parseInt(register.getCourier()),id});

			 return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	
	
	
	public boolean addPatternAndCost(PatternAndCost pattern,String name) {
		String sql = "insert into pattern(pat,cost,tailordresstypes_id) values(?,?,?)";
		int id1 = 0;
		int id2=0;
		try { 
			
			String sql2 = "SELECT id FROM dress_type WHERE dress_type ='"+pattern.getDressType()+ "'";
			
	     
	     id1= jdbcTemplate.queryForObject(sql2, Integer.class);
	     String sql1 = "SELECT id FROM tailordresstypes WHERE dress_type_id ='"+id1+ "'";
	     id2= jdbcTemplate.queryForObject(sql1, Integer.class);
			int counter = jdbcTemplate.update(sql,
					new Object[] {pattern.getPattern(),pattern.getCost(),id2 });

			 return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}


	
	
	
	

	// -----------------------------------------------
	@Override
	public List<Tailor> read() {
		List<Tailor> userList = jdbcTemplate.query("select * from tailor_table", new RowMapper<Tailor>() {

			@Override
			public Tailor mapRow(ResultSet set, int rowNum) throws SQLException {
				Tailor tailor = new Tailor();

				
				return tailor;
			}
		});
		return userList;
	}
	
	public List<String> readDressType() {
		List<String> userList = jdbcTemplate.query("select dress_type from tailordresstypes,dress_type where tailordresstypes.dress_type_id= dress_type.id", new RowMapper<String>() {

			@Override
			public String mapRow(ResultSet set, int rowNum) throws SQLException {
				
				

				
				
				return set.getString("dress_type");
			}
		});
		return userList;
	}
	
	public List<DressAndCategory> readTailorDressType() {
		List<DressAndCategory> userList = jdbcTemplate.query("select dress_type,category from dress_type,category where dress_type.category_id=category.id", new RowMapper<DressAndCategory>() {

			@Override
			public DressAndCategory mapRow(ResultSet set, int rowNum) throws SQLException {
				DressAndCategory dress=new DressAndCategory();
				dress.setDressType(set.getString("dress_type"));
				dress.setCategory(set.getString("category"));
				
				

				
				
				return dress;
			}
		});
		return userList;
	}
	
	
	
	public boolean addToTailorDressType(DressAndCategory dressAndCategory, String name){
		return false;
		
	}
	
	
	
	
}
