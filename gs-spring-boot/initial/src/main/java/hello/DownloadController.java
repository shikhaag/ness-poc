package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
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

