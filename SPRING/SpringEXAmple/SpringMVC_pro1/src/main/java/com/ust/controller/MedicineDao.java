package com.ust.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class MedicineDao {
	
	JdbcTemplate template;

		public JdbcTemplate getTemplate() {
			return template;
		}

		public void setTemplate(JdbcTemplate template) {
			this.template = template;
		}
		
		public int insert(Medicine med){
			String sql="insert into Medicine values("+med.getMid()+",'"+med.getMname()+"'," +med.getPrice()+","+ ""+med.getQty()+")";
			return template.update(sql);
		}

		public int update(Medicine med) {
		String sql = "update Medicine set mname = '"+med.getMname()+"', "
		+ "price = "+med.getPrice()+"role"+med.getQty()+" where id= "+med.getMid()+")";
		return template.update(sql);
		}
		
		public int delete(int mid) {
			String sql = "delete from Medicine where id= "+mid;
			return template.update(sql);
			}
		public Medicine findById(int mid){
			String sql= "select * from Medicine";
			return template.queryForObject(sql,new Object[] { mid },
					new BeanPropertyRowMapper<Medicine>(Medicine.class));
		}
		public List<Medicine>findAll() {
			return template.query("select user_id,user_name,password,role from Medicine",new RowMapper<Medicine>(){
					public Medicine mapRow(ResultSet rs,int row)throws SQLException{
				Medicine med = new Medicine();
				med.setMid(rs.getInt(1));
				med.setMname(rs.getString(2));
				med.setPrice(rs.getDouble(3));
				med.setQty(rs.getInt(4));
				
				
				
				return med;
		}
			
		});
	}

}
