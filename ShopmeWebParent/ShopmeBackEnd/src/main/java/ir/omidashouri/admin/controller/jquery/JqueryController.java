package ir.omidashouri.admin.controller.jquery;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JqueryController {



    //    http://localhost:8080/ShopmeAdmin/jq/2
    @GetMapping("/jq/2")
    public String viewIndex1Page(){
        return "/jq/jquery_2";
    }

    //    http://localhost:8080/ShopmeAdmin/jq
//    @GetMapping("/jq")
    public String viewHomePage(){
        return "/jq/jquery_1";
    }
}
