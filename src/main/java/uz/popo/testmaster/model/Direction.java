package uz.popo.testmaster.model;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "directions")
public class Direction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "direction", nullable = false)
    private String direction;

    @ManyToMany
    @JoinTable(name = "direction_quiz_group",
            joinColumns = @JoinColumn(name = "direction_id"),
            inverseJoinColumns = @JoinColumn(name = "quiz_group_id"))
    private Set<QuizGroup> quizGroups = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Set<QuizGroup> getQuizGroups() {
        return quizGroups;
    }

    public void setQuizGroups(Set<QuizGroup> quizGroups) {
        this.quizGroups = quizGroups;
    }

}