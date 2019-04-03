package rs.hsk.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import rs.hsk.shoppingbackend.dao.ProductDAO;
import rs.hsk.shoppingbackend.dto.Product;

public class ProductTestCase {

	private static AnnotationConfigApplicationContext context;

	private static ProductDAO productDAO;

	private Product product;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("rs.hsk.shoppingbackend");
		context.refresh();
		productDAO = (ProductDAO)context.getBean("productDAO");
	}


	/*	@Test public void testAddProduct() {
		  
		  product = new Product();
		  
		    product.setName("oppo Selfie f5");
			product.setBrand("Oppo");
			product.setDescription("This is some description for oppo mobile phones");
			product.setUnitprice(25000);
			product.setActive(true);
			product.setCategoryId(3);
			product.setSupplierId(3);
			
			assertEquals("Something going wrong while inserting new product", true, productDAO.add(product));

		  }	
	*/
	
	
/*	@Test public void testGetProduct() {
		  
		  product = productDAO.get(1);
		  
		  
		  
		  assertEquals("Successfully fetched a single category from the table!","apple",
		  product.getBrand()); } 
	}*/
		 
	 
	 @Test 
	  public void testUpdateProduct() {
	  product = productDAO.get(1); product.setName("Iphone 7s");
	  assertEquals("Successfully updated a single category in the table!",true,
	  productDAO.update(product));
	  } 
}
	
/*	@Test
		public void testListActiveProduct() {
			assertEquals("somethig wrong while fetchng the list of active products",5, productDAO.listActiveProducts().size());
		}
			
	}
	
*/
	/*@Test
	public void testListActiveProductsByCategory() {
		assertEquals("Somthing going to wrong while fetching the list of products!", 3, productDAO.listActiveProductsByCategory(3).size());
		//assertEquals("Something going to wrong while fetching the list of products!", 2, productDAO.listActiveProductsByCategory(1).size());
	}
}*/
	
/*	@Test
	public void testGetLatestActiveProduct() {
		
		assertEquals("somethig wrong while fetchng the list of products",3, productDAO.getLatestActiveProducts(3).size());
	}
}*/