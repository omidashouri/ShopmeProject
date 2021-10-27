package ir.omidashouri.admin.controller.jq2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jq2")
public class Jq2Controller {

    //    http://localhost:8080/ShopmeAdmin/jq2/1
    @GetMapping("/1")
    public String ajax1Page() {
        return "jq2/jq2_1";
    }

    //    http://localhost:8080/ShopmeAdmin/jq2/92
    @GetMapping("/92")
    public String ajax92Page() {
        return "jq2/jq2_92";
    }
}
