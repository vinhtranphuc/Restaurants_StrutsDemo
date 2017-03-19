package model.bo;

import java.util.ArrayList;

import model.bean.NhaHang;
import model.dao.NhaHangDAO;

public class NhaHangBO {

	NhaHangDAO nhaHangDAO=new NhaHangDAO();
	public ArrayList<NhaHang> getListNhaHang() {
		return nhaHangDAO.getListNhaHang();
	}

	public ArrayList<NhaHang> getListNhaHang(int maKhuVuc) {
		return nhaHangDAO.getListNhaHang(maKhuVuc);
	}

	public String getTenNhaHang(int maNhaHang) {
		NhaHangDAO nhaHangDAO=new NhaHangDAO();
		return nhaHangDAO.getTenNhaHang(maNhaHang);
	}

	public NhaHang getThongTinNhaHang(int maNhaHang) {
	return nhaHangDAO.getThongTinNhaHang(maNhaHang);
	}

	public void suaNhaHang(int maNhaHang, String tenNhaHang, int maKhuVuc) {
	nhaHangDAO.suaNhaHang(maNhaHang,tenNhaHang,maKhuVuc);
	}

	public void xoaNhaHang(int maNhaHang) {
	nhaHangDAO.xoaNhaHang(maNhaHang);
	}

	public void themNhaHang(int maNhaHang, String tenNhaHang, int maKhuVuc,String moTa) {
	nhaHangDAO.themNhaHang(maNhaHang,tenNhaHang,maKhuVuc,moTa);
	}
}
