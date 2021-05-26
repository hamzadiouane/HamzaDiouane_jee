/**
 * 
 */
package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author hp
 *
 */
public class DBInteraction {


	private static String url="jdbc:mysql://localhost/jeeprojet";
	private static Connection conn;
	private static Statement stat;
	public  static void connect()
	{
		
		try {
			//chargement du pilote
			Class.forName("com.mysql.cj.jdbc.Driver");
			//etablissement de la connection
			conn=DriverManager.getConnection(url,"root","");
			//create de statment
		    stat=conn.createStatement();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    public static void disconnect()
    {
    	try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    public static int Maj(String sql)
    {
    	int nb=0;
    	try {
			nb=stat.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return nb;
    }
    public static ResultSet select(String sql)
    {
    	ResultSet rs=null;
    	try {
			 rs = stat.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return rs;
    }
}

	