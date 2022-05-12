package modell.dao;

import db.DB;
import modell.dao.impl.VendedorDaoJDBC;

public class FabricaDao {

	public static VendedorDao criarVendedordao() {
		return new VendedorDaoJDBC(DB.getConnection());
	}
	
	
}
