package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;


import java.util.List;

@Controller
public class HelloController {
    private final UserService userService;

    @Autowired
    public HelloController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public String showAllUsers(Model model) {
        List<User> allUsers = userService.getAllUsers();
        model.addAttribute("allUsers", allUsers);
        return "index";
    }

    @GetMapping(value = "/addNewUser")
    public String addNewUser(Model model) {
        model.addAttribute("user", new User());
        return "user_info";
    }

    @GetMapping(value = "/saveUser")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping(value = "/editUser/{id}")
    public String updateUser(@PathVariable("id") int id, Model model) {
        User user = userService.getUser(id);
        model.addAttribute("user", user);
        return "user_edit";
    }
    //вопрос по @GetMapping и @PostMapping так и остался открыт! Вот в таком виде как сейчас - все отрабатывает.
    //если меняю методы изменить/добавить/удалить на Post  то в браузере выдает ошибку 405....
    //как я понял по тексту ошибки почему то браузер ожидает именно get а не пост.
    @GetMapping(value = "/update")
    public String Update(@ModelAttribute("user") User user) {
        userService.editUser(user);
        return "redirect:/";
    }


    @GetMapping(value = "/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        userService.deleteUser(id);
        return "redirect:/";
    }

}