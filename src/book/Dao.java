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
                 //�رս����  
                rs.close();  
        }  
        if(sta!=null){  
                 //�رղ������  
                 sta.close();  
        }  
        if(con!=null){  
                //�ر�����  
                con.close();  
        }  
    }  
}
