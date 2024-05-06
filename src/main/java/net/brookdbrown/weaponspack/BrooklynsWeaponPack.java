package net.brookdbrown.weaponspack;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BrooklynsWeaponPack implements ModInitializer
{

	public static final String MOD_ID = "brooklyns_weapon_pack";

    public static final Logger LOGGER = LoggerFactory.getLogger("brooklyns-weapon-pack");

	@Override
	public void onInitialize()
	{
		LOGGER.info("Hello Fabric world!");
	}
}