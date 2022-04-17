package uz.popo.testmaster.model;

import javax.persistence.*;

@Entity
@Table(name = "quiz_questions")
public class QuizQuestion {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

//TODO [JPA Buddy] generate columns from DB
}