package ir.omidashouri.admin.controller.jsc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jsc1")
public class Jsc1Controller {

    //    http://localhost:8080/ShopmeAdmin/jsc1/1
    @GetMapping("/1")
    public String ajax1Page() {
        return "jsc1/jsc1_1";
    }


    //    http://localhost:8080/ShopmeAdmin/jsc1/2
    @GetMapping("/2")
    public String ajax2Page() {
        return "jsc1/jsc1_2";
    }


    //    http://localhost:8080/ShopmeAdmin/jsc1/3
    @GetMapping("/3")
    public String ajax3Page() {
        return "jsc1/jsc1_3";
    }

/*
     //    http://localhost:8080/ShopmeAdmin/jsc1/4
    @GetMapping("/4")
    public String ajax4Page() {
        return "jsc1/jsc1_4";
    }


    //    http://localhost:8080/ShopmeAdmin/jsc1/5
    @GetMapping("/5")
    public String ajax5Page() {
        return "jsc1/jsc1_5";
    }


    //    http://localhost:8080/ShopmeAdmin/jsc1/6
    @GetMapping("/6")
    public String ajax6Page() {
        return "jsc1/jsc1_6";
    }


     //    http://localhost:8080/ShopmeAdmin/jsc1/7
    @GetMapping("/7")
    public String ajax7Page() {
        return "jsc1/jsc1_7";
    }

    //    http://localhost:8080/ShopmeAdmin/jsc1/8
    @GetMapping("/8")
    public String ajax8Page() {
        return "jsc1/jsc1_8";
    }

    //    http://localhost:8080/ShopmeAdmin/jsc1/9
    @GetMapping("/9")
    public String ajax9Page() {
        return "jsc1/jsc1_9";
    }


    //    http://localhost:8080/ShopmeAdmin/jsc1/10
    @GetMapping("/10")
    public String ajax10Page() {
        return "jsc1/jsc1_10";
    }*/


}
