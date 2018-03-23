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

	<title>お問い合わせ　受付完了画面</title>
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
			height: auto;
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
			<p>お問い合わせの受付を完了致しました。</p>
		</div>
		<br>
		<h3><s:property value="name" />さん、お問い合わせありがとうございました。</h3>
		<br>
		<br>
		<h3>またのご利用をお待ちしています。</h3>


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