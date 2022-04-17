package uz.popo.testmaster.repository;

import org.springframework.data.repository.CrudRepository;
import uz.popo.testmaster.model.Level;

public interface LevelRepository extends CrudRepository<Level, Integer> {
}