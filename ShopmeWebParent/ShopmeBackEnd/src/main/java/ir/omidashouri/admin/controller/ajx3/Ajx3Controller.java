package ir.omidashouri.admin.controller.ajx3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ajx3")
public class Ajx3Controller {

    //    http://localhost:8080/ShopmeAdmin/ajx3/1
    @GetMapping("/1")
    public String ajax1Page() {
        return "ajx3/ajx3_1";
    }


    //    http://localhost:8080/ShopmeAdmin/ajx3/2
    @GetMapping("/2")
    public String ajax2Page() {
        return "ajx3/ajx3_2";
    }


    //    http://localhost:8080/ShopmeAdmin/ajx3/3
    @GetMapping("/3")
    public String ajax3Page() {
        return "ajx3/ajx3_3";
    }


    //    http://localhost:8080/ShopmeAdmin/ajx3/4
    @GetMapping("/4")
    public String ajax4Page() {
        return "ajx3/ajx3_4";
    }


    //    http://localhost:8080/ShopmeAdmin/ajx3/5
    @GetMapping("/5")
    public String ajax5Page() {
        return "ajx3/ajx3_5";
    }


}
