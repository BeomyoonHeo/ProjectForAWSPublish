package site.metacoding.firstapp.domain.product;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ProductDao {
    public List<Product> findAll();

    public void insert();

    public Product findById(Integer productId);

    // PrepareStatement
    public int insert(Product product);

    public int update(Product product);

    public int deleteById(Integer productId);

}
