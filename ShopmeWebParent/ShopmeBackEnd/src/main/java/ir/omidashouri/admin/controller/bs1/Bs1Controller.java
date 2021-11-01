package ir.omidashouri.admin.controller.bs1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bs1")
public class Bs1Controller {

    //    http://localhost:8080/ShopmeAdmin/bs1/
    @GetMapping("/")
    public String ajax1Page() {
        return "bs1/index";
    }


    //    http://localhost:8080/ShopmeAdmin/bs1/2
    @GetMapping("/2")
    public String ajax2Page() {
        return "bs1/bs1_2";
    }

/*
    //    http://localhost:8080/ShopmeAdmin/bs1/3
    @GetMapping("/3")
    public String ajax3Page() {
        return "bs1/bs1_3";
    }


     //    http://localhost:8080/ShopmeAdmin/bs1/4
    @GetMapping("/4")
    public String ajax4Page() {
        return "bs1/bs1_4";
    }


    //    http://localhost:8080/ShopmeAdmin/bs1/5
    @GetMapping("/5")
    public String ajax5Page() {
        return "bs1/bs1_5";
    }


    //    http://localhost:8080/ShopmeAdmin/bs1/6
    @GetMapping("/6")
    public String ajax6Page() {
        return "bs1/bs1_6";
    }


     //    http://localhost:8080/ShopmeAdmin/bs1/7
    @GetMapping("/7")
    public String ajax7Page() {
        return "bs1/bs1_7";
    }

    //    http://localhost:8080/ShopmeAdmin/bs1/8
    @GetMapping("/8")
    public String ajax8Page() {
        return "bs1/bs1_8";
    }

    //    http://localhost:8080/ShopmeAdmin/bs1/9
    @GetMapping("/9")
    public String ajax9Page() {
        return "bs1/bs1_9";
    }


    //    http://localhost:8080/ShopmeAdmin/bs1/10
    @GetMapping("/10")
    public String ajax10Page() {
        return "bs1/bs1_10";
    }*/


}
