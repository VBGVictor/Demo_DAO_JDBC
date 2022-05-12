package Application;

import Model.entities.Vendedor;
import modell.dao.FabricaDao;
import modell.dao.VendedorDao;

public class Programa {

	public static void main(String[] args) {
		
		
		VendedorDao vendedorDao = FabricaDao.criarVendedordao();
		
		Vendedor vendedor = vendedorDao.findByid(3);
		
		System.out.println(vendedor);
		

	}

}
