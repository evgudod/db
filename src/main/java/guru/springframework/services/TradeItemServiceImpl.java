package guru.springframework.services;

import guru.springframework.domain.TradeItem;
import guru.springframework.repositories.TradeItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


    /**
     * Created by YU on 4/19/18.
     */
    @Service
    public class TradeItemServiceImpl implements TradeItemService {

        private TradeItemRepository tradeItemRepository;
        //private ProductFormToProduct productFormToProduct;

        @Autowired
        public TradeItemServiceImpl(TradeItemRepository tradeItemRepository) {
            this.tradeItemRepository = tradeItemRepository;
          //  this.productFormToProduct = productFormToProduct;
        }


        @Override
        public List<TradeItem> listAll() {
            List<TradeItem> products = new ArrayList<>();
            tradeItemRepository.findAll().forEach(products::add); //fun with Java 8
            return products;
        }

        @Override
        public TradeItem getById(Long id) {
            return tradeItemRepository.findOne(id);
        }



        @Override
        public void delete(Long id) {
            tradeItemRepository.delete(id);

        }

        /*@Override
        public TradeItem saveOrUpdateProductForm(ProductForm productForm) {

            TradeItem savedProduct = saveOrUpdate(productFormToProduct.convert(productForm));

            System.out.println("Saved Product Id: " + savedProduct.getId());
            return savedProduct;
        }*/
    }


