package cn.edu.hzau.mybatis.demo.model;

import java.math.BigDecimal;
import java.util.Date;

public class GoldPrice {

    private String id;

    private BigDecimal price;

    private Date timestamp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "GoldPrice{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", timestamp=" + timestamp +
                '}';
    }
}
