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

	<title>問い合わせ管理画面</title>
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
			height: auto;
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
			<p>お問い合わせ管理画面</p>
		</div>

		<div id="qu">
			<p>▼お問い合わせ履歴▼</p>
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

	<br>
		<p>お問い合わせ履歴を削除する</p>

		<s:form action="InquiryCompleteAction">
			<input type="hidden" name="deleteFlg" value="1">
			<s:submit value="削除" method="delete" />
		</s:form>

		<div id="text-link">
			<a href='<s:url action="AdminLoginAction" />'>戻る</a>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>

</body>
</html>