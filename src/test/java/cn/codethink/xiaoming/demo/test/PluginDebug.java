package cn.codethink.xiaoming.demo.test;

import cn.codethink.xiaoming.demo.DemoPlugin;
import cn.codethink.xiaoming.platform.debug.MiraiImplementPlatformDebug;

public class PluginDebug {
    public static void main(String[] args){
        
        MiraiImplementPlatformDebug
            .of(你的QQ号码, "引号内的QQ密码")
            .plugin(DemoPlugin.getInstance())
            .start();
    }
}
