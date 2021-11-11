package ir.omidashouri.admin.controller;

import ir.omidashouri.admin.exception.UserNotFoundException;
import ir.omidashouri.admin.service.FileUploadUtil;
import ir.omidashouri.admin.service.UserService;
import ir.omidashouri.common.entity.RoleEntity;
import ir.omidashouri.common.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


//    http://localhost:8080/ShopmeAdmin/users

    @GetMapping("/users")
    public String getUsers(Model model) {
        List<UserEntity> users = userService.listAll();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/users/new")
    public String createNewUser(Model model) {
        List<RoleEntity> listRoles = userService.listRoles();
        model.addAttribute("listRoles", listRoles);

        UserEntity user = new UserEntity();
        user.setEnabled(true);
        model.addAttribute("user", user);
        model.addAttribute("pageTitle", "Create New User");
        return "user_form";
    }

    @PostMapping("/users/save")
    public String saveUser(UserEntity user, RedirectAttributes redirectAttributes,
                           @RequestParam("image") MultipartFile multipartFile) throws IOException {

        UserEntity savedUser;
        if (!multipartFile.isEmpty()) {
            String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
            user.setPhotos(fileName);
            savedUser = userService.save(user);
            String uploadDir = "user-photos/" + savedUser.getId();

//            clean directory before save file
            FileUploadUtil.cleanDir(uploadDir);

            FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
        } else {
//            in edit mode if the user do not have photo from previous then set its photo to null
            if (user.getPhotos().isEmpty())
                user.setPhotos(null);
            savedUser = userService.save(user);
        }
        System.out.println(savedUser);
        redirectAttributes.addFlashAttribute("message", "The user has been saved successfully.");
        return "redirect:/users";
    }

    @GetMapping("/users/edit/{id}")
    public String editUser(@PathVariable(name = "id") Integer id,
                           Model model, RedirectAttributes redirectAttributes) {
        try {
            UserEntity user = userService.findById(id);
            List<RoleEntity> listRoles = userService.listRoles();

            model.addAttribute("user", user);
            model.addAttribute("pageTitle", "Edit User (ID: " + id + ")");
            model.addAttribute("listRoles", listRoles);
            return "user_form";
        } catch (UserNotFoundException exception) {
            redirectAttributes.addFlashAttribute("message", exception.getMessage());
            return "redirect:/users";
        }
    }

    @GetMapping("/users/delete/{id}")
    public String deleteUser(@PathVariable(name = "id") Integer id,
                             Model model, RedirectAttributes redirectAttributes) {
        try {
            userService.delete(id);
            redirectAttributes.addFlashAttribute("message",
                    "The user ID " + id + " has been deleted successfully");
        } catch (UserNotFoundException exception) {
            redirectAttributes.addFlashAttribute("message", exception.getMessage());
        }
        return "redirect:/users";
    }

    @GetMapping("/users/{userId}/enabled/{userStatus}")
    public String testUpdateUserStatus(@PathVariable("userId") Integer userId,
                                       @PathVariable("userStatus") boolean userStatus,
                                       RedirectAttributes redirectAttributes) {

        userService.updateEnableStatus(userId, userStatus);
        String status = userStatus ? "enabled" : "disabled";
        String message = "The user ID " + userId + " has been " + status;
        redirectAttributes.addFlashAttribute("message", message);

        return "redirect:/users";
    }
}
