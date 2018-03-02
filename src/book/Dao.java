package book;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Dao {
	public static final String url="jdbc:mysql://localhost:3306/book?characterEncoding=utf-8";
	public static final String user="root";
	public static final String password="root";

	public static  Connection getconnection() throws SQLException, ClassNotFoundException {
	
			Connection conn=DriverManager.getConnection(url,user,password);
		
			Class.forName("com.mysql.jdbc.Driver");
		
			
	
		return conn;
	}

	public static void close(ResultSet rs,Statement sta,Connection con)throws Exception{  
        if(rs!=null){  
                 //关闭结果集  
                rs.close();  
        }  
        if(sta!=null){  
                 //关闭操作句柄  
                 sta.close();  
        }  
        if(con!=null){  
                //关闭链接  
                con.close();  
        }  
    }  
}
