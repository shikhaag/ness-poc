package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class DataService {
    private int x=0;
    int data=10000; // Ashish Added this line for conflict checking

}
