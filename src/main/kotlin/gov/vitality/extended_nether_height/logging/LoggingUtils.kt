package gov.vitality.extended_nether_height.logging

import gov.vitality.extended_nether_height.Entrypoint
import org.slf4j.LoggerFactory

enum class LoggingUtils(private val msg: String = "") {

    // These messages are hardcoded as they are printed to stdout
    BRDM_LOADED("Mod is initialized, but it is a Bundled Runtime Datapack Mod. This is intended.");

    fun getMessage(): String {
        return msg
    }

    companion object {
        private const val LOGGER_NAME = Entrypoint.MOD_ID_FULL
        private val log = LoggerFactory.getLogger(LOGGER_NAME)

        fun notifyConsoleOfBRDM() {
            log.info(BRDM_LOADED.getMessage())
        }

    }

}