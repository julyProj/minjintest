package july.julyProj.min.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import july.julyProj.min.model.ProductMo;

@Repository
public interface ProductDaoImpl {
	public List<ProductMo> getProductList();
	public void productInsert(ProductMo product);
}
