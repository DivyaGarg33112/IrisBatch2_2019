package com.iris.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.iris.daos.ProductDao;
import com.iris.models.Product;
import com.iris.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;

	@RequestMapping(value="/addProductForm",method=RequestMethod.GET)
	public ModelAndView getProductForm(){
		ModelAndView mv=new ModelAndView("AddProduct");
		mv.addObject("productObj",new Product());
		return mv;
	}
	
	@RequestMapping(value="/addProduct",method=RequestMethod.POST)
	public ModelAndView addProduct(@ModelAttribute("productObj")Product productObj){
		productService.addProduct(productObj);
		
		ModelAndView mv=new ModelAndView("ViewProducts");
		mv.addObject("productDetails",productService.getAllProducts());
		return mv;
	}
	
	
	@RequestMapping(value="/viewAllProducts",method=RequestMethod.GET)
	public ModelAndView getAllProducts(){
		ModelAndView mv=new ModelAndView("ViewProducts");
		mv.addObject("productDetails",productService.getAllProducts());
		return mv;
	}
	
	@Autowired
	ProductDao productDao;
	
	@ResponseBody
	@RequestMapping(value="/checkProductName",method=RequestMethod.GET)
	public String checkProductName(@RequestParam("name")String productName){
		Product proObj=productDao.getProductByName(productName);
		if(proObj!=null){
			return "Product with given name already exist..";
		}
		else {
			return "";
		}
	}
	
	
	@ResponseBody
	@RequestMapping(value="/fetchAllProducts",method=RequestMethod.GET)
	public List<Product> fetchAllProducts(){
		List<Product> productList=productService.getAllProducts();
		return productList;
	}
	
	@ResponseBody
	@RequestMapping(value="/fetchAllProducts/{pId}",method=RequestMethod.GET)
	public Product fetchAllProductsById(@PathVariable("pId")int productId){
		Product obj=productService.getProductById(productId);
		return obj;
	}
	
	@ResponseBody
	@RequestMapping(value="/addProductNew",method=RequestMethod.POST)
	public boolean addProductBy(@RequestBody Product proObj){
		boolean res=productService.addProduct(proObj);
		return res;
	}
	
}
