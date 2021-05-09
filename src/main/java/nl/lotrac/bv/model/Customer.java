package nl.lotrac.bv.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "customers")
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    //    @Id
    @Column(nullable = false, unique = true)
    private String customername;

    @Column(length = 255)
    private String street;

    @Column(length = 255)
    private String city;

    @Column(length = 255)
    private String postal_code;

    @Column
    private String email;

    @Column(length = 255)
    private String tel_number;

    @Column(nullable = false, length = 255)
    private String password;

    @Column
    private boolean enabled = true;

//    customer haalt spring uit veld customer in de @MayToOne in order
//
//    @ManyToOne
//    Customer customer;

//    Vegeet niet getter en setter van List<Order> aan te maken
//

    @OneToMany (mappedBy = "customer", fetch = FetchType.EAGER)
    List<Order> orders;

    //  waarom is dat nodig????
    @Column
    private String apikey;

//  waarom staat onderstaande erin??
//    @OneToMany(
//            targetEntity = Authority.class,
//            mappedBy = "username",
//            cascade = CascadeType.ALL,
//            orphanRemoval = true,
//            fetch = FetchType.EAGER)




    public Long getId() {
        return id;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }


}