package model;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controller.DBConn;
import view.register;

public class DButill {
 
	private static Connection conn = null;
	private static PreparedStatement ps = null;

	
	/**
	 * Insert方法封装
	 * @param stu 传入参数
	 */
	public static void Insert() {
		conn = DBConn.conn();		//调用 DBconnection 类的 conn() 方法连接数据库
		String sql = "INSERT INTO customers (user_name,user_password) VALUES(?,?)";		//插入sql语句
		try {
			ps = conn.prepareStatement(sql);
			
			/**
			 * 调用实体StuInfo类,获取需要插入的各个字段的值
			 * 注意参数占位的位置
			 * 通过get方法取参数的值
			 */
			ps.setString(1, register.GetUsername());
			ps.setString(2, register.GetPassword());
			
			
			ps.executeUpdate();			//执行sql语句
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBConn.close();
		}
	}
}
	
