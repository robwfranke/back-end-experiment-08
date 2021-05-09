package nl.lotrac.bv.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    //    @Id
    @Column(nullable = false, unique = true)
    private String orderdate;

    @Column(nullable = false, length = 255)
    private String status;


    @ManyToOne
    Customer customer;

    @OneToMany(mappedBy = "order")
    List<OrderLine> orderlines;



    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
