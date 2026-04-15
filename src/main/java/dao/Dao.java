package dao;

import java.sql.Connection;

import javax.sql.DataSource;

public class Dao {
	DataSource ds;
	
	public Connection getConnection() throws Exception {
		Connection con = ds.getConnection();
		return con;
	}
}
	
