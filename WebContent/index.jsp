<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="" method="post" onsubmit="check(this)">  
    <table align="center" width="450">  
        <tr>  
            <td align="center" colspan="2">  
                <h2>添加图书信息</h2>  
                <hr>  
            </td>  
        </tr>  
  
        <tr>  
            <td align="right">图书名称：</td>  
            <td><input type="text" name="name"></td>  
        </tr>  
  
        <tr>  
            <td align="right">价 格：</td>  
            <td><input type="text" name="price"></td>  
        </tr>  
  
        <tr>  
            <td align="right">数 量：</td>  
            <td><input type="text" name="bookCount" /></td>  
        </tr>  
        <tr>  
            <td align="right">作 者：</td>  
            <td><input type="text" name="author" /></td>  
        </tr>  
        <tr>  
            <td align="center" colspan="2"><input type="submit" value="添　加">  
            </td>  
        </tr>  
         </table>  
</form>  
  
<h2 align="center">  
    <a href="FindServlet">查询图书信息</a>  
</h2>  
  

</body>
</html>