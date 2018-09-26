
package rs.hsk.shoppingbackend.dao;

import java.util.List;
import rs.hsk.shoppingbackend.dto.Product;

public interface ProductDAO {
	
	Product get(int productId);
	List<Product>list();
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Product product);
	
	//business method
	List<Product> listActiveProducts();
	List<Product> listActiveProductsByCategory(int categoryId);
	List<Product> getLatestActiveProducts(int count);	
}

