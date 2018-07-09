package com.chihu.beetldemo.test;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.ClasspathResourceLoader;
import org.beetl.core.resource.FileResourceLoader;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jiangxiaofeng
 * @create 2018-07-04 14:28
 * @description
 **/

public class TestFileResourceLoader {

    public static void main(String[] args) {
        ClasspathResourceLoader resourceLoader = new ClasspathResourceLoader("templates/");
        Configuration cfg = null;
        try {
            cfg = Configuration.defaultConfiguration();
        } catch (IOException e) {
            e.printStackTrace();
        }
        GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
        Map<String,Object> shared = new HashMap<String,Object>();
        shared.put("name", "迪丽热巴");
        gt.setSharedVars(shared);
        Template t = gt.getTemplate("/dir/hello.txt");
        String str = t.render();
        System.out.println(str);
    }
}
