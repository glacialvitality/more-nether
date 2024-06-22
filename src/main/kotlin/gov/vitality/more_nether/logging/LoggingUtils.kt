package gov.vitality.more_nether.logging

import gov.vitality.more_nether.MoreNether
import org.slf4j.LoggerFactory

enum class LoggingUtils(private val msg: String = "") {

    // These messages are hardcoded as they are printed to stdout
    BRDM_LOADED("Mod is initialized, but it is a Bundled Runtime Datapack Mod. This is intended.");

    fun getMessage(): String {
        return msg
    }

    companion object {
        private const val LOGGER_NAME = MoreNether.MOD_ID_FULL
        private val log = LoggerFactory.getLogger(LOGGER_NAME)

        fun notifyConsoleOfBRDM() {
            log.info(BRDM_LOADED.getMessage())
        }

    }

}