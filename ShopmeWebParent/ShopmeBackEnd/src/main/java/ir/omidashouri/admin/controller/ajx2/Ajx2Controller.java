package ir.omidashouri.admin.controller.ajx2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ajx2")
public class Ajx2Controller {

    //    http://localhost:8080/ShopmeAdmin/ajx2/1
    @GetMapping("/1")
    public String ajax1Page() {
        return "ajx2/ajx2_1";
    }


    //    http://localhost:8080/ShopmeAdmin/ajx2/2
    @GetMapping("/2")
    public String ajax2Page() {
        return "ajx2/ajx2_2";
    }


    //    http://localhost:8080/ShopmeAdmin/ajx2/3
    @GetMapping("/3")
    public String ajax3Page() {
        return "ajx2/ajx2_3";
    }


    //    http://localhost:8080/ShopmeAdmin/ajx2/4
    @GetMapping("/4")
    public String ajax4Page() {
        return "ajx2/ajx2_4";
    }


}
