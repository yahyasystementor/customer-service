package systementor.customerservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import systementor.customerservice.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
