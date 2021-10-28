package ir.omidashouri.admin.controller.jq2;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/jq2")
public class Jq2Controller {

    //    http://localhost:8080/ShopmeAdmin/jq2/1
    @GetMapping("/1")
    public String ajax1Page() {
        return "jq2/jq2_1";
    }

    //    http://localhost:8080/ShopmeAdmin/jq2/92
    @GetMapping("/92")
    public String ajax92Page() {
        return "jq2/jq2_92";
    }


//    ----------------------

    //    http://localhost:8080/ShopmeAdmin/jq2/93
    @GetMapping("/93")
    public String ajax93Page() {
        return "jq2/jq2_93";
    }

    //    http://localhost:8080/ShopmeAdmin/jq2/rest/93
    @GetMapping("/rest/93")
    @ResponseBody
    public String ajax93Rest() {
        return "This test.html file get loaded";
    }


//    ----------------------


    //    http://localhost:8080/ShopmeAdmin/jq2/94
    @GetMapping("/94")
    public String ajax94Page() {
        return "jq2/jq2_94";
    }


    //    http://localhost:8080/ShopmeAdmin/jq2/rest/94
    @PostMapping("/rest/94")
    @ResponseBody
    public String ajax94Rest(Model model, @Param("name") String name, @Param("nm") String nm) {

        List<String> names = Arrays.asList("omidashouri", "omidashouri1", "omidashouri2", "omdashouri3");
        if (names.stream().anyMatch(nz -> nz.equalsIgnoreCase(name))) {
            return "name found in the list";
        } else {
            return "name not found in the list.  " + nm;
        }
    }

}
