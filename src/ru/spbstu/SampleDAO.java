package ru.spbstu;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

public class SampleDAO extends SimpleJdbcDaoSupport {

	private void foo() {
		
		First amp = getSimpleJdbcTemplate().queryForObject("select name from first where id=?", new ParameterizedRowMapper<First>() {

			@Override
			public First mapRow(ResultSet rs, int idx) throws SQLException {
				First f = new First();
				f.setName(rs.getString("name"));
				return f;
			}
			
		}, "10");

	}
	
}
