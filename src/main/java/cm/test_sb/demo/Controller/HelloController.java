package cm.test_sb.demo.Controller;


import cm.test_sb.demo.StudentProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

//测试控制器
@RestController//该注解是 @Controller 和 @ResponseBody 注解的合体版
////@Controller
public class HelloController {
    /* @Value("${student.act_text}")
     private String act_text;
     @Value("${student.act_time}")//??报错
     private String act_time;*/
    @Autowired
    private StudentProperties sp;
    @RequestMapping("/hello")//测试：localhost:8080/first/hello
    public String hello(Model m){
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        for(int i=0;i<4;i++)
        System.out.println("hello!!");
        /*return "hello spring boot!"+"\n"+"在"+act_time+","+act_text;*/
        return "hello spring boot!"+"\n"+"在"+sp.getAct_time()+","+sp.getAct_text();
    }
}
