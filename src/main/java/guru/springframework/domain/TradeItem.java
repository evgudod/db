package guru.springframework.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by jt on 1/10/17.
 */
@Entity
public class TradeItem {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Long parentId;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentIdId() {
        return id;
    }

    public void setParentIdId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.name = description;
    }


}
