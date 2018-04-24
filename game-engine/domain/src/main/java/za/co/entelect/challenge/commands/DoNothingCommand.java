package za.co.entelect.challenge.commands;

import za.co.entelect.challenge.game.contracts.command.Command;
import za.co.entelect.challenge.game.contracts.game.GamePlayer;
import za.co.entelect.challenge.game.contracts.map.GameMap;

public class DoNothingCommand implements Command {
    public DoNothingCommand() {

    }
    /**
     * Will not change anything on the current game map or game player
     */
    @Override
    public void performCommand(GameMap gameMap, GamePlayer gamePlayer) {
        return;
    }
}
