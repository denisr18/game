package at.campus02.swd.game.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.files.FileHandle;


public class PlayerBoy implements GameObject {
    private Texture image;
    private Sprite sprite;

    public PlayerBoy() {
        image = new Texture("dinghyLarge1.png"); //TODO PATH ANPASSEN!
        sprite = new Sprite(image);
    }
    @Override
    public void act(float delta) {

    }

    @Override
    public void setPosition(float x, float y) {
        sprite.setPosition(x+20, y+15);
    }  //TODO Hauptvariable für TileSize anlegen, falls es noch keine gibt, kein Hardcode wie bei mir

    @Override
    public void draw(SpriteBatch batch) {
        sprite.draw(batch);
    }
}
