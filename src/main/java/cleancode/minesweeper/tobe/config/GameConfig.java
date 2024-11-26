package cleancode.minesweeper.tobe.config;

import cleancode.minesweeper.tobe.GameLevel.GameLevel;
import cleancode.minesweeper.tobe.io.InputHandler;
import cleancode.minesweeper.tobe.io.OutputHandler;

public class GameConfig {
    private final GameLevel gameLevel;
    private final InputHandler inputHandler;
    private final OutputHandler outputHandler;

    private GameConfig(GameLevel gameLevel, InputHandler inputHandler, OutputHandler outputHandler) {
        this.gameLevel = gameLevel;
        this.inputHandler = inputHandler;
        this.outputHandler = outputHandler;
    }

    public static GameConfig of (GameLevel gameLevel, InputHandler inputHandler, OutputHandler outputHandler){
        return new GameConfig(gameLevel, inputHandler, outputHandler);
    }

    public GameLevel getGameLevel() {
        return gameLevel;
    }

    public InputHandler getInputHandler() {
        return inputHandler;
    }

    public OutputHandler getOutputHandler() {
        return outputHandler;
    }
}
