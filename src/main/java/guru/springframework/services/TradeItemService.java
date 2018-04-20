package guru.springframework.services;

import guru.springframework.domain.TradeItem;
import java.util.List;

public interface TradeItemService {

    /**
     * Created by YU on 1/10/17.
     */

        List<TradeItem> listAll();
        TradeItem getById(Long id);
        //TradeItem saveOrUpdate(TradeItem tradeItem);
        void delete(Long id);
}
