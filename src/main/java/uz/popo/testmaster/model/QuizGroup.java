package uz.popo.testmaster.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "quiz_groups")
public class QuizGroup implements Serializable {
    private static final long serialVersionUID = -1130424185135466393L;
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