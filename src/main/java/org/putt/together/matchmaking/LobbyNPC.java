package org.putt.together.matchmaking;

import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class LobbyNPC implements Listener {
	
	public static Entity npc; 
	
	@EventHandler
	public void interactEvent(PlayerInteractEntityEvent event) {
		if(event.getRightClicked() != npc) return;
		
		System.out.println("interacted with NPC");
			
		//Open GUI here
	}

}
