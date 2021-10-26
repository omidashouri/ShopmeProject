package ir.omidashouri.admin.controller.ajax;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class AjaxController {


    //    http://localhost:8080/ShopmeAdmin/ajx/2
    @GetMapping("/ajx/2")
    public String ajax2Page() {
        return "ajx/ajax_2";
    }


//    ---------------------------------------------------------

    //    http://localhost:8080/ShopmeAdmin/ajx/1
    @GetMapping("/ajx/1")
    public String ajax1Page() {
        return "ajx/ajax_1";
    }

    @PostMapping("/ajx/checkName")
    public String checkName(Model model, @Param("name") String name) {
        String checkResult;
        if (name != null) {
            String receiveName = name;
            List<String> archiveName = Arrays.asList("omid", "omid1", "omid2", "omid3");
            if (receiveName.length() < 4) {
                checkResult = "need to be more than 3 characters";
            } else {
                if (archiveName.contains(name)) {
                    checkResult = "name is taken !!!!";
                } else {
                    checkResult = "name is available";
                }
            }
        } else {
            checkResult = "name is null";
        }
        model.addAttribute("checkResult", checkResult);
        return "ajx/ajax_checkname_1";
    }
}
