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
	<title>商品更新入力画面</title>

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
			<p>商品更新情入力画面</p>
		</div>
		<div>
			<h3>更新する情報を入力してください。</h3>
			<s:form action="ItemManageDecideAction">
			<table>
				<s:iterator value="list">
				<tr>
					<td>
						<span>商品名</span>
					</td>
					<td>
						<input type="text" name="item_name" value="<s:property value='itemName'/>">
					</td>
				</tr>
				<tr>
					<td>
						<span>値段</span>
					</td>
					<td>
						<input type="text" name="item_price" value="<s:property value='itemPrice'/>">
					</td>
				</tr>
				<tr>
					<td>
						<span>在庫</span>
					</td>
					<td>
					<s:if test="item_stock>0">
						<input type="text" name="item_stock" value="<s:property value='item_stock'/>">
					</s:if>
					<s:else>
						<input type="text" name="item_stock" value="<s:property value='item_stock_null'/>">
					</s:else>
					</td>
				</tr>
				</s:iterator>
			</table>
			<br>
				<p><s:submit value="更新する" /></p>
		</s:form>
		<br><br>
			<div>
				<p>前画面に戻る場合は<a href='<s:url action="GoItemManageAction" />'>こちら</a></p>
			</div>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>