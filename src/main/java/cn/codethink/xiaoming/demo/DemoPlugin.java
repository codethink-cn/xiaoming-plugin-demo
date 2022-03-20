package cn.codethink.xiaoming.demo;

import cn.codethink.xiaoming.platform.plugin.JavaPlugin;

/**
 * 实例插件主类
 *
 * @author Chuanwise
 */
public class DemoPlugin
    extends JavaPlugin {
    
    /**
     * 全局唯一插件实例
     */
    private static final DemoPlugin INSTANCE = new DemoPlugin();
    
    /**
     * 插件实例访问器
     *
     * @return 插件实例
     */
    public static DemoPlugin getInstance() {
        
        return INSTANCE;
    }
    
    /**
     * 有了 INSTANCE，插件构造函数的参数可以根据需求设置
     * 不一定必须没有任何参数。
     */
    private DemoPlugin() {
        // initialization
    }
    
    @Override
    public void onLoad() throws Exception {
        
        getLogger().info("plugin loaded!");
    }
    
    @Override
    public void onEnable() throws Exception {
        
        getLogger().info("plugin enabled!");
    }
    
    @Override
    public void onDisable() throws Exception {
        
        getLogger().info("plugin disabled!");
    }
}
