package ViewGame;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

import entity.Entity.State;

public class InputProcessor implements com.badlogic.gdx.InputProcessor {

	private Vector3 touchPoint;
	WorldRender render;
	WorldHandler game;
	private OrthographicCamera camera;

	public InputProcessor(WorldHandler worldHandler) {
		// TODO Auto-generated constructor stub
		this.game = worldHandler;
		touchPoint = new Vector3();
		render = new WorldRender(game);
		camera = render.getCamera();

	}

	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		if (keycode == Input.Keys.ESCAPE) {
			Gdx.app.exit();
		}
		
	
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		if (keycode == Input.Keys.LEFT) {
			game.pacman.setStateLeft();
		}
		if (keycode == Input.Keys.RIGHT) {
		game.pacman.setStateRight();
		}
		if (keycode == Input.Keys.UP) {
		game.pacman.setStateUP();
		}
		if (keycode == Input.Keys.DOWN) {
			game.pacman.setStateDown();
		}
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
	
	
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		touchPoint.set(screenX, screenY, 0);
		// this modifies the vector
		camera.unproject(touchPoint);
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
