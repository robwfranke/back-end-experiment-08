package nl.lotrac.bv.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


//    @Id
    @Column(nullable = false, unique = true)
    private String job_name;

    @Column(nullable = false, length = 255)
    private String department;




//    @ManyToMany(mappedBy = "koppel")
//    Set<OrderLine> likes = new HashSet<>();

//    public Set<OrderLine> getLikes() {
//        return likes;
//    }
//
//    public void setLikes(Set<OrderLine> likes) {
//        this.likes = likes;
//    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
