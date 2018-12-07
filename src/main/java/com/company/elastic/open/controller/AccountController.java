package com.company.elastic.open.controller;

import com.company.elastic.base.constants.ErrorCode;
import com.company.elastic.open.dao.AccountDao;
import com.company.elastic.open.entity.Account;
import com.company.elastic.open.exception.ServiceBusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountDao accountDao;

    @GetMapping("/get/{id}")
    public Account getAccountById(@PathVariable Long id) {
        return accountDao.findById(id).orElseThrow(() -> new ServiceBusinessException(ErrorCode.E1001));
    }

    @GetMapping("/all")
    public Iterable<Account> searchAll(){
        return accountDao.findAll();
    }


}
