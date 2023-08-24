package walker;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import walker.model.Customer;
import walker.model.CustomerRepository;
import walker.model.GreetResponse;
import walker.model.Person;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("api/v1/customers")
public class Main {
    private final CustomerRepository customerRepository;

    public Main(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public static void main (String [] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping
    public List<Customer> getCustomer (){
        return customerRepository.findAll();
    }

   /* @GetMapping("/greet")
    public GreetResponse greet() {
        GreetResponse response = new GreetResponse(
                " Hello",
                List.of("Python", "JavaScript","Java"),
                new Person("Anthony", 30,3000)
        );
        return response;
    }*/
}
