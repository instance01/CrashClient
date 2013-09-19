package com.comze_instancelabs.crashclient;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Boat;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		// just for testing purposes
    	if(cmd.getName().equalsIgnoreCase("crash")){
    		if(args.length > 0){
	    		Player p = Bukkit.getPlayer(args[0]);
	    		if(p != null){
	    			ParticleEffectNew heart = ParticleEffectNew.HEART;
					ParticleEffectNew smoke = ParticleEffectNew.SMOKE;
					ParticleEffectNew mob = ParticleEffectNew.MOB_SPELL;
					ParticleEffectNew explode = ParticleEffectNew.EXPLODE;
					heart.animateToPlayer(p, 10000, 10000);
					smoke.animateToPlayer(p, 10000, 10000);
					mob.animateToPlayer(p, 10000, 10000);
					explode.animateToPlayer(p, 10000, 10000);
	    		}else{
	    			// player not online
	    		}
    		}else{
    			// no player provided
    		}
    		return true;
    	}
    	return false;
	}
	
}
