<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />

	<title>お問い合わせ画面</title>
	<style type="text/css">
		body{
			margin: 0;
			padding: 0;
			line-height: 1.6;
			letter-spacing: 1px;
			font-family: Verdana, Helvetica, sans-serif;
			font-size: 12px;
			color: #333;
			background:#fff;
		}

		table{
			text-align: center;
			margin: 0 auto;
		}

		#top{
			width: 780px;
			margin: 30px auto;
			border: 1px solid #333;
		}

		#header{
			width:100%;
			height:80px;
			background-color: black;
		}

		#main{
			width: 100%;
			height: 500px;
			text-align: center;
		}

		#footer{
			width: 100%;
			height: 80px;
			background-color: black;
			clear: both;
		}

		#text-link{
			display: inline-block;
			text-align: right;
			margin-top: 50px;
			margin-bottom: 120px;
		}
		</style>
</head>
<body>

	<div id="header">
		<div id="pr">
		</div>
	</div>

	<div id="main">
		<div id="top">
			<p>お問い合わせフォーム</p>
		</div>
		<s:form method="post" action="InquiryCompleteAction">
			<p>名前：<input type="text" name="name" /></p><br>
			<p>お問い合わせの種類：
			<select name="qtype">
				<option value="company">会社について</option>
				<option value="product">製品について</option>
				<option value="support">アフターサポートについて</option>
			</select></p>
			<br><br>
			<p>お問い合わせ内容：
			<s:textarea name="body" /></p>
			<br>
			<p><s:submit value="登録" /></p>
		</s:form>

		<div id="text-link">
			<a href='<s:url action="GoHomeAction" />'>トップへ戻る</a>
		</div>
	</div>

	<div id="footer">
		<div id="pr">
		</div>
	</div>

</body>
</html>