package me.wijiler.wijhack.module;

import me.wijiler.wijhack.Main;
import me.wijiler.wijhack.module.modules.combat.Reach;
import me.wijiler.wijhack.module.modules.player.Fly;
import me.wijiler.wijhack.module.modules.player.Sprint;

import java.util.ArrayList;
import java.util.List;

public class ModuleManager {
    public ArrayList<Module> modules;

    public ModuleManager() {
        (modules = new ArrayList<Module>()).clear();
        //client
        //combat
        this.modules.add(new Reach());
        //exploits
        //misc
        //player
        this.modules.add(new Sprint());
        this.modules.add(new Fly());
        //render
    }


        public void onUpdate() {
          modules.stream().filter(Module::isToggled).forEach(Module::onUpdate); //not static because modules is not static
        }

    public Module getModule(String name) {
        for(Module m : this.modules) {
            if(m.getName().equalsIgnoreCase(name)) {
                return m;
            }
        }
        return null;
    }

    public ArrayList<Module> getModuleList() {
        return this.modules;
    }

    public static List<Module> getModulesByCategory(Category c) {
        List<Module> modules = new ArrayList<Module>();

        for(Module m : Main.moduleManager.modules) {
                        if(m.getCategory() == c) {
                            modules.add(m);
                        }
        }
        return modules;
    }

}
