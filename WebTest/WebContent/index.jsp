<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${param.name}
${'登录页面'}
<br>
${'haoa'};

<form action="MyServlet/UserServlet" method="post" >
			
		<table align="center" cellpadding="10">
			<tr>
				<td align="center">姓名</td>
				<td align="center"><input type="text" name="name"></td>
			</tr>
			<tr>
				<td align="center"><input type="submit" value="登录"></td>
			</tr>
		</table>
	</form>
</body>
</html>