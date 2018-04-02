<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />

	<title>管理者画面</title>
	<style type="text/css">
		body {
			margin: 0;
			padding: 0;
			line-height: 1.6;
			letter-spacing: 1px;
			font-family: Verdana, Helvetica, sans-serif;
			font-size: 12px;
			color: #333;
			background: #fff;
		}

		table {
			text-align: center;
			margin: 0 auto;
		}

		#top {
			width: 780px;
			margin: 30px auto;
			border: 1px solid #333;
		}

		#header {
			width: 100%;
			height: 80px;
			background-color: black;
		}

		#main {
			width: 100%;
			height: 500px;
			text-align: center;
		}

		#main h3{
			padding: 10px;
		}

		#footer {
			width: 100%;
			height: 80px;
			background-color: black;
			clear: both;
		}

		#text-link{
			display: inline-block;
			text-align: right;
			margin-top: 50px;
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
			<p>管理者画面</p>
		</div>

		<p>商品を管理する</p>
		<s:form action="GoItemManageAction">
			<s:submit value="商品管理" />
		</s:form>

		<p>問い合わせを管理する</p>
		<s:form action="AdminInquiryAction">
			<s:submit value="問い合わせ管理" />
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