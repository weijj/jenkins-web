package com.alicp.web.jenkinsweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yipeng.wjj
 * @date 2018-04-04
 */
@RestController
public class MockController {
    @RequestMapping("/mock")
    public String mock() {
        return "Mock JenkinsX!";
    }
}
