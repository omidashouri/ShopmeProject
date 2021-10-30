package ir.omidashouri.admin.controller.ajx4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ajx4")
public class Ajx4Controller {

    //    http://localhost:8080/ShopmeAdmin/ajx4/1
    @GetMapping("/1")
    public String ajax1Page() {
        return "ajx4/ajx4_1";
    }


    //    http://localhost:8080/ShopmeAdmin/ajx4/2
    @GetMapping("/2")
    public String ajax2Page() {
        return "ajx4/ajx4_2";
    }


    //    http://localhost:8080/ShopmeAdmin/ajx4/3
    @GetMapping("/3")
    public String ajax3Page() {
        return "ajx4/ajx4_3";
    }


/*     //    http://localhost:8080/ShopmeAdmin/ajx4/4
    @GetMapping("/4")
    public String ajax4Page() {
        return "ajx4/ajx4_4";
    }


    //    http://localhost:8080/ShopmeAdmin/ajx4/5
    @GetMapping("/5")
    public String ajax5Page() {
        return "ajx4/ajx4_5";
    }


    //    http://localhost:8080/ShopmeAdmin/ajx4/6
    @GetMapping("/6")
    public String ajax6Page() {
        return "ajx4/ajx4_6";
    }


    //    http://localhost:8080/ShopmeAdmin/ajx4/7
    @GetMapping("/7")
    public String ajax7Page() {
        return "ajx4/ajx4_7";
    }

    //    http://localhost:8080/ShopmeAdmin/ajx4/8
    @GetMapping("/8")
    public String ajax8Page() {
        return "ajx4/ajx4_8";
    }

    //    http://localhost:8080/ShopmeAdmin/ajx4/9
    @GetMapping("/9")
    public String ajax9Page() {
        return "ajx4/ajx4_9";
    }


    //    http://localhost:8080/ShopmeAdmin/ajx4/10
    @GetMapping("/10")
    public String ajax10Page() {
        return "ajx4/ajx4_10";
    }*/


}
