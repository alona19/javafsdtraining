package com.ust.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;



public class PatientDao {
	

	
		JdbcTemplate template;

			public JdbcTemplate getTemplate() {
				return template;
			}

			public void setTemplate(JdbcTemplate template) {
				this.template = template;
			}
			
			public int insert(Patient pat){
				String sql="insert into patient values("+pat.getPid()+",'"+pat.getPname()+"'," +pat.getAge()+","+pat.getGender()+"'," +pat.getAddress()+",'"+pat.getPhoneno()+")";
				return template.update(sql);
			}

			public int update(Patient pat) {
			String sql = "update patient set pname = '"+pat.getPname()+"', "
			+ "age = "+pat.getAge()+"gender = "+pat.getGender()+"address = "+pat.getAddress()+" where pid= "+pat.getPid()+")";
			return template.update(sql);
			}
			
			public int delete(int pid) {
				String sql = "delete from patient where pid= "+pid;
				return template.update(sql);
				}
			public Patient findById(int user_id){
				String sql= "select pid,pname,age,gender,address from patient";
				return template.queryForObject(sql,new Object[] { user_id },
						new BeanPropertyRowMapper<Patient>(Patient.class));
			}
			public List<Patient>findAll() {
				return template.query("select id,name,age,salary from patient",new RowMapper<Patient>(){
						public Patient mapRow(ResultSet rs,int row)throws SQLException{
					Patient pat = new Patient();
					pat.setPid(rs.getInt(1));
					pat.setPname(rs.getString(2));
					pat.setAge(rs.getInt(3));
					pat.setGender(rs.getString(4));
					pat.setAddress(rs.getString(5));
					pat.setPhoneno(rs.getLong(6));
					
					
					return pat;
				}
				
				});
				
					}

			

				
			
			

		


	}



