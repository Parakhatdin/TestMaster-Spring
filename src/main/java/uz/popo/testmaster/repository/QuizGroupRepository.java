package uz.popo.testmaster.repository;

import org.springframework.data.repository.CrudRepository;
import uz.popo.testmaster.model.QuizGroup;

public interface QuizGroupRepository extends CrudRepository<QuizGroup, Integer> {
}