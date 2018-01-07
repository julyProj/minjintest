package july.julyProj.min.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import july.julyProj.min.dao.ProductDaoImpl;
import july.julyProj.min.dao.ProductDao;
import july.julyProj.min.model.ProductMo;

@Service
public class ProductServ implements ProductServImpl{
	
	@Autowired
	private ProductDaoImpl ProductDao = new ProductDao();
	
	@Override
	public List<ProductMo> getProductList() {
		return ProductDao.getProductList();
	}
	
	@Override
	public void productInsert(ProductMo product) {
		ProductDao.productInsert(product);
	}
}
