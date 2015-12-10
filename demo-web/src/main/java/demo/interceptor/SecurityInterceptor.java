package demo.interceptor;


import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * @see spring mvc 的拦截器：
 * 1. preHandle方法最先被执行，return true 则继续往下执行， 否则直接返回。
 * 2. 业务处理完成后，执行postHandle方法
 * 3. 最后执行afterCompletion方法
 */
@SuppressWarnings({"unchecked", "unused"})
public class SecurityInterceptor implements HandlerInterceptor {

    private final String X_REQUESTED_WITH = "X-Requested-With";
    private Logger log = Logger.getLogger(this.getClass());

    public void afterCompletion(HttpServletRequest arg0,
                                HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
    }

    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
                           Object arg2, ModelAndView arg3) throws Exception {
    }

    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        String contextPath = request.getContextPath();
        String uri = request.getRequestURI();

        // 登录、登出、首页、静态资源直接放行

        // 用户未登录，禁止访问

        return true;
    }


}