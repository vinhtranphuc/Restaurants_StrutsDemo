package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.DanhSachNhaHangForm;
import model.bean.KhuVuc;
import model.bean.NhaHang;
import model.bo.KhuVucBO;
import model.bo.NhaHangBO;

public class DanhSachNhaHangAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		DanhSachNhaHangForm dsnhForm=(DanhSachNhaHangForm) form;
		
		ArrayList<NhaHang> listNhaHang;
		ArrayList<KhuVuc> listKhuVuc;
		
		NhaHangBO nhaHangBO=new NhaHangBO();
		KhuVucBO khuVucBO=new KhuVucBO();
		
		String xem=dsnhForm.getXem();
		System.out.println("Xem: "+xem);
		
		if("xem".equals(xem))
		{
			int maKhuVuc=dsnhForm.getMaKhuVuc();
			System.out.println("MaKhuVuc: "+maKhuVuc);
			listNhaHang=nhaHangBO.getListNhaHang(maKhuVuc);
		}
		else
		{
		listNhaHang=nhaHangBO.getListNhaHang();
		}
		
		listKhuVuc=khuVucBO.getListKhuVuc();
		dsnhForm.setListKhuVuc(listKhuVuc);
		dsnhForm.setListNhaHang(listNhaHang);
		
		return mapping.findForward("danh-sach");
	}
}
