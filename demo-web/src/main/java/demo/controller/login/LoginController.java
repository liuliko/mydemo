package demo.controller.login;


import demo.api.Account;
import demo.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import demo.service.login.LoginService;

/**
 * Created by Administrator on 2015/12/10 0010.
 */
@RequestMapping(value = "login")
@Controller
public class LoginController extends BaseController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "")
    public String loginPage(ModelMap map) {
        return "login";
    }


    @RequestMapping(value = "signIn")
    public String signIn(ModelMap map, String username, String password) {
        String flag = "", message = "";
        if (username == null || username.isEmpty()) {
            flag = "0";
            message = "用户名为空";
        } else if (password == null || password.isEmpty()) {
            flag = "0";
            message = "密码为空";
        } else {
            Account account = loginService.getAccountByUserName(username);
            if (account == null) {
                flag = "0";
                message = "用户名错误";
            } else if (!password.equals(account.getPassword())) {
                flag = "0";
                message = "密码错误";
            } else {
                flag = "1";
                message = "登陆成功";
            }
        }
        map.put("flag", flag);
        map.put("message", message);
        return "login";
    }
}
