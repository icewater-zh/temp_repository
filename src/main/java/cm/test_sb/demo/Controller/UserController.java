package cm.test_sb.demo.Controller;

import cm.test_sb.demo.Mapper.UserMapper;
import cm.test_sb.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//@RestController
@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/listUser")
    public String listUser(Model m){
        List<User> u= userMapper.findAllUser();
        System.out.println("list!!!");
        m.addAttribute("users",u);
        return "listUser";
    }
}
