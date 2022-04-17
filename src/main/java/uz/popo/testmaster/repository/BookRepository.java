package uz.popo.testmaster.repository;

import org.springframework.data.repository.CrudRepository;
import uz.popo.testmaster.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
}