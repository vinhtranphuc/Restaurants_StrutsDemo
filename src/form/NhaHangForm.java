package form;

import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import model.bean.KhuVuc;
import model.bean.NhaHang;

public class NhaHangForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	private NhaHang nhaHang;
	private int maNhaHang;
	private String tenNhaHang;
	private ArrayList<KhuVuc> listKhuVuc;
	private int maKhuVuc;
	private String tenKhuVuc;
	private String moTa;

	private String sua;
	private String xoa;
	private String them;
	public NhaHang getNhaHang() {
		return nhaHang;
	}
	public void setNhaHang(NhaHang nhaHang) {
		this.nhaHang = nhaHang;
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
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public String getSua() {
		return sua;
	}
	public void setSua(String sua) {
		this.sua = sua;
	}
	public String getXoa() {
		return xoa;
	}
	public void setXoa(String xoa) {
		this.xoa = xoa;
	}
	public String getThem() {
		return them;
	}
	public void setThem(String them) {
		this.them = them;
	}
	
}
