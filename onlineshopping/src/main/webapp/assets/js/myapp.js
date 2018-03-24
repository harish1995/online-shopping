$(function(){
	// solving the active menu problem
	
	switch(menu) {
	
	case 'contact':
		$('#contact').addClass('active');
		break;
		
	case 'All Products':
		$('#listProducts').addClass('active');
		break;
		
	case 'repairing':
		$('#repairing').addClass('active');
		break;
		
	case 'about':
		$('#about').addClass('active');
		break;
			
				
		
	default :
		$('#listProducts').addClass('active');
		$('#a_'+menu).addClass('active');
	break;
	}
});