package uz.popo.testmaster.repository;

import org.springframework.data.repository.CrudRepository;
import uz.popo.testmaster.model.Part;

public interface PartRepository extends CrudRepository<Part, Integer> {
}