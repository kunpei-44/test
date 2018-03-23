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

	<title>Home画面</title>
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

		#text-center{
			display: inline-block;
			text-align: center;
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
			<p>Home</p>
		</div>
		<div id="text-center">
			<s:form action="HomeAction">
				<s:submit value="商品購入" />
			</s:form>

		<br/>
			<s:form action="InquiryAction">
				<s:submit value="問い合わせ" />
			</s:form>

		<br/>
			<s:form action="AdminAction">
				<s:submit value="管理者画面" />
			</s:form>

		<br/>
			<s:if test="#session.id!=null">
				<p>ログアウトする場合は
					<a href='<s:url action="LogoutAction" />'>こちら</a></p>
			</s:if>
		</div>

		<table border="1">
				<tr>
					<td>名前</td>
					<td>お問い合わせの種類</td>
					<td>お問い合わせ内容</td>
					<td>お問い合わせ送信時間</td>
				</tr>

				<s:iterator value="session.inquiryDTOList">
				<tr>

					<td><s:property value="name" /></td>
					<s:if test='qtype=="company"'>
						<td>会社について</td>
					</s:if>
					<s:if test='qtype=="product"'>
						<td>製品について</td>
					</s:if>
					<s:if test='qtype=="support"'>
						<td>アフターサポートについて</td>
					</s:if>
					<td><s:property value="body" /></td>
					<td><s:property value="insert_date" /></td>

				</tr>
				</s:iterator>
		</table>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>