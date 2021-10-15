package ir.omidashouri.admin.controller;

import ir.omidashouri.admin.service.UserService;
import ir.omidashouri.common.entity.RoleEntity;
import ir.omidashouri.common.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    @GetMapping("/users")
    public String getUsers(Model model){
        List<UserEntity> users = userService.listAll();
        model.addAttribute("users",users);
        return "users";
    }

    @GetMapping("/users/new")
    public String createNewUser(Model model){
        List<RoleEntity> listRoles = userService.listRoles();
        model.addAttribute("listRoles",listRoles);

        UserEntity user = new UserEntity();
        user.setEnabled(true);
        model.addAttribute("user",user);
        return "user_form";
    }

    @PostMapping("/users/save")
    public String saveUser(UserEntity user, RedirectAttributes redirectAttributes){
        UserEntity savedUser = userService.save(user);
        System.out.println(savedUser);
        redirectAttributes.addFlashAttribute("message","The user has been saved successfully.");
        return "redirect:/users";
    }

}
