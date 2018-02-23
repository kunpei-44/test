<%@ page language="java"
		 contentType="text/html; charset=UTF-8"
    	 pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
					"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset=UTF-8">
<title>お問合わせフォーム</title>
</head>

<body>

	<form method="post" action="InquiryServlet">
		名前：<br><input type="text" name="name"><br>
		お問合わせの種類：<br><select name="qtype">
			<option value="company">会社について</option>
			<option value="product">製品について</option>
			<option value="support">アフターサポートについて</option>
		</select><br>お問合わせ内容：<br>
		<textarea name="body">
		</textarea>
			<br><input type="submit" value="登録">
	</form>

</body>
</html>