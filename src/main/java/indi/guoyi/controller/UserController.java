package indi.guoyi.controller;

import indi.guoyi.domain.User;
import indi.guoyi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService us;

    @RequestMapping(value = "/insert")
    public void insertUser(User user,HttpServletRequest request, HttpServletResponse response) throws IOException {
        us.insert(user);
        response.sendRedirect(request.getContextPath()+"/user/findAll");
        return;
    }

    @RequestMapping(value = "/delete")
    public void deleteUser(Integer id,HttpServletRequest request, HttpServletResponse response) throws IOException {
        us.delete(id);
        response.sendRedirect(request.getContextPath()+"/user/findAll");
        return;
    }

    @RequestMapping(value = "/findAll")
    public String findAll(Model model) throws IOException {
        List<User> users = us.findAll();
        model.addAttribute("users",users);

        return "success";
    };

    @RequestMapping(value = "update")
    public void updateUser(User user,HttpServletRequest request, HttpServletResponse response) throws IOException {
        us.update(user);
        response.sendRedirect(request.getContextPath()+"/user/findAll");
        return;
    }
}
