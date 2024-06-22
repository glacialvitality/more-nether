package gov.vitality.more_nether

import gov.vitality.more_nether.logging.LoggingUtils
import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object MoreNether : ModInitializer {
    const val MOD_ID_FULL = "more_nether"

	override fun onInitialize() {
		LoggingUtils.notifyConsoleOfBRDM()
	}
}