package ir.omidashouri.admin.controller.bs1;

import ir.omidashouri.admin.controller.bs1.entity.ContactBS1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/bs1")
public class Bs1Controller {

    //    http://localhost:8080/ShopmeAdmin/bs1/
    @GetMapping("/")
    public String bootStrapIndexPage() {
        return "bs1/index";
    }


    //    http://localhost:8080/ShopmeAdmin/bs1/2
    @GetMapping("/about")
    public String bootStrapAboutPage() {
        return "bs1/about";
    }


    //    http://localhost:8080/ShopmeAdmin/bs1/portfolio
    @GetMapping("/portfolio")
    public String bootStrapPortfolioPage() {
        return "bs1/portfolio";
    }


    //    http://localhost:8080/ShopmeAdmin/bs1/contact
    @GetMapping("/contact")
    public String bootstrapContactPage(Model model) {
        ContactBS1 contactBS1 = new ContactBS1();
        model.addAttribute("contact",contactBS1);
        return "bs1/contact";
    }

    //    http://localhost:8080/ShopmeAdmin/bs1/contact-success
    @PostMapping("/contact-success")
    public String bootstrapSubmitContactSuccessPage(ContactBS1 contact, RedirectAttributes redirectAttributes) {
        System.out.println(contact);
        redirectAttributes.addFlashAttribute("fullName",contact.getFirstName()+" "+contact.getLastName());
        return "redirect:/bs1/contact-success";
    }

    //    http://localhost:8080/ShopmeAdmin/bs1/contact-success
    @GetMapping("/contact-success")
    public String bootstrapContactSuccessPage() {
        return "bs1/contact-success";
    }

}
