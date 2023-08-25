package nikit.tacocloud.repositories;


import nikit.tacocloud.entities.TacoOrder;
import org.springframework.data.repository.CrudRepository;



public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

}
