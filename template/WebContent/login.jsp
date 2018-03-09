<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta http-equiv="Contemt-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />

	<title>Login画面</title>
	<style type="text/css">
		body{
			margin: 0;
			padding: 0;
			line-height: 1.6;
			letter-spacing: 1px;
			font-size: 12px;
			font-family: Verdana, Helvetica, sans-serif;
			color: #333;
			backround: #fff;
		}

		table{
			text-align: center;
			margin: 0 auto;
		}

		#top{
			width: 780px;
			margin: 0 auto;
			border: 1px solid #333;
		}

		#header{
			width: 100%;
			height: 80px;
			text-align: center;
		}

		#footer{
			width: 100%;
			height: 80px;
			background-color: black;
			clear: both;
		}

	</style>
</head>
<body>

	<div id = "header">
		<div id = "top">
			<p>Login</p>
		</div>
		<div>
			<h3>商品を購入する際にはログインをお願いします。</h3>
			<s:form action="LoginAction">
				<s:textfield name="loginUserId" />
				<s:password name="loginPassword" />
				<s:submit value="ログイン" />
			</s:form>
			<br/>
			<div>
				<span>新規ユーザー登録は
					<a href='<s:url action="UserCreateAction" />'>こちら</a>
				</span>
			</div>
		</div>
	</div>
</body>
</html>