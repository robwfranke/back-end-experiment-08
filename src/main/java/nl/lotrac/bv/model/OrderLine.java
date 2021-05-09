package nl.lotrac.bv.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "orderLines")
public class OrderLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //    @Id
    @Column(nullable = false, unique = true)
    private String dwg_number;

    @Column(nullable = false, length = 255)
    private String quantity;


    @ManyToOne
    Order order;

//    @OneToMany(mappedBy = "orderLine")


    @ManyToMany
    @JoinTable(
            name = "couple_orderline_jobs",
            joinColumns = @JoinColumn(name = "order_line_id"),
            inverseJoinColumns = @JoinColumn(name = "jobs_id"))
    Set<Job> koppel = new HashSet<>();



    public Order getOrder() {
        System.out.println("OrderLine"+order);
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Set<Job> getKoppel() {
        return koppel;
    }

    public void setKoppel(Set<Job> koppel) {
        this.koppel = koppel;
    }

    public String getDwg_number() {
        return dwg_number;
    }

    public void setDwg_number(String dwg_number) {
        this.dwg_number = dwg_number;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}

