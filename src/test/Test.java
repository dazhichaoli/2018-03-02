package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import book.Dao;
import book.Model;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Model model=new Model();
		model.setAuthor("–°€§");
		model.setDescription("‰Ø¿¿");
		model.setId(7);
		model.setNumber(0004);
//		boolean insert = false;
//		Servicd service = new Servicd();
//		insert=service.save(model);
//		System.out.println(insert);
		
		Connection conn =Dao.getconnection();
		
		String str ="insert into model (number,description,author,bookname) values(?,?,?,?)";
		try {
			if(conn==null){
				  System.out.println("conn is null");
				}
//			 java.sql.PreparedStatement pst=conn.prepareStatement("insert into model (id,number,description,author,bookname) values(1,001,'zhi','zhi','zhi')");
			 PreparedStatement pst =conn.prepareStatement(str);
			 pst.setString(4, model.getName());  
	         pst.setString(2, model.getDescription());  
	         pst.setString(3, model.getAuthor());  
	         pst.setLong(1, model.getNumber());  
//	         pst.setInt(1, model.getId());
	         pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
