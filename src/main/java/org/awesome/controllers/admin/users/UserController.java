package org.awesome.controllers.admin;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.awesome.commons.Pagination;
import org.awesome.controllers.admin.UserListForm;
import org.awesome.entities.User;
import org.awesome.models.user.UserListService;
import org.awesome.repositories.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller("adminUserController")
@RequestMapping("/admin/user")
@RequiredArgsConstructor
public class UserController {

    private final UserListService userListService;
    private final UserRepository userRepository;

    @GetMapping
    public String userList(org.awesome.controllers.admin.UserSearch userSearch, Model model, HttpServletRequest request) {
        List<User> userList = userListService.getUserList(userSearch).toList();
        Page<User> page = userListService.getPage();

        String url = request.getContextPath() + "/admin/user";
        Pagination<User> pagination = new Pagination<>(page, url);
        model.addAttribute("userList", userList);
        model.addAttribute("pagination", pagination);

        return "admin/user/list";
    }

    // user 정보 수정
    @GetMapping("/edit/{userNo}")
    public String editUser(@PathVariable Long userNo, Model model) {
        UserListForm userform = new UserListForm();





        return "admin/user/list";
    }


    // user 삭제
    @DeleteMapping("/delete/{userNo}")
    public String deleteUser(@PathVariable Long userNo){
        User user = userRepository.findById(userNo).orElse(null);
        if (user != null) {
            userRepository.delete(user);
        }

        userRepository.flush();

        return "redirect:/admin/user";
    }


}