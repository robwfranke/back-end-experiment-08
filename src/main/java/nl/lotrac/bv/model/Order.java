package nl.lotrac.bv.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;



    @Column(nullable = false, unique = true)
    private String ordername;

    @Column(nullable = false, length = 255)
    private String status;


    @ManyToOne
    Customer customer;
//
//    @OneToMany(mappedBy = "order")
//    List<OrderLine> orderlines;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

//    public List<OrderLine> getOrderlines() {
//        return orderlines;
//    }

//    public void setOrderlines(List<OrderLine> orderlines) {
//        this.orderlines = orderlines;
//    }
}

