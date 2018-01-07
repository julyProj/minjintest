package july.julyProj.min.controller;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import july.julyProj.min.model.ProductMo;
import july.julyProj.min.service.ProductServ;
import july.julyProj.min.service.ProductServImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ProductController {
	@Autowired
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private ProductServImpl productServ = new ProductServ();
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
			
		return "home";
	}
	
	@RequestMapping(value="/list")
	public ModelAndView ProductListPage() {
		ModelAndView pro = new ModelAndView("list");
		pro.addObject("productList",productServ.getProductList());
		return pro;
	}
	
	@RequestMapping(value="/insert")
	public ModelAndView ProductInsertPage() {
		
		ModelAndView pro = new ModelAndView("insert");
		
		return pro;
	}
	/**
	 * 추가 AJAX
	 * @param Category
	 * @param Product
	 * @param Price
	 * @param Size
	 * @param Useable
	 * @return Map<String,String>
	 */
	@RequestMapping(value = "/insert.ajax", method=RequestMethod.POST)
	@ResponseBody
	public Map<String,String> productInsert(ProductMo product){
		/*logger.info("Insert ajax:"+Category+"/"+Product+"/"+Price+"/"+Size+"/"+Useable);
		Map<String,String> resData = new HashMap<String,String>();
		try{
			ProductMo proData = new ProductMo(Category, Product, Price, Size, Useable);
			
			productServ.productInsert(proData);
			
			resData.put("result","success");
		} catch(Exception e){
			e.printStackTrace();
			resData.put("result", "fail");
		}*/
		Map<String,String> resData = new HashMap<String,String>();
		resData.put("result", "aaaaaa");
		return resData;
	}
	
}
