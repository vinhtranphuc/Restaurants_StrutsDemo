package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import form.NhaHangForm;
import model.bean.KhuVuc;
import model.bo.KhuVucBO;
import model.bo.NhaHangBO;

public class ThemNhaHangAction extends Action {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("ThemNhaHangAction: đã zô đây");
		NhaHangForm nhaHangForm=(NhaHangForm) form;
		
		KhuVucBO khuVucBO=new KhuVucBO();
		NhaHangBO nhaHangBO=new NhaHangBO();
		
		ArrayList<KhuVuc> listKhuVuc=khuVucBO.getListKhuVuc();
		nhaHangForm.setListKhuVuc(listKhuVuc);
		
		int maNhaHang=nhaHangForm.getMaNhaHang();
		String tenNhaHang=nhaHangForm.getTenNhaHang();
		int maKhuVuc=nhaHangForm.getMaKhuVuc();
		String moTa=nhaHangForm.getMoTa();
		
		if("Them".equals(nhaHangForm.getThem()))
		{
		nhaHangBO.themNhaHang(maNhaHang,tenNhaHang,maKhuVuc,moTa);
		return mapping.findForward("themNhaHangXong");
		}
		
		return mapping.findForward("themNhaHang");
	}
}
