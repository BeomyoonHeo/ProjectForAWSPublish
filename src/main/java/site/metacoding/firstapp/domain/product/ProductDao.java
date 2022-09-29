package site.metacoding.firstapp.domain.product;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ProductDao {
    public List<Product> findAll();

    public void insert();

    public Product findById(Integer productId);

    public void insert(Product product);

    public void update(@Param("productId") Integer productId, @Param("product") Product product);

    public void deleteById(Integer productId);

}
