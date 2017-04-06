package com.skynet.web;

import com.skynet.entity.UserEntity;
import com.skynet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by SkyNet on 2017/3/9.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ModelAttribute
    public void getUser(@RequestParam(value = "userId", required = false) Long userId, Model model){
        if(userId != null){
            UserEntity user = userService.getUser(userId);
            System.out.println(user);
            model.addAttribute("userEntity", user);
        }
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        List<UserEntity> users = userService.getUsers(0, 10);
        model.addAttribute("users", users);
        return "list";
    }

    @RequestMapping(value = "/{userId}/detail", method = RequestMethod.GET)
    public String detail(@PathVariable("userId") Long userId, Model model) {
        if (userId == null) {
            return "redirect:/user/list";
        }
        UserEntity user = userService.getUser(userId);
        if (user == null) {
            return "redirect:/user/list";
        }
        model.addAttribute("user", user);
        return "detail";
    }

    @Transactional
    @RequestMapping(value = "/{userId}/delete",method = RequestMethod.DELETE)
    public String delete(@PathVariable("userId") Long userId){
        if (userId == null) {
            return "redirect:/user/list";
        }
        try {
            userService.deleteUser(userId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/user/list";
    }

    @Transactional
    @RequestMapping(value = "/edit",method = RequestMethod.PUT)
    public String editUser(UserEntity user){
        System.out.println(user);
        userService.saveUser(user);
        return "redirect:/user/list";
    }

    @Transactional
    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    public String addUser(UserEntity user){
        userService.saveUser(user);
        return "redirect:/user/list";
    }

    @RequestMapping(value = "/input",method = RequestMethod.GET)
    public String inputUser(Model model){
        model.addAttribute("user",new UserEntity());
        return "detail";
    }


}
