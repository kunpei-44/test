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
	<meta charset="utf-8">
	<title>更新完了画面</title>
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
			height: 600px;
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

	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>商品更新情完了画面</p>
		</div>
		<div>
			<h3>更新が完了しました。</h3>

			<br>

			<h3>商品の更新情報は以下の通りです。</h3>

			<table border="1">
				<tr>
					<th>商品名</th>
					<th>値段</th>
					<th>在庫</th>
				</tr>
				<tr>
					<td><s:property value="session.item_name" /></td>
					<td><s:property value="session.item_price" /></td>
					<td><s:property value="session.item_stock" /></td>
				</tr>
			</table>

			<br><br>

			<div>
				<p>他の商品を更新する場合は<a href='<s:url action="GoItemManageAction" />'>こちら</a></p>
				<p>ホーム画面に戻る場合は<a href='<s:url action="GoHomeAction" />'>こちら</a></p>
			</div>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>

</body>
</html>