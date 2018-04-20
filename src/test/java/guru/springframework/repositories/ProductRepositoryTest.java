package guru.springframework.repositories;

import guru.springframework.domain.TradeItem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ProductRepositoryTest {

    private static final BigDecimal BIG_DECIMAL_100 = BigDecimal.valueOf(100.00);
    private static final String PRODUCT_DESCRIPTION = "a cool product";
    private static final String IMAGE_URL = "http://an-imageurl.com/image1.jpg";

    @Autowired
    private TradeItemRepository productRepository;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testPersistence() {
        //given
        TradeItem product = new TradeItem();
        product.setDescription(PRODUCT_DESCRIPTION);


        //when
        productRepository.save(product);

        //then
        Assert.assertNotNull(product.getId());
        TradeItem newProduct = productRepository.findOne(product.getId());
        Assert.assertEquals((Long) 1L, newProduct.getId());

    }
}