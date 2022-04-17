package uz.popo.testmaster.repository;

import org.springframework.data.repository.CrudRepository;
import uz.popo.testmaster.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, Integer> {
}