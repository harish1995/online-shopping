package rs.hsk.onlineshopping.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView handlerNoHandlerFoundException() {
		ModelAndView mv = new ModelAndView("error");
		
		mv.addObject("errorTitle", "The page is not constructed");
		
		mv.addObject("errorDescription", "The page you are looking for is not available now!");
		
		mv.addObject("title", "404 Erro Page");
		
		return mv;
	}

	@ExceptionHandler(ProductNotFoundException.class)
	public ModelAndView handlerProductNotFoundException() {
		
		ModelAndView mv = new ModelAndView("error");
		
		mv.addObject("errorTitle", "Product not Available");
		
		mv.addObject("errorDescription", "The prduct you looking for not found right  now!");
		
		mv.addObject("title", "Product unavailable");
		
		return mv;
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handlerException(Exception ex) {
		
		ModelAndView mv = new ModelAndView("error");
		
		mv.addObject("errorTitle", "Contact Your Administrator");
		
		mv.addObject("errorDescription", ex.toString());
		
		mv.addObject("title", "Error");
		
		return mv;
	}

	
}
