package uz.popo.testmaster.repository;

import org.springframework.data.repository.CrudRepository;
import uz.popo.testmaster.model.Test;
import uz.popo.testmaster.model.TestName;

public interface TestNameRepository extends CrudRepository<TestName, Test> {
}