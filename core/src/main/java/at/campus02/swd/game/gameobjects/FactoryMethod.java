package at.campus02.swd.game.gameobjects;

public class FactoryMethod{
    public static GameObject createObject (String type) {
        if (type.equalsIgnoreCase("player")) {
            return new PlayerBoy();
        } else if (type.equalsIgnoreCase("tile")) {
            return new RandomTile();
        }
        return null;
    }
}
