package guru.springframework.commands;


import java.math.BigDecimal;

/**
 * Created by YU on 4/18/18.
 */
public class TradeItem {
    private Long id;
    private Long parentId;

    private String name;

    public Long getId() {
        return id;
    }

    public Long getParentId() { return parentId; }

    public void setId(Long id) {
        this.id = id;
    }

    public void setParentId(Long id) {
        this.parentId = id;
    }

    public String getName() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

}
