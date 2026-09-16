package systementor.customerservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import systementor.customerservice.model.Customer;
import systementor.customerservice.repo.CustomerRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CustomerServiceApplicationTests {


    @Autowired
    CustomerRepository customerRepository;


    @BeforeEach
    void cleanUp(){
        customerRepository.deleteAll();
    }

    @Test
    void saveAndFetchCustomer() {
        Customer customer = new Customer();
        customer.setId(1L);
        customer.setName("Yahya");

        customerRepository.save(customer);

        List<Customer> customers = customerRepository.findAll(); // Select * from customers;

        assertEquals(1, customers.size());
        assertEquals("Yahya", customers.get(0).getName());
    }




}
