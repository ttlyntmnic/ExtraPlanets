package com.mjr.extraplanets.moons.Europa.event;

import micdoodle8.mods.galacticraft.api.event.oxygen.GCCoreOxygenSuffocationEvent;
import micdoodle8.mods.galacticraft.core.event.EventWakePlayer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.mjr.extraplanets.Config;

public class EuropaEvents {
	@SubscribeEvent
	public void GCCoreOxygenSuffocationEvent(GCCoreOxygenSuffocationEvent.Pre event){
		if (event.entityLiving.worldObj.provider.getDimensionId() == Config.europaID)
		{
			if(event.entity instanceof EntityPlayer) {
				event.setCanceled(false);
			}
			else{
				if(Config.mobSuffocation)
					event.setCanceled(false);
				else
					event.setCanceled(true);
			}
		}
	}

	@SubscribeEvent
	public void GCCoreEventWakePlayer(EventWakePlayer event){
		if (event.entityLiving.worldObj.provider.getDimensionId() == Config.europaID)
		{
			event.entityPlayer.heal(5.0F);

			for (WorldServer worldServer : MinecraftServer.getServer().worldServers)
			{
				worldServer.setWorldTime(0);
			}
		}
	}
}