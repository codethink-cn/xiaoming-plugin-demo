package cn.codethink.xiaoming.demo.test;

import cn.codethink.xiaoming.demo.DemoPlugin;
import cn.codethink.xiaoming.platform.debug.MiraiImplementPlatformDebug;

public class PluginDebug {
    public static void main(String[] args){
        
        MiraiImplementPlatformDebug
            .of(1420431708, "lclbmiloveyou!")
            .plugin(DemoPlugin.getInstance())
            .start();
    }
}
