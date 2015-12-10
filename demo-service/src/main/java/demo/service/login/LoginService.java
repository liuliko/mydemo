package demo.service.login;

import demo.api.Account;

/**
 * Created by Administrator on 2015/12/10 0010.
 */
public interface LoginService {

    Account getAccountByUserName(String username);
}
