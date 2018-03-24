package rs.hsk.shoppingbackend.dao;

import java.util.List;

import rs.hsk.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	
	List<Category> list();
	Category get(int id);

}
