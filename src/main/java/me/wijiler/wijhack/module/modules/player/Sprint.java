package me.wijiler.wijhack.module.modules.player;

import me.wijiler.wijhack.module.Category;
import me.wijiler.wijhack.module.Module;
import org.lwjgl.input.Keyboard;


public class Sprint extends Module {
    public Sprint() {
        super("Sprint", "togglesprint but in a hacked client O_o", Category.PLAYER);
        this.setKey(Keyboard.KEY_C);
    }

        @Override
    public void onEnable() {
        if(mc.player.moveForward > 0 || mc.player.moveStrafing > 0) {
            mc.player.setSprinting(true); // will work on more later I know it don't work rn
        }

        }

    @Override
    public void onDisable() {
        mc.player.setSprinting(false);
    }



}
