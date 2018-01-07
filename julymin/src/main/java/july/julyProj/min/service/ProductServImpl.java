package july.julyProj.min.service;

import java.util.List;

import org.springframework.stereotype.Service;

import july.julyProj.min.model.ProductMo;

@Service
public interface ProductServImpl {
	
	public List<ProductMo> getProductList();
	public void productInsert(ProductMo product);
}
