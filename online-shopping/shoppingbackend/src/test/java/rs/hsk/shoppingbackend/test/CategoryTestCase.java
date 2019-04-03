package rs.hsk.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import rs.hsk.shoppingbackend.dao.CategoryDAO;
import rs.hsk.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("rs.hsk.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	/*
	 * @Test public void testAddCategory() {
	 * 
	 * category = new Category();
	 * 
	 * category.setName("Laptop");
	 * category.setDescription("This is some description for Laptop");
	 * category.setImageURL("CAT_105.png"); //category.setActive(true);
	 * 
	 * assertEquals("Successfully added a category inside the table!",true,
	 * categoryDAO.add(category)); }
	 */

	/*
	 * @Test public void testGetCategory() {
	 * 
	 * category = categoryDAO.get(1);
	 * 
	 * 
	 * assertEquals("Successfully fetched a single category from the table!","TV",
	 * category.getName()); } }
	 */

	/*
	 * @Test public void testListCategory() {
	 * 
	 * assertEquals("Successfully fetched a list of category from the table!",1,
	 * categoryDAO.list().size()); } }
	 */

	
	  @Test 
	  public void testUpdateCategory() {
	  
	  category = categoryDAO.get(2); category.setName("Televison");
	  assertEquals("Successfully updated a single category in the table!",true,
	  categoryDAO.update(category));
	  } 
}
	 

	/*
	 * @Test
	 * 
	 * public void testDeleteCategory() {
	 * 
	 * category = categoryDAO.get(3);
	 * assertEquals("Successfully deleted a single category in the table!",true,
	 * categoryDAO.delete(category));
	 * 
	 * 
	 * }
	 */
	/*
	 * @Test public void testListCategory() {
	 * 
	 * assertEquals("Successfully fetched the list of categories from the table!",3,
	 * categoryDAO.list().size());
	 * 
	 * 
	 * }
	 * 
	 */

/*	@Test public void testCRUDCategory() {
  
  // add operation category = new Category();
  
  category.setName("Laptop");
  category.setDescription("This is some description for laptop!");
  category.setImageURL("CAT_1.png");
  
  assertEquals("Successfully added a category inside the table!", true,
  categoryDAO.add(category));
  
  category = new Category();
  
  category.setName("TV");
  category.setDescription("This is some description for television!");
  category.setImageURL("CAT_2.png");
  
  assertEquals("Successfully added a category inside the table!", true,
  categoryDAO.add(category));
  
  // fetching and updating the category category = categoryDAO.get(2);
  
  category.setName("TV");
  
  assertEquals("Successfully updated a single category in the table!", true,
  categoryDAO.update(category));
  
  // delete the category
  assertEquals("Successfully deleted a single category in the table!", true,
  categoryDAO.delete(category));
  
  // fetching the list
  assertEquals("Successfully fetched the list of categories from the table!",
  1, categoryDAO.list().size());
  
  }
}*/