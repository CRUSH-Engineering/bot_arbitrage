package co.codingnomads.bot.arbitrage.action.detection;

import co.codingnomads.bot.arbitrage.action.detection.selection.DetectionActionSelection;

/**
 * Created by Thomas Leruth on 12/18/17
 *
 * POJO class for the information needed to use the print method as acting behavior
 */

public class DetectionPrintAction extends DetectionActionSelection {

    // Ryan: seeing that this may need not exist due to DetectionAction.print()
    // however, for the arbitrage actions you have a class for each action and that convention is a bit broken
    // in this package - it appears that these two action types (arbitrage and detection) are being handled in
    // two slightly separate ways - ideally I think the conventions in the action.arbitrage and action.detection packages
    // should align as closely as possible

}