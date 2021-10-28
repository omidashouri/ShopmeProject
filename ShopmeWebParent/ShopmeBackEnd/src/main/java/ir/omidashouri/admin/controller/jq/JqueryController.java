package ir.omidashouri.admin.controller.jq;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class JqueryController {



    //    http://localhost:8080/ShopmeAdmin/jq/41?name=omidashouri
    @PostMapping("/jq/41")
    @ResponseBody
    public ResponseEntity<?> viewJquery4_1Rest(Model model, @Param("name") String name) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        int randomNumber = new Random().nextInt(100);
        model.addAttribute("randomNumber",randomNumber);
        model.addAttribute("firstName",name);
        String jsonModel = objectMapper.writeValueAsString(model);
        ResponseEntity responseEntity = new ResponseEntity(jsonModel, HttpStatus.OK);
        return responseEntity;
    }

    //    http://localhost:8080/ShopmeAdmin/jq/4
    @GetMapping("/jq/4")
    public String viewJquery4Page(){
        return "/jq/jquery_4";
    }


//    --------------------------------------------------------------------------------------


    //    http://localhost:8080/ShopmeAdmin/jq/33?name=omidashouri
    // we can also use ResponseEntity for response
    @GetMapping("/jq/33")
    @ResponseBody
    public String viewJquery3_1Rest(Model model, @Param("name") String name) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        int randomNumber = new Random().nextInt(100);
        model.addAttribute("randomNumber",randomNumber);
        model.addAttribute("firstName",name);
        String jsonModel = objectMapper.writeValueAsString(model);
        return jsonModel;
    }

    //    http://localhost:8080/ShopmeAdmin/jq/32
    @GetMapping("/jq/32")
    public String viewJquery3_1PageBy32(Model model, @Param("name") String name){
        int randomNumber = new Random().nextInt(100);
        model.addAttribute("randomNumber",randomNumber);
        model.addAttribute("name",name);
        return "/jq/jquery_3_1";
    }

    //    http://localhost:8080/ShopmeAdmin/jq/31
    @GetMapping("/jq/31")
    public String viewJquery3_1Page(Model model){
       int randomNumber = new Random().nextInt(100);
        model.addAttribute("randomNumber",randomNumber);
        return "/jq/jquery_3_1";
    }

    //    http://localhost:8080/ShopmeAdmin/jq/3
    @GetMapping("/jq/3")
    public String viewJquery3Page(){
        return "/jq/jquery_3";
    }


//    -----------------------------------------------------------------------------


    //    http://localhost:8080/ShopmeAdmin/jq/2
    @GetMapping("/jq/2")
    public String viewJquery2Page(){
        return "/jq/jquery_2";
    }

    //    http://localhost:8080/ShopmeAdmin/jq
//    @GetMapping("/jq")
    public String viewHomePage(){
        return "/jq/jquery_1";
    }
}
