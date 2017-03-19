package model.bo;

import java.util.ArrayList;

import model.bean.KhuVuc;
import model.dao.KhuVucDAO;

public class KhuVucBO {

	public ArrayList<KhuVuc> getListKhuVuc() {
		KhuVucDAO khuVucDAO=new KhuVucDAO();
		return khuVucDAO.getListKhuVuc();
	}
}
