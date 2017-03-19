package model.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.NhaHang;

public class NhaHangDAO extends DataProvider {

	public ArrayList<NhaHang> getListNhaHang() {
	String querry="Select * from NhaHang,KhuVuc where NhaHang.MaKhuVuc=KhuVuc.MaKhuVuc";
	ArrayList<NhaHang> listNhaHang = new ArrayList<NhaHang>();
	NhaHang nhaHang;
	try {
		ResultSet rs=exQ(querry);
		while(rs.next())
		{
		nhaHang=new NhaHang();
		nhaHang.setMaNhaHang(rs.getInt("MaNhaHang"));
		nhaHang.setTenNhaHang(rs.getString("TenNhaHang"));
		nhaHang.setTenKhuVuc(rs.getString("TenKhuVuc"));
		listNhaHang.add(nhaHang);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return listNhaHang;
	}

	public ArrayList<NhaHang> getListNhaHang(int maKhuVuc) {
		String querry="Select * from NhaHang,KhuVuc where NhaHang.MaKhuVuc=KhuVuc.MaKhuVuc and KhuVuc.MaKhuVuc="+maKhuVuc;
		ArrayList<NhaHang> listNhaHang = new ArrayList<NhaHang>();
		NhaHang nhaHang;
		try {
			ResultSet rs=exQ(querry);
			while(rs.next())
			{
			nhaHang=new NhaHang();
			nhaHang.setMaNhaHang(rs.getInt("MaNhaHang"));
			nhaHang.setTenNhaHang(rs.getString("TenNhaHang"));
			nhaHang.setTenKhuVuc(rs.getString("TenKhuVuc"));
			listNhaHang.add(nhaHang);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listNhaHang;
	}

	public String getTenNhaHang(int maNhaHang) {
		String querry="select * from NhaHang where MaNhaHang="+maNhaHang+"";
		return getCell(querry,"TenNhaHang");
	}

	public NhaHang getThongTinNhaHang(int maNhaHang) {
	String querry="Select * from NhaHang,KhuVuc where NhaHang.MaKhuVuc=KhuVuc.MaKhuVuc and MaNhaHang='"+maNhaHang+"'";
	NhaHang nhaHang=new NhaHang();
	try {
		ResultSet rs=exQ(querry);
		while(rs.next())
		{
		System.out.println("----------");
		nhaHang.setMaNhaHang(rs.getInt("MaNhaHang"));
		System.out.println(nhaHang.getMaNhaHang());
		
		nhaHang.setTenNhaHang(rs.getString("TenNhaHang"));
		System.out.println(rs.getString("TenNhaHang"));
		
		nhaHang.setMaKhuVuc(rs.getInt("MaKhuVuc"));
		System.out.println(rs.getString("MaKhuVuc"));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return nhaHang;
	}

	public void suaNhaHang(int maNhaHang, String tenNhaHang, int maKhuVuc) {
	System.out.println("NhaHangDAO: maNhaHang"+maNhaHang);
	System.out.println("tenNhaHang: "+tenNhaHang);
	System.out.println("TenKhuVuc: "+maKhuVuc);
	String querry="update NhaHang set TenNhaHang='"+tenNhaHang+"',MaKhuVuc='"+maKhuVuc+"' where MaNhaHang='"+maNhaHang+"'";
	try {
	exU(querry);
	} catch (SQLException e) {
	e.printStackTrace();
	}
	}

	public void xoaNhaHang(int maNhaHang) {
		String querry="delete from NhaHang where MaNhaHang='"+maNhaHang+"'";
		try {
		PreSta(querry);
		} catch (SQLException e) {
		e.printStackTrace();
		}
	}

	public void themNhaHang(int maNhaHang, String tenNhaHang, int maKhuVuc,String moTa) {
		String querry="insert into NhaHang values('"+maNhaHang+"','"+maKhuVuc+"','"+tenNhaHang+"','"+moTa+"')";
		try {
			exU(querry);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
}
