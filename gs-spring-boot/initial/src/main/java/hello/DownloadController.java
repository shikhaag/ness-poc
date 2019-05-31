package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
<<<<<<< HEAD
public class DataController {
    
    @RequestMapping("/getData")
    public String getData() {
        return "Inside DataController of getData";
    }
	
	 @RequestMapping("/postData")
    public String postData() {
        return "Inside DataController of postData";
    }
    
}
=======
public class DownloadController {
    
    @RequestMapping("/getDownloadData")
    public String getDownloadData() {
        return "Inside DataController of getDownloadData";
    }
	
	 @RequestMapping("/postDownloadData")
    public String postDownloadData() {
        return "Inside DataController of postDownloadData";
    }
    
}

>>>>>>> refs/remotes/origin/master
