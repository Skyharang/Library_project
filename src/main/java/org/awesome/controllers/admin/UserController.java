package org.awesome.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("adminUserController")
@RequestMapping("/admin/user")
public class UserController {
    @GetMapping
    public String userList() {

        return "admin/user/list";
    }


}
