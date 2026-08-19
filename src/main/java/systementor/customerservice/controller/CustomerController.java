package systementor.customerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import systementor.customerservice.model.Customer;
import systementor.customerservice.repo.CustomerRepository;

@RestController
public class CustomerController {

    private final CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/customer/1")
    public String getCustomer() {
        return repository.findById(1L)
                .map(Customer::getName)
                .orElse("unknown customer");
    }
}
