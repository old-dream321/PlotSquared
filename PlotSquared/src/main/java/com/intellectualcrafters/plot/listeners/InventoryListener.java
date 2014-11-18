package com.intellectualcrafters.plot.listeners;

import com.intellectualcrafters.plot.object.InfoInventory;
import com.intellectualcrafters.plot.util.PlayerFunctions;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.inventory.Inventory;

/**
 * Created 2014-11-18 for PlotSquared
 *
 * @author Citymonstret
 */
public class InventoryListener implements Listener {

    @EventHandler
    public void onInventoryAction(InventoryInteractEvent event) {
        if (event.getInventory().getHolder() instanceof InfoInventory) {
            event.setResult(Event.Result.DENY);
        }
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        final Inventory inventory = event.getInventory();
        final Player player = (Player) event.getWhoClicked();
        if (inventory.getHolder() instanceof InfoInventory) {
            // TODO: Do stuff
            switch (event.getSlot()) {
                case 3:
                case 4:
                case 5:
                case 6:
                    PlayerFunctions.sendMessage(player, "This is not implemented yet");
                    break;
                default:
                    break;
            }
        }
    }

}
