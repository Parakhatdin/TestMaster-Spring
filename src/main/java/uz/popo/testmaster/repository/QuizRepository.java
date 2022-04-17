package uz.popo.testmaster.repository;

import org.springframework.data.repository.CrudRepository;
import uz.popo.testmaster.model.Quiz;

public interface QuizRepository extends CrudRepository<Quiz, Integer> {
}