package rs.hsk.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import rs.hsk.shoppingbackend.dao.CategoryDAO;
import rs.hsk.shoppingbackend.dao.ProductDAO;
import rs.hsk.shoppingbackend.dto.Category;
import rs.hsk.shoppingbackend.dto.Product;

@Controller
public class PageController {
	
	@Autowired 
	private CategoryDAO categoryDAO;
	
	@Autowired
	private ProductDAO productDAO;

	@RequestMapping(value = { "/", "/home", "index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		
		//passing the list of category
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickHome", true);
		return mv;
	}

	
	/*@RequestMapping(value = { "/contact" })
	public ModelAndView contcact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "contact");
		mv.addObject("userClickContact", true);
		return mv;
	}*/

	/*@RequestMapping(value = { "/about" })
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "about");
		mv.addObject("userClickAbout", true);
		return mv;
	}*/

/*
 * method to load all products based on category
 * */
	
	@RequestMapping(value ="/show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Products");
		
		//passing list of category
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickAllProducts", true);
		return mv;
	}
	
	@RequestMapping(value ="/repairing")
	public ModelAndView repairing() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "repairing");
		
		//passing list of category
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickRepairing", true);
		return mv;
	}
	
	@RequestMapping(value ="/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "contact");
		
		//passing list of category
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickContact", true);
		return mv;
	}
	
	@RequestMapping(value ="/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "aboutA");
		
		//passing list of category
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickAbout", true);
		return mv;
	}
	
	
	
	//request mapping for category
	
	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");
		
		//categoryDAO to fetch a single category
		Category category =null;
		
		category = categoryDAO.get(id);
		
		mv.addObject("title", category.getName());
		
		//passing the list of category
		mv.addObject("categories",categoryDAO.list());
		
		
		//passing the single category object
		mv.addObject("category", category);
		mv.addObject("userClickCategoryProducts", true);
		return mv;
	}
	
	/* @RequestMapping(value="/show/{id}/product")
		public ModelAndView showSingleProduct(@PathVariable int id) throws ProductNotFoundException{
			
			ModelAndView mv = new ModelAndView("page");
			Product product =productDAO.get(id);
			
			if(product == null) throw new ProductNotFoundException();
			
		//update the view content
			
			mv.addObject("title", product.getName());
			mv.addObject("product", product);
			
			mv.addObject("userClickShowProduct", true);
			
			return mv;
			
			
			
		}*/
	}
	
