package Application;

import java.util.Date;

import Model.entities.Departamento;
import Model.entities.Vendedor;
import modell.dao.FabricaDao;
import modell.dao.VendedorDao;

public class Programa {

	public static void main(String[] args) {
		
		Departamento obj = new Departamento(1, "Books");
		Vendedor vendedor = new Vendedor(21, "Ulisses", "Ulisses@gmail.com", new Date(), 3000.0, obj);
		
		VendedorDao vendedorDao = FabricaDao.criarVendedordao();
		
		System.out.println(vendedor);
		

	}

}
