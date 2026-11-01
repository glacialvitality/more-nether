package gov.vitality.extended_nether_height

import gov.vitality.extended_nether_height.logging.LoggingUtils
import net.fabricmc.api.ModInitializer

object Entrypoint : ModInitializer {
	const val MOD_ID_FULL = "extended_nether_height"

	override fun onInitialize() {
		LoggingUtils.notifyConsoleOfBRDM()
	}
}
