package uz.popo.testmaster.repository;

import org.springframework.data.repository.CrudRepository;
import uz.popo.testmaster.model.QuizGroup;
import uz.popo.testmaster.model.QuizGroupText;

public interface QuizGroupTextRepository extends CrudRepository<QuizGroupText, QuizGroup> {
}