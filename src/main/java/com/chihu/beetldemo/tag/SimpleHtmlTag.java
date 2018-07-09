package com.chihu.beetldemo.tag;

import org.beetl.core.Tag;

import java.io.IOException;
import java.util.Map;

/**
 * @author jiangxiaofeng
 * @create 2018-07-05 15:33
 * @description
 **/

public class SimpleHtmlTag extends Tag {
    @Override
    public void render() {
        String tagName = (String) this.args[0];
        Map<String,Object> attrs = (Map<String, Object>) args[1];
        String value = (String) attrs.get("attr");
        try {
            this.ctx.byteWriter.writeString(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
