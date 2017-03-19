package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.KhuVuc;

public class KhuVucDAO extends DataProvider{

	public ArrayList<KhuVuc> getListKhuVuc() {
		String querry="Select * from KhuVuc";
		ArrayList<KhuVuc> listKhuVuc=new ArrayList<KhuVuc>();
		KhuVuc khuVuc;
		try {
		ResultSet rs=exQ(querry);
		while(rs.next())
		{
		khuVuc=new KhuVuc();
		khuVuc.setMaKhuVuc(rs.getInt("MaKhuVuc"));
		khuVuc.setTenKhuVuc(rs.getString("TenKhuVuc"));
		listKhuVuc.add(khuVuc);
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listKhuVuc;
	}
	
}
