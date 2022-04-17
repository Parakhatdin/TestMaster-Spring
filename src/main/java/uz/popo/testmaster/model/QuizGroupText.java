package uz.popo.testmaster.model;

import javax.persistence.*;

@Entity
@Table(name = "quiz_group_texts")
public class QuizGroupText {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quiz_group_id")
    private QuizGroup quizGroup;

    @Lob
    @Column(name = "text", nullable = false)
    private String text;

    public QuizGroup getQuizGroup() {
        return quizGroup;
    }

    public void setQuizGroup(QuizGroup quizGroup) {
        this.quizGroup = quizGroup;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}