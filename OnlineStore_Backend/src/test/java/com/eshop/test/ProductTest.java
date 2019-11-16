package com.eshop.test;

import static java.lang.System.out;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;  //Static import

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.eshop.config.DBConfig;
import com.eshop.daos.ProductDao;
import com.eshop.models.Product;

public class ProductTest {

	private static ProductDao productDaoObj;
	
	@BeforeClass
	public static void init(){
		out.println("I m in init - start");
		//Created the object of Spring container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
		
		//Passing the object of Configuration to the Spring container and refershing it
   	 	//context.register(DBConfig.class);
   	 	//context.refresh();
   	 	
   	 	//Asking the object of PRoductDao from the spring container so that we can 
   	 	//test its methods.
   	 	productDaoObj=context.getBean(ProductDao.class,"productDao");
   	 	out.println("I m in init - end");
	}
	
	@Test
	@Ignore
	public void addProductTest(){
		Product p=new Product();
		p.setProductName("Trouser");
		p.setPrice(1500);
		
		boolean r=productDaoObj.addProduct(p);
		assertTrue("Problem in Adding Product", r);
	}
	
	@Test
	@Ignore
	public void getProductByIdTest(){
		Product pObj=productDaoObj.getProductById(1);
		assertNotNull("Product with given id doesnt exist", pObj);
	}
	
	@Test
	public void getAllProductsTest(){
		List<Product> pList=productDaoObj.getAllProducts();
		Assert.assertNotEquals("Not Products Found...", pList.size(), 0);
	}
	
}










