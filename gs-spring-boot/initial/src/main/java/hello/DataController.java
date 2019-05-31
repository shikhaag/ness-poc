package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DataController {
    
    @RequestMapping("/getData")
    public String getData() {
        return "Inside DataController of getData";
    }
	
	 @RequestMapping("/postData")
    public String postData() {
        return "Inside DataController of postData";
    }
    
	 @RequestMapping("/fetchAllData")
    public String fetchAllData() {
        return "Inside DataController of fetchAllData";
    }
}
