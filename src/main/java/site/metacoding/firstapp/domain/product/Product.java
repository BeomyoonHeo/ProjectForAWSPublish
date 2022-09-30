package site.metacoding.firstapp.domain.product;

import java.sql.Timestamp;

import lombok.Getter;

@Getter
public class Product {
    private Integer productId;
    private String productName;
    private Integer productPrice;
    private Integer productQty;
    private Timestamp createdAt;

    private Product() {
    } // MyBatis에게 필요한 것 private로 설정해도 Mybatis가 리플렉션을 사용하여 빈생성자를 호출 할 수 있다.

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Product(String productName, Integer productPrice, Integer productQty) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQty = productQty;
    }

    public void update(Product product) {
        this.productName = product.getProductName();
        this.productPrice = product.getProductPrice();
        this.productQty = product.getProductQty();
    }

}
