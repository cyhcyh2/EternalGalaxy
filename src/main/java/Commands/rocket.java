package Commands;

import me.cyh2.eternalgalaxy.EternalGalaxy;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class rocket implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player p = (Player) commandSender;
            p.openInventory(EternalGalaxy.SpaceGui);
            return true;
        }
        return false;
    }
}
