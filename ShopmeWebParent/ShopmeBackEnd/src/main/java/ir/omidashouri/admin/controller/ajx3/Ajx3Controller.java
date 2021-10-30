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


    //    http://localhost:8080/ShopmeAdmin/ajx3/6
    @GetMapping("/6")
    public String ajax6Page() {
        return "ajx3/ajx3_6";
    }


    //    http://localhost:8080/ShopmeAdmin/ajx3/7
    @GetMapping("/7")
    public String ajax7Page() {
        return "ajx3/ajx3_7";
    }

    //    http://localhost:8080/ShopmeAdmin/ajx3/8
    @GetMapping("/8")
    public String ajax8Page() {
        return "ajx3/ajx3_8";
    }

    //    http://localhost:8080/ShopmeAdmin/ajx3/9
    @GetMapping("/9")
    public String ajax9Page() {
        return "ajx3/ajx3_9";
    }


    //    http://localhost:8080/ShopmeAdmin/ajx3/10
    @GetMapping("/10")
    public String ajax10Page() {
        return "ajx3/ajx3_10";
    }


    //    http://localhost:8080/ShopmeAdmin/ajx3/11
    @GetMapping("/11")
    public String ajax11Page() {
        return "ajx3/ajx3_11";
    }


    //    http://localhost:8080/ShopmeAdmin/ajx3/12
    @GetMapping("/12")
    public String ajax12Page() {
        return "ajx3/ajx3_12";
    }

}
