package Application;

import java.util.Date;
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
		
		System.out.println("=== TESTE 3: Vendedor findAll ===");
		list = vendedorDao.findAll();
		for(Vendedor obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== TESTE 4: Vendedor Insert ===");
		Vendedor newVendedor = new Vendedor(null, "Greg", "Greg@gmail.com", new Date(), 4000.0, departamento);
		vendedorDao.insert(newVendedor);
		System.out.println("Inserted! New id = " + newVendedor.getId());
		
		System.out.println("=== TESTE 5: Vendedor Update ===");
		vendedor = vendedorDao.findByid(1);
		vendedor.setName("Martha Waine");
		vendedorDao.update(vendedor);
		System.out.println("Update Completed!");

	}

}
