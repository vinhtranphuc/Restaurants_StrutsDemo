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
<h3>Danh sách nhà hàng</h3>
<html:form action="/danh-sach.do">
   <html:select property="maKhuVuc">
					<option value="">-- Chọn khoa --</option>
					<html:optionsCollection name="danhSachNhaHangForm" property="listKhuVuc" 
						label="tenKhuVuc" value="maKhuVuc" />
	</html:select>
<html:submit value="xem" property="xem"></html:submit>
<button>
<html:link action="/themNhaHang.do">Thêm mới</html:link>
</button>

</html:form>
<table>
	<thead>
		<tr>
			<td>
			Mã Nhà Hàng
			</td>
			<td>
			Tên Nhà Hàng 
			</td>
			<td>
			Tên Khu Vực
			</td>
			<td>
			Thao tác
			</td>
		</tr>
	</thead>
	
	<tbody>
		<logic:iterate name="danhSachNhaHangForm" property="listNhaHang" id="nh">
		<tr>
			<td>
				<bean:write name="nh" property="maNhaHang"/>
			</td>
			<td>
				<bean:write name="nh" property="tenNhaHang"/>
			</td>
			<td>
				<bean:write name="nh" property="tenKhuVuc"/>
			</td>
			<td>
			<bean:define  name="nh" id="maNhaHang" property="maNhaHang"></bean:define>
			<html:link action="/suaNhaHang?maNhaHang=${maNhaHang}">Sửa</html:link>
			<html:link action="/xoaNhaHang?maNhaHang=${maNhaHang}">Xóa</html:link>
			</td>
		</tr>
		</logic:iterate>
	</tbody>
</table>
</body>
</html>