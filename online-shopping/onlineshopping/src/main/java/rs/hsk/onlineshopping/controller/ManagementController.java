package rs.hsk.onlineshopping.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import rs.hsk.shoppingbackend.dao.CategoryDAO;
import rs.hsk.shoppingbackend.dao.ProductDAO;
import rs.hsk.shoppingbackend.dto.Category;
import rs.hsk.shoppingbackend.dto.Product;

@Controller
@RequestMapping("/manage")

public class ManagementController {

	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private ProductDAO productDAO;
	
	
	private static final Logger logger = LoggerFactory.getLogger(ManagementController.class);

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public ModelAndView showManageProducts(@RequestParam(name="operation", required=false) String operation) {

		ModelAndView mv = new ModelAndView("page");

		mv.addObject("userClickManageProducts", true);
		mv.addObject("title", "Manage Products");

		Product nProduct = new Product();

		// set few of product
		nProduct.setSupplierId(1);
		nProduct.setActive(true);

		mv.addObject("product", nProduct);
		
		if(operation!=null) {
			if(operation.equals("product")) {}
			mv.addObject("message", "Product Sumitted sauccessfully");
		}

		return mv;

	}
	
	//mapping product sumission
	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public String handleProductSumission(@ModelAttribute("products") Product nproduct) {
		
		logger.info(nproduct.toString());
		//create new product
		productDAO.add(nproduct);
		
		
		return "redirect:/manage/products?";
	}
	

	//returning categories
	@ModelAttribute("categories") 
	public List<Category> modelCategories() {
		return categoryDAO.list();
	}

}
