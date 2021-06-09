package me.wijiler.wijhack.module.modules.combat;

import me.wijiler.wijhack.module.Category;
import me.wijiler.wijhack.module.Module;
import org.lwjgl.input.Keyboard;

public class Reach extends Module{

    public Reach() {
        super("Reach", "Reach across the map", Category.COMBAT);
        this.setKey(Keyboard.KEY_R);
    }
}
