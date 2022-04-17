package uz.popo.testmaster.repository;

import org.springframework.data.repository.CrudRepository;
import uz.popo.testmaster.model.Test;

public interface TestRepository extends CrudRepository<Test, Integer> {
}