package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HomeController {
    
    @RequestMapping("/home")
    public String hoimeIndex() {
        return "Greetings HomeController from Spring Boot!";
    }
    
}
