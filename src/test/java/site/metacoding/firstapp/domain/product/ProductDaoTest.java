package site.metacoding.firstapp.domain.product;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.context.annotation.Import;
import site.metacoding.firstapp.config.MyBatisConfig;

@Import(MyBatisConfig.class)
@AutoConfigureTestDatabase(replace = Replace.NONE)
@MybatisTest
public class ProductDaoTest {
    // 단위테스트에서는 생성자주입으로 DI 를 할 수 없다.
    @Autowired
    private ProductDao productDao;

    @Test
    public void findById_test() {

        // given(받아야 될 것)
        Integer productId = 1;

        // when(테스트)
        Product productPS = productDao.findById(productId);
        // then
        assertEquals("뭐지", productPS.getProductName());
    }
}
