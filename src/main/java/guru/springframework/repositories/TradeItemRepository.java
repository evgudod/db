package guru.springframework.repositories;

import guru.springframework.domain.TradeItem;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 1/10/17.
 */
public interface TradeItemRepository extends CrudRepository<TradeItem, Long> {
}