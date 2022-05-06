import org.bukkit.listener.event



public class Main {
  public static void ZombieListener(OnEntitySpawnEvent()) {
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
