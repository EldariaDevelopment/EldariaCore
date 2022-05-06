package me.Almond.eldariacore.EldariaCore

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;


public final class ZombieListener implements Listener {
  @EventHandler
  public static void EntitySpawnListener(OnEntitySpawnEvent Event) {
    String Toggle = "Enabled";
    switch (Toggle) {
      case "Enabled":
        System.out.println("Enabled");
        break;
      case "Disabled":
        System.out.println("Disabled");
        break;
      default:
        System.out.println("Exception");
    }    
  }
}
