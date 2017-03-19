package form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import model.bean.KhuVuc;
import model.bean.NhaHang;

public class DanhSachNhaHangForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	
	// nhà hàng
	private ArrayList<NhaHang> listNhaHang;
	private int maNhaHang;
	private String tenNhaHang;
	
	//khu vuc
	private ArrayList<KhuVuc> listKhuVuc;
	private int maKhuVuc=1;
	private String tenKhuVuc="1";
	
	//event
	private String xem;

	public ArrayList<NhaHang> getListNhaHang() {
		return listNhaHang;
	}

	public void setListNhaHang(ArrayList<NhaHang> listNhaHang) {
		this.listNhaHang = listNhaHang;
	}

	public int getMaNhaHang() {
		return maNhaHang;
	}

	public void setMaNhaHang(int maNhaHang) {
		this.maNhaHang = maNhaHang;
	}

	public String getTenNhaHang() {
		return tenNhaHang;
	}

	public void setTenNhaHang(String tenNhaHang) {
		this.tenNhaHang = tenNhaHang;
	}
	

	public ArrayList<KhuVuc> getListKhuVuc() {
		return listKhuVuc;
	}

	public void setListKhuVuc(ArrayList<KhuVuc> listKhuVuc) {
		this.listKhuVuc = listKhuVuc;
	}

	public int getMaKhuVuc() {
		return maKhuVuc;
	}

	public void setMaKhuVuc(int maKhuVuc) {
		this.maKhuVuc = maKhuVuc;
	}

	public String getTenKhuVuc() {
		return tenKhuVuc;
	}

	public void setTenKhuVuc(String tenKhuVuc) {
		this.tenKhuVuc = tenKhuVuc;
	}

	public String getXem() {
		return xem;
	}
	public void setXem(String xem) {
		this.xem = xem;
	}
	
}
