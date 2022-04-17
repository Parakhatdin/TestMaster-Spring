package uz.popo.testmaster.model;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "choices")
public class Choice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "content", nullable = false)
    private String content;

    @ManyToMany
    @JoinTable(name = "quiz_choice",
            joinColumns = @JoinColumn(name = "choice_id"),
            inverseJoinColumns = @JoinColumn(name = "quiz_id"))
    private Set<Quiz> quizzes = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(name = "quiz_group_choice",
            joinColumns = @JoinColumn(name = "choice_id"),
            inverseJoinColumns = @JoinColumn(name = "quiz_group_id"))
    private Set<QuizGroup> quizGroups = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Set<Quiz> getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(Set<Quiz> quizzes) {
        this.quizzes = quizzes;
    }

    public Set<QuizGroup> getQuizGroups() {
        return quizGroups;
    }

    public void setQuizGroups(Set<QuizGroup> quizGroups) {
        this.quizGroups = quizGroups;
    }

}