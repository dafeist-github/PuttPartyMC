package org.putt.together;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.plugin.java.JavaPlugin;
import org.putt.together.matchmaking.LobbyNPC;

public class PuttTogether extends JavaPlugin {
	
	public static PuttTogether plugin;
	
	@Override
	public void onEnable() {
		plugin = this;
		Bukkit.getPluginManager().registerEvents(new LobbyNPC(), plugin);
		
		World world = Bukkit.getWorld("world");
		LobbyNPC.npc = world.spawnEntity(new Location(world, 0, -60, 6), EntityType.VILLAGER);
		//LobbyNPC.npc.setInvulnerable(true);
		//LobbyNPC.npc.setPersistent(false);
		//((Villager) LobbyNPC.npc).setAI(false);
	}
	
	public static PuttTogether getPlugin() {
		return plugin;
	}

}
