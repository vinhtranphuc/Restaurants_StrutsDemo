<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Sửa Nhà Hàng</h3>
<html:form action="/suaNhaHang.do">
<table>
	<tr>
		<td>
		Mã Nhà Hàng
		</td>
		<td>
		<html:text property="maNhaHang" readonly="true" name="nhaHangForm"></html:text>
		</td>
	</tr>
	<tr>
		<td>
		Tên Nhà Hàng
		</td>
		<td>
		<html:text property="tenNhaHang" name="nhaHangForm"></html:text>
		</td>
	</tr>
	<tr>
		<td>
		Khu vực:
		</td>
		<td>
	<html:select property="maKhuVuc">
	<option value="">Chọn khu vục</option>
<html:optionsCollection name="nhaHangForm" property="listKhuVuc" value="maKhuVuc" label="tenKhuVuc"></html:optionsCollection>
	</html:select>
		</td>
	</tr>
	<tr>
		<td colspan="2">
		<html:submit value="Sua" property="sua"></html:submit>
		<button onclick="history.go(-1;)">Quay lại</button>
		</td>
	</tr>
</table>
</html:form>
</body>
