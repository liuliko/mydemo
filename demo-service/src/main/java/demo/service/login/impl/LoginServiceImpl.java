package demo.service.login.impl;

import demo.api.Account;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import demo.service.login.LoginService;

/**
 * Created by ll on 2015/12/10 0010.
 */
@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    private String namespace="account";

    public Account getAccountByUserName(String username) {
        return sqlSessionTemplate.selectOne(namespace+".getAccountByUserName",username);
    }
}
