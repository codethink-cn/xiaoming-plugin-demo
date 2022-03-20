package cn.codethink.xiaoming.demo;

import cn.codethink.xiaoming.platform.plugin.JavaPlugin;

/**
 * 从对象中加载插件
 *
 * @author Chuanwise
 */
public class ObjectDemoPlugin
    extends JavaPlugin {
    
    @Override
    public void onLoad() {
        getLogger().info("hey!");
    }
}
