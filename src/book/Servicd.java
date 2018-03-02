package book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Servicd {
	 //查询所有（查）  
    @SuppressWarnings("finally")
	public ArrayList<Model> findAll(){  
        Connection con=null;  
        PreparedStatement psta=null;  
        ResultSet rs=null;  
        ArrayList<Model> list=new ArrayList<Model>();  
        String sql="select * from book";  
        try{  
            con=Dao.getconnection();  
            psta=con.prepareStatement(sql);  
            rs=psta.executeQuery();  
            while(rs.next()){  
                Model obj=new Model();  
                obj.setId(rs.getInt(1));  
                obj.setAuthor(rs.getString(2));
                obj.setDescription(rs.getString(3));
                obj.setName(rs.getString(4));
                obj.setNumber(rs.getInt(5));
               
                list.add(obj);  
            }  
        }catch(Exception e){  
            e.printStackTrace();  
        }finally{  
            try{  
                Dao.close(rs, psta, con);  
            }catch(Exception e){  
                e.printStackTrace();  
            }  
            return list;  
        }  
    }  
      
    //插入方法（增）  
    @SuppressWarnings("finally")
	public boolean save(Model obj){  
        Connection con=null;  
        PreparedStatement psta=null;  
        boolean flag=false;  
        try{  
            String str="insert into model (id,number,author,description,bookname)values(?,?,?,?,?)";  

            con=Dao.getconnection();  
            psta=con.prepareStatement(str);  
            psta.setString(1, obj.getName());  
            psta.setString(2, obj.getDescription());  
            psta.setString(3, obj.getAuthor());  
            psta.setLong(4, obj.getId());  
            psta.setLong(5, obj.getNumber());  
            flag=psta.executeUpdate()>0;  
        }catch(Exception e){  
            e.printStackTrace();  
        }finally{  
            try{  
                Dao.close(null, psta, con);  
            }catch(Exception e){  
                e.printStackTrace();  
            }  
            return flag;  
        }  
    }  
      
    //删除方法（删）  
    @SuppressWarnings("finally")
	public boolean remove(int id){  
        Connection con=null;  
        PreparedStatement psta=null;  
        boolean flag=false;  
        String sql="delete from model where id=?";  
        try{  
            con=Dao.getconnection();  
            psta=con.prepareStatement(sql);  
            psta.setInt(1, id);  
            flag=psta.executeUpdate()>0;  
        }catch(Exception e){  
            e.printStackTrace();  
        }finally{  
            try{  
                Dao.close(null, psta, con);  
            }catch(Exception e){  
                e.printStackTrace();  
            }  
            return flag;  
        }  
    }  
    //通过id修改，为更新做准备的（改）  
            @SuppressWarnings("finally")
			public Model findById(int id){  
                Connection con=null;  
                PreparedStatement psta=null;  
                ResultSet rs=null;  
                Model obj=null;  
                String sql="select * from model where id=?";  
                try{  
                    con=Dao.getconnection();  
                    psta=con.prepareStatement(sql);  
                    psta.setInt(1, id);  
                    rs=psta.executeQuery();  
                    if(rs.next()){  
                        obj=new Model();  
                        obj.setId(rs.getInt(1));  
                        obj.setName(rs.getString(2));  
                        obj.setAuthor(rs.getString(3));;  
                        obj.setDescription(rs.getString(4));;  
                        obj.setNumber(rs.getInt(5));
                    }  
                }catch(Exception e){  
                    e.printStackTrace();  
                }finally{  
                    try{  
                        Dao.close(rs, psta, con);  
                    }catch(Exception e){  
                        e.printStackTrace();  
                    }  
                    return obj;  
                }  
            }  
      
    //更新方法（修改数据）（改）  
    @SuppressWarnings("finally")
	public boolean update(Model obj){  
        Connection con=null;  
        PreparedStatement psta=null;  
        String sql="update model set number=?,=?,description=?,=?,author=?,bookname=? where id=?";  
        boolean flag=false;  
        try{  
            con=Dao.getconnection();  
            psta=con.prepareStatement(sql);  
            psta.setString(1, obj.getDescription());  
            psta.setString(2, obj.getAuthor());  
            psta.setString(3, obj.getName());  
            psta.setInt(4, obj.getId());  
            psta.setInt(5, obj.getNumber());    
            flag=psta.executeUpdate()>0;  
        }catch(Exception e){  
            e.printStackTrace();  
        }finally{  
            try{  
                Dao.close(null, psta, con);  
            }catch(Exception e){  
                e.printStackTrace();  
            }  
            return flag;  
        }  
    }  
      
      

}
