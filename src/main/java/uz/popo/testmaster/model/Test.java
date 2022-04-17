package uz.popo.testmaster.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tests")
public class Test implements Serializable {
    private static final long serialVersionUID = 6050044280860947109L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}