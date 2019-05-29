package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DbController {
    
    @RequestMapping("/getDbInfo")
    public String getDbInfo() {
        return "Greetings from DbController:getDbInfo Spring Boot!";
    }
    
}
