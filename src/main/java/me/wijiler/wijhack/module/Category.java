package me.wijiler.wijhack.module;

public enum Category {
    COMBAT("Combat"), EXPLOITS("Exploits"), MISC("Misc"), RENDER("Render"), PLAYER("Player"), CLIENT("Client");

    public String name;
    public int moduleIndex;

    Category(String name) {
        this.name = name;
    }
}
