package me.wijiler.wijhack.module.modules.player;

import me.wijiler.wijhack.module.Category;
import me.wijiler.wijhack.module.Module;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;



public class Fly extends Module {
    public Fly() {
        super("Fly", "Lets u fly like superman", Category.PLAYER);
        this.setKey(Keyboard.KEY_N);
    }



    @Override
    public void onEnable() {



        mc.player.capabilities.isFlying = true;
        mc.player.capabilities.allowFlying = true;
    }

    @Override
    public void onDisable() {



        mc.player.capabilities.isFlying = false;
        mc.player.capabilities.allowFlying = false;
    }

}
