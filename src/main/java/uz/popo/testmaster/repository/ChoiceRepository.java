package uz.popo.testmaster.repository;

import org.springframework.data.repository.CrudRepository;
import uz.popo.testmaster.model.Choice;

public interface ChoiceRepository extends CrudRepository<Choice, Integer> {
}