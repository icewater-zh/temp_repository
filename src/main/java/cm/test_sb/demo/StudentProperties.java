package cm.test_sb.demo;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//快捷键：alt+insert--->生成常用的方法
//封装配置信息
@Component //表明当前类是一个 Java Bean
@ConfigurationProperties(prefix = "student") //表示获取前缀为"tomorrow_action"的配置信息
public class StudentProperties {
    private String act_text;
    private String act_time;

    public String getAct_text() {
        return act_text;
    }

    public void setAct_text(String act_text) {
        this.act_text = act_text;
    }

    public String getAct_time() {
        return act_time;
    }

    public void setAct_time(String act_time) {
        this.act_time = act_time;
    }
}
