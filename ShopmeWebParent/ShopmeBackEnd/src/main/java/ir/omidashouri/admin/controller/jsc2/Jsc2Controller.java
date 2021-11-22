package ir.omidashouri.admin.controller.jsc2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jsc2")
public class Jsc2Controller {

    //    http://localhost:8080/ShopmeAdmin/jsc2/1
    @GetMapping("/1")
    public String ajax1Page() {
        return "jsc2/jsc2_1";
    }


    //    http://localhost:8080/ShopmeAdmin/jsc2/2
    @GetMapping("/2")
    public String ajax2Page() {
        return "jsc2/jsc2_2";
    }

/*
    //    http://localhost:8080/ShopmeAdmin/jsc2/3
    @GetMapping("/3")
    public String ajax3Page() {
        return "jsc2/jsc2_3";
    }


     //    http://localhost:8080/ShopmeAdmin/jsc2/4
    @GetMapping("/4")
    public String ajax4Page() {
        return "jsc2/jsc2_4";
    }


    //    http://localhost:8080/ShopmeAdmin/jsc2/5
    @GetMapping("/5")
    public String ajax5Page() {
        return "jsc2/jsc2_5";
    }


    //    http://localhost:8080/ShopmeAdmin/jsc2/6
    @GetMapping("/6")
    public String ajax6Page() {
        return "jsc2/jsc2_6";
    }


     //    http://localhost:8080/ShopmeAdmin/jsc2/7
    @GetMapping("/7")
    public String ajax7Page() {
        return "jsc2/jsc2_7";
    }

    //    http://localhost:8080/ShopmeAdmin/jsc2/8
    @GetMapping("/8")
    public String ajax8Page() {
        return "jsc2/jsc2_8";
    }

    //    http://localhost:8080/ShopmeAdmin/jsc2/9
    @GetMapping("/9")
    public String ajax9Page() {
        return "jsc2/jsc2_9";
    }


    //    http://localhost:8080/ShopmeAdmin/jsc2/10
    @GetMapping("/10")
    public String ajax10Page() {
        return "jsc2/jsc2_10";
    }*/


}
