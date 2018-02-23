<%@ page language="java" contentType="text/html;
					charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html
PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
				 "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	  content="text/html; charset=UTF-8">
<title>WELCOME</title>
</head>

<body>

	名前とパスワードを入力してください。
	<form method="post" action="WelcomeServlet">
	<input type="text" name="username">
	<input type="password" name="password">
	<input type="submit" value="送信">
	</form>

</body>
</html>