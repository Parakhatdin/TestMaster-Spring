package uz.popo.testmaster.repository;

import org.springframework.data.repository.CrudRepository;
import uz.popo.testmaster.model.TestGroup;

public interface TestGroupRepository extends CrudRepository<TestGroup, Integer> {
}