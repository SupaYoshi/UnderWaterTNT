package boardinggamer.underwatertnt;


import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;


public class UnderWaterTNT extends JavaPlugin implements Listener{
	
	String[] defaultlist = { "COBBLESTONE", "LAPIS_BLOCK" };

	
	@Override
	public void onEnable(){

		final FileConfiguration config = this.getConfig();
		config.addDefault("Radius", 3);
		config.addDefault("Cannon_Blocks", Arrays.asList(defaultlist));
		config.options().copyDefaults(true);
		saveConfig();

		getCommand("uwtradius").setExecutor(new CommandExecutor_Uwtradius(this));
		
		getServer().getPluginManager().registerEvents(this, this);

	}
	
	@Override
	public void onDisable(){}
	
	@EventHandler
	public void onEntityExplode(EntityExplodeEvent event){
		Entity entity = event.getEntity();
		if (entity instanceof TNTPrimed || entity instanceof Fireball || entity instanceof Creeper){
		if (getConfig().getList("Cannon_Blocks").contains(event.getLocation().subtract(0, 1, 0).getBlock().getType().toString())){
		} else {
			if (event.getLocation().getBlock().getTypeId() == 8
					|| event.getLocation().add(1, 0, 0).getBlock().getTypeId() == 8 
					|| event.getLocation().add(-1, 0, 0).getBlock().getTypeId() == 8
					|| event.getLocation().add(0, 0, 1).getBlock().getTypeId() == 8
					|| event.getLocation().add(0, 0, -1).getBlock().getTypeId() == 8
					|| event.getLocation().add(0, 1, 0).getBlock().getTypeId() == 8
					|| event.getLocation().add(0, -1, 0).getBlock().getTypeId() == 8){
				if (getConfig().getInt("Radius") != 0){
					if (event.getLocation().getBlock().isLiquid()){
					event.getLocation().getBlock().setType(Material.AIR);
					}
					if (event.getLocation().add(1, 0, 0).getBlock().isLiquid()){
					event.getLocation().add(1, 0, 0).getBlock().setType(Material.AIR);
					}
					if (event.getLocation().add(-1, 0, 0).getBlock().isLiquid()){
					event.getLocation().add(-1, 0, 0).getBlock().setType(Material.AIR);
					}
					if (event.getLocation().add(0, 0, 1).getBlock().isLiquid()){
					event.getLocation().add(0, 0, 1).getBlock().setType(Material.AIR);
					}
					if (event.getLocation().add(0, 0, -1).getBlock().isLiquid()){
					event.getLocation().add(0, 0, -1).getBlock().setType(Material.AIR);
					}
					if (event.getLocation().add(0, 1, 0).getBlock().isLiquid()){
					event.getLocation().add(0, 1, 0).getBlock().setType(Material.AIR);
					}
					if (event.getLocation().add(0, -1, 0).getBlock().isLiquid()){
					event.getLocation().add(0, -1, 0).getBlock().setType(Material.AIR);
					}
					Float f = Float.valueOf(getConfig().getInt("Radius"));
					entity.getWorld().createExplosion(event.getLocation(), f);
				}
			}
					 
			else if (event.getLocation().getBlock().getTypeId() == 9 
					|| event.getLocation().add(1, 0, 0).getBlock().getTypeId() == 9 
					|| event.getLocation().add(-1, 0, 0).getBlock().getTypeId() == 9
					|| event.getLocation().add(0, 0, 1).getBlock().getTypeId() == 9
					|| event.getLocation().add(0, 0, -1).getBlock().getTypeId() == 9
					|| event.getLocation().add(0, 1, 0).getBlock().getTypeId() == 9
					|| event.getLocation().add(0, -1, 0).getBlock().getTypeId() == 9){
				if (getConfig().getInt("Radius") != 0){
					if (event.getLocation().getBlock().isLiquid()){
						event.getLocation().getBlock().setType(Material.AIR);
						}
						if (event.getLocation().add(1, 0, 0).getBlock().isLiquid()){
						event.getLocation().add(1, 0, 0).getBlock().setType(Material.AIR);
						}
						if (event.getLocation().add(-1, 0, 0).getBlock().isLiquid()){
						event.getLocation().add(-1, 0, 0).getBlock().setType(Material.AIR);
						}
						if (event.getLocation().add(0, 0, 1).getBlock().isLiquid()){
						event.getLocation().add(0, 0, 1).getBlock().setType(Material.AIR);
						}
						if (event.getLocation().add(0, 0, -1).getBlock().isLiquid()){
						event.getLocation().add(0, 0, -1).getBlock().setType(Material.AIR);
						}
						if (event.getLocation().add(0, 1, 0).getBlock().isLiquid()){
						event.getLocation().add(0, 1, 0).getBlock().setType(Material.AIR);
						}
						if (event.getLocation().add(0, -1, 0).getBlock().isLiquid()){
						event.getLocation().add(0, -1, 0).getBlock().setType(Material.AIR);
						}
						Float f = Float.valueOf(getConfig().getInt("Radius"));
						entity.getWorld().createExplosion(event.getLocation(), f);
				}
			}
					 
			else if (event.getLocation().getBlock().getTypeId() == 9 
					|| event.getLocation().add(1, 0, 0).getBlock().getTypeId() == 10 
					|| event.getLocation().add(-1, 0, 0).getBlock().getTypeId() == 10
					|| event.getLocation().add(0, 0, 1).getBlock().getTypeId() == 10
					|| event.getLocation().add(0, 0, -1).getBlock().getTypeId() == 10
					|| event.getLocation().add(0, 1, 0).getBlock().getTypeId() == 10
					|| event.getLocation().add(0, -1, 0).getBlock().getTypeId() == 10){
				if (getConfig().getInt("Radius") != 0){
					if (event.getLocation().getBlock().isLiquid()){
						event.getLocation().getBlock().setType(Material.AIR);
						}
						if (event.getLocation().add(1, 0, 0).getBlock().isLiquid()){
						event.getLocation().add(1, 0, 0).getBlock().setType(Material.AIR);
						}
						if (event.getLocation().add(-1, 0, 0).getBlock().isLiquid()){
						event.getLocation().add(-1, 0, 0).getBlock().setType(Material.AIR);
						}
						if (event.getLocation().add(0, 0, 1).getBlock().isLiquid()){
						event.getLocation().add(0, 0, 1).getBlock().setType(Material.AIR);
						}
						if (event.getLocation().add(0, 0, -1).getBlock().isLiquid()){
						event.getLocation().add(0, 0, -1).getBlock().setType(Material.AIR);
						}
						if (event.getLocation().add(0, 1, 0).getBlock().isLiquid()){
						event.getLocation().add(0, 1, 0).getBlock().setType(Material.AIR);
						}
						if (event.getLocation().add(0, -1, 0).getBlock().isLiquid()){
						event.getLocation().add(0, -1, 0).getBlock().setType(Material.AIR);
						}
						Float f = Float.valueOf(getConfig().getInt("Radius"));
						entity.getWorld().createExplosion(event.getLocation(), f);
				}
			}
						 
			else if (entity.getLocation().getBlock().getTypeId() == 11 
					|| entity.getLocation().add(1, 0, 0).getBlock().getTypeId() == 11 
					|| entity.getLocation().add(-1, 0, 0).getBlock().getTypeId() == 11
					|| entity.getLocation().add(0, 0, 1).getBlock().getTypeId() == 11
					|| entity.getLocation().add(0, 0, -1).getBlock().getTypeId() == 11
					|| entity.getLocation().add(0, 1, 0).getBlock().getTypeId() == 11
					|| entity.getLocation().add(0, -1, 0).getBlock().getTypeId() == 11){
				
				if (getConfig().getInt("Radius") != 0){
					if (event.getLocation().getBlock().isLiquid()){
						event.getLocation().getBlock().setType(Material.AIR);
						}
						if (event.getLocation().add(1, 0, 0).getBlock().isLiquid()){
						event.getLocation().add(1, 0, 0).getBlock().setType(Material.AIR);
						}
						if (event.getLocation().add(-1, 0, 0).getBlock().isLiquid()){
						event.getLocation().add(-1, 0, 0).getBlock().setType(Material.AIR);
						}
						if (event.getLocation().add(0, 0, 1).getBlock().isLiquid()){
						event.getLocation().add(0, 0, 1).getBlock().setType(Material.AIR);
						}
						if (event.getLocation().add(0, 0, -1).getBlock().isLiquid()){
						event.getLocation().add(0, 0, -1).getBlock().setType(Material.AIR);
						}
						if (event.getLocation().add(0, 1, 0).getBlock().isLiquid()){
						event.getLocation().add(0, 1, 0).getBlock().setType(Material.AIR);
						}
						if (event.getLocation().add(0, -1, 0).getBlock().isLiquid()){
						event.getLocation().add(0, -1, 0).getBlock().setType(Material.AIR);
						}
						Float f = Float.valueOf(getConfig().getInt("Radius"));
						entity.getWorld().createExplosion(event.getLocation(), f);
				}
			}
		}
	}
	}
	
}
