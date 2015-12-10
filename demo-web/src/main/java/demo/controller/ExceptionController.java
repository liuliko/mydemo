package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2015/12/10 0010.
 */
@Controller
@RequestMapping(value = "errorpage")
public class ExceptionController extends BaseController {


    @RequestMapping(value = "404")
    public String do404(){
        return "errorpage/404";
    }

    @RequestMapping(value = "405")
    public String do405(){
        return "errorpage/405";
    }

    @RequestMapping(value = "500")
    public String do500(){
        return "errorpage/500";
    }
}
