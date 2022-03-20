package cn.codethink.xiaoming.demo;

import cn.codethink.common.util.Preconditions;
import cn.codethink.xiaoming.platform.Platform;
import cn.codethink.xiaoming.platform.plugin.ObjectPluginHandler;
import cn.codethink.xiaoming.platform.plugin.ObjectPluginMetadata;
import cn.codethink.xiaoming.platform.plugin.Plugin;
import cn.codethink.xiaoming.platform.plugin.PluginHandler;

/**
 * 示例插件启动器
 *
 * @author Chuanwise
 */
public class ObjectDemoPluginLauncher {
    
    @SuppressWarnings("all")
    public static void main(String[] args) {
        // your other codes
        
        // construct plugin object
        final Plugin plugin = new ObjectDemoPlugin();
        
        final ObjectPluginMetadata metadata = ObjectPluginMetadata.builder(plugin)
            .name("object-demo")
            .group("cn.codethink")
            .build();
        
        // get platform object from somewhere
        final Platform platform = null;
        Preconditions.stateNonNull(platform, "platform not found");
        
        // construct plugin handler
        final PluginHandler pluginHandler = new ObjectPluginHandler(platform, metadata);
        
        // add to plugin manager
        platform.getPluginManager().addPluginHandler(pluginHandler);
        
        // load and enable plugin
        if (pluginHandler.loadPlugin() && pluginHandler.enablePlugin()) {
            System.out.println("load and enable successfully!");
        }
        
        // your other codes
    }
}
