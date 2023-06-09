package at.campus02.swd.game.input;

import at.campus02.swd.game.gameobjects.GameObject;
import at.campus02.swd.game.gameobjects.PlayerBoy;

public class MoveDownCommand implements Command{
    public void execute(GameObject gameObject) {
        gameObject.moveDown();
    }
}
