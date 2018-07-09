package com.chihu.beetldemo.test;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.StringTemplateResourceLoader;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jiangxiaofeng
 * @create 2018-07-04 13:55
 * @description
 **/

public class TestGroupTemplate {

    public static void main(String[] args) {
        StringTemplateResourceLoader resourceLoader = new StringTemplateResourceLoader();
        Configuration cfg = null;
        try {
            cfg = Configuration.defaultConfiguration();
        } catch (IOException e) {
            e.printStackTrace();
        }
        GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
        Map<String,Object> shared = new HashMap<String,Object>();
        shared.put("name", "beetl");
        gt.setSharedVars(shared);
        Template t = gt.getTemplate("hello,${name}");
        t.binding("name", "beetl");
        String str = t.render();
        System.out.println(str);
    }

}
