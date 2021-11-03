package ir.omidashouri.admin.controller.ajx5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ajx5")
public class Ajx5Controller {

    //    http://localhost:8080/ShopmeAdmin/ajx5/1
    @GetMapping("/1")
    public String ajax1Page() {
        return "ajx5/ajx5_1";
    }

/*
    //    http://localhost:8080/ShopmeAdmin/ajx5/2
    @GetMapping("/2")
    public String ajax2Page() {
        return "ajx5/ajx5_2";
    }


    //    http://localhost:8080/ShopmeAdmin/ajx5/3
    @GetMapping("/3")
    public String ajax3Page() {
        return "ajx5/ajx5_3";
    }


     //    http://localhost:8080/ShopmeAdmin/ajx5/4
    @GetMapping("/4")
    public String ajax4Page() {
        return "ajx5/ajx5_4";
    }


    //    http://localhost:8080/ShopmeAdmin/ajx5/5
    @GetMapping("/5")
    public String ajax5Page() {
        return "ajx5/ajx5_5";
    }


    //    http://localhost:8080/ShopmeAdmin/ajx5/6
    @GetMapping("/6")
    public String ajax6Page() {
        return "ajx5/ajx5_6";
    }


     //    http://localhost:8080/ShopmeAdmin/ajx5/7
    @GetMapping("/7")
    public String ajax7Page() {
        return "ajx5/ajx5_7";
    }

    //    http://localhost:8080/ShopmeAdmin/ajx5/8
    @GetMapping("/8")
    public String ajax8Page() {
        return "ajx5/ajx5_8";
    }

    //    http://localhost:8080/ShopmeAdmin/ajx5/9
    @GetMapping("/9")
    public String ajax9Page() {
        return "ajx5/ajx5_9";
    }


    //    http://localhost:8080/ShopmeAdmin/ajx5/10
    @GetMapping("/10")
    public String ajax10Page() {
        return "ajx5/ajx5_10";
    }*/


}
