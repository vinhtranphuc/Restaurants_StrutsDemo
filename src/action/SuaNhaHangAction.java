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
import model.bean.NhaHang;
import model.bo.KhuVucBO;
import model.bo.NhaHangBO;

public class SuaNhaHangAction extends Action
{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		System.out.println("SuaNhaHangAction: đã zô đây");
		NhaHangForm nhaHangForm=(NhaHangForm) form;
		
		KhuVucBO khuVucBO=new KhuVucBO();
		NhaHangBO nhaHangBO=new NhaHangBO();
		
		ArrayList<KhuVuc> listKhuVuc=khuVucBO.getListKhuVuc();
		nhaHangForm.setListKhuVuc(listKhuVuc);
		
		int maNhaHang=nhaHangForm.getMaNhaHang();
		
		System.out.println("Sua: "+nhaHangForm.getSua());
		if("Sua".equals(nhaHangForm.getSua()))
		{
			String tenNhaHang=nhaHangForm.getTenNhaHang();
			int maKhuVuc=nhaHangForm.getMaKhuVuc();
			nhaHangBO.suaNhaHang(maNhaHang,tenNhaHang,maKhuVuc);
			return mapping.findForward("suaNhaHangXong");
		}
		else
		{
			NhaHang nhaHang=nhaHangBO.getThongTinNhaHang(maNhaHang);
			String tenNhaHang=nhaHang.getTenNhaHang();
			int maKhuVuc=nhaHang.getMaKhuVuc();
			nhaHangForm.setMaNhaHang(maNhaHang);
			nhaHangForm.setTenNhaHang(tenNhaHang);
			nhaHangForm.setMaKhuVuc(maKhuVuc);
		}
		return mapping.findForward("suaNhaHang");
	}
}
