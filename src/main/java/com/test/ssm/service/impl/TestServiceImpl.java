package com.test.ssm.service.impl;

import com.test.ssm.dao.CommonDao;
import com.test.ssm.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 上官炳强
 * @description
 * @since 2018-07-04 / 09:11:25
 */
@Service
public class TestServiceImpl implements TestService{

    @Autowired
    private CommonDao commonDao;

    @Override
    public void onceCall(String dbName) {
        commonDao.onceCall(dbName);
    }

    @Override
    public void oneMoreTimeCall(List<String> dbNames) {
        commonDao.oneMoreTimeCall(dbNames);
    }
}
