package uz.popo.testmaster.repository;

import org.springframework.data.repository.CrudRepository;
import uz.popo.testmaster.model.Direction;

public interface DirectionRepository extends CrudRepository<Direction, Integer> {
}