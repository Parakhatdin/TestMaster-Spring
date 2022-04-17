package uz.popo.testmaster.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "quizzes")
public class Quiz implements Serializable {
    private static final long serialVersionUID = 3731157579567119465L;
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