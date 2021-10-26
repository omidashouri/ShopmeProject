package ir.omidashouri.admin.controller.ajax;

import ir.omidashouri.common.domain.ajx.AjaxJson;
import ir.omidashouri.common.domain.ajx.ContentJson;
import ir.omidashouri.common.domain.ajx.TopJson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class AjaxRestController {


//    http://localhost:8080/ShopmeAdmin/ajx/jsondata

    @GetMapping("/ajx/jsondata")
    private AjaxJson getAjaxJson() {

        AjaxJson data = new AjaxJson();
        data.setPage("Main Page");
        data.setHeader("Welcome to my page");

        TopJson top = new TopJson();
        top.setIntro("This is my new website");
        top.setMainBody("All this content comes from JSON data.");
        data.setTop(top);

        ContentJson content1 = new ContentJson();
        content1.setHeader("first paragraph");
        content1.setContent("blah blah blah");

        ContentJson content2 = new ContentJson();
        content2.setHeader("second paragraph");
        content2.setContent("blah blah blah even more");

        data.setContents(Arrays.asList(content1, content2));

        return data;
    }

}
