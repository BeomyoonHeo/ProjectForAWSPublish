package site.metacoding.firstapp.domain.product;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ProductDao {
    public List<Product> findAll();

    public void insert();

    public Product findById();

    public void insert(Product product);

    public void update(@Param("productId") Integer productiId, @Param("product") Product product);

    public void deleteById(Integer productId);

}
