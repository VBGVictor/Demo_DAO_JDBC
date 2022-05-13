package Application;

import java.util.List;

import Model.entities.Departamento;
import Model.entities.Vendedor;
import modell.dao.FabricaDao;
import modell.dao.VendedorDao;

public class Programa {

	public static void main(String[] args) {
		
		
		VendedorDao vendedorDao = FabricaDao.criarVendedordao();
		
		System.out.println("=== TESTE 1: Vendedor findById ===");
		Vendedor vendedor = vendedorDao.findByid(3);
		System.out.println(vendedor);
		
		System.out.println("=== TESTE 2: Vendedor findByDepartment ===");
		Departamento departamento = new Departamento(2, null);
		List<Vendedor> list = vendedorDao.findByDepartamento(departamento);
		for(Vendedor obj : list) {
			System.out.println(obj);
		}

	}

}
