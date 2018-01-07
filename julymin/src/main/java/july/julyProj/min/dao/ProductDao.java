package july.julyProj.min.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import july.julyProj.min.model.ProductMo;

@Repository
public class ProductDao implements ProductDaoImpl{
	
	@Autowired
	private SqlSession sqlsession;
	
	private String namespace = "julydb.product";
	
	@Override
	public List<ProductMo> getProductList(){
		List<ProductMo> product = sqlsession.selectList(namespace+".getProductList");
		System.out.println(product.get(0).toString());
		return product;
	}
	
	@Override
	public void productInsert(ProductMo product){
		sqlsession.insert(namespace+".productInsert", product);
	}
}
