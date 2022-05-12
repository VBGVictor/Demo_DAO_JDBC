package modell.dao;

import modell.dao.impl.VendedorDaoJDBC;

public class FabricaDao {

	public static VendedorDao criarVendedordao() {
		return new VendedorDaoJDBC();
	}
	
	
}
