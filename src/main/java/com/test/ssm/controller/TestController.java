package com.test.ssm.controller;

import com.test.ssm.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @author 上官炳强
 * @description
 * @since 2018-07-04 / 09:10:20
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/once")
    @ResponseBody
    public Object callable(String dbName){
        testService.onceCall(dbName);
        return "OK";
    }

    @RequestMapping("/more")
    @ResponseBody
    public Object callable(HttpServletRequest request){
        Enumeration parameterNames = request.getParameterNames();
        List<String> dbNames = new ArrayList<>();
        while (parameterNames.hasMoreElements()){
            dbNames.add(parameterNames.nextElement().toString());
        }
        testService.oneMoreTimeCall(dbNames);
        return "OK";
    }

    @RequestMapping("/")
    public String callable(){
        return "index";
    }

}
