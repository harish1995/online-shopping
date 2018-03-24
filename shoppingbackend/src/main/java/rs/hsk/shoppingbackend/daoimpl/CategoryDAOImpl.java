package rs.hsk.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import rs.hsk.shoppingbackend.dao.CategoryDAO;
import rs.hsk.shoppingbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
 
	   private static List<Category> categories=new ArrayList<>();
	   
	   static {
		   Category category = new Category();
		   
		   //adding first category
		   category.setId(1);
		   category.setName("Mobiles");
		   category.setDescription("this is some descrition for Mobile");
		   category.setImageURL("CAT_2.png");
		   
		   categories.add(category);
		   
		   //second category
           category = new Category();
		   category.setId(2);
		   category.setName("Repairing");
		   category.setDescription("this is some descrition for Accessories");
		   category.setImageURL("CAT_2.png");
		   
		   categories.add(category);
		   
		 //third category
           category = new Category();
		   category.setId(3);
		   category.setName("Accessories");
		   category.setDescription("this is some descrition for Accessories");
		   category.setImageURL("CAT_3.png");
		   
		   categories.add(category);
		   
		   
	   }
	  
	
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}



	@Override
	public Category get(int id) {
	
		//enhanced for loop
		for(Category category: categories) {
			
			if(category.getId()==id) return category;
				
		}
		return null;
		
	}

}
