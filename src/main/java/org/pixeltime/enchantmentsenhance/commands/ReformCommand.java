package org.pixeltime.enchantmentsenhance.commands;

import org.bukkit.entity.Player;
import org.pixeltime.enchantmentsenhance.events.blackspirit.Reform;
import org.pixeltime.enchantmentsenhance.manager.SettingsManager;

public class ReformCommand extends SubCommand {

    @Override
    public void onCommand(Player player, String[] args) {
        Reform newGUI = new Reform();
        newGUI.open(player);
    }


    @Override
    public String name() {
        return "reform";
    }


    @Override
    public String info() {
        return "\n&6/enhance reform &7- " + SettingsManager.lang.getString(
            "Help.form");
    }


    @Override
    public String[] aliases() {
        return new String[] { "reform", "rf", "gailiang", "gl" };
    }


    @Override
    public String getPermission() {
        return "Enchantmentsenhance.enhance";
    }

}
