package springboot.repositories;

import org.springframework.data.repository.CrudRepository;
import springboot.models.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
