package ir.omidashouri.admin.controller.ajx6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ajx6")
public class Ajx6Controller {

    //    http://localhost:8080/ShopmeAdmin/ajx6/1
    @GetMapping("/1")
    public String ajax1Page() {
        return "ajx6/ajx6_1";
    }


    //    http://localhost:8080/ShopmeAdmin/ajx6/2
    @GetMapping("/2")
    public String ajax2Page() {
        return "ajx6/ajx6_2";
    }

/*
    //    http://localhost:8080/ShopmeAdmin/ajx6/3
    @GetMapping("/3")
    public String ajax3Page() {
        return "ajx6/ajx6_3";
    }


     //    http://localhost:8080/ShopmeAdmin/ajx6/4
    @GetMapping("/4")
    public String ajax4Page() {
        return "ajx6/ajx6_4";
    }


    //    http://localhost:8080/ShopmeAdmin/ajx6/5
    @GetMapping("/5")
    public String ajax5Page() {
        return "ajx6/ajx6_5";
    }


    //    http://localhost:8080/ShopmeAdmin/ajx6/6
    @GetMapping("/6")
    public String ajax6Page() {
        return "ajx6/ajx6_6";
    }


     //    http://localhost:8080/ShopmeAdmin/ajx6/7
    @GetMapping("/7")
    public String ajax7Page() {
        return "ajx6/ajx6_7";
    }

    //    http://localhost:8080/ShopmeAdmin/ajx6/8
    @GetMapping("/8")
    public String ajax8Page() {
        return "ajx6/ajx6_8";
    }

    //    http://localhost:8080/ShopmeAdmin/ajx6/9
    @GetMapping("/9")
    public String ajax9Page() {
        return "ajx6/ajx6_9";
    }


    //    http://localhost:8080/ShopmeAdmin/ajx6/10
    @GetMapping("/10")
    public String ajax10Page() {
        return "ajx6/ajx6_10";
    }*/


}
