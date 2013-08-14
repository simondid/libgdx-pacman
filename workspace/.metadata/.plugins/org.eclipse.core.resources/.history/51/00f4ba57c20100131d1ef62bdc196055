package com.njzk2.goban;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class ZoomMoveKeyProcessor implements InputProcessor {
	private OrthographicCamera camera;

	public ZoomMoveKeyProcessor(OrthographicCamera camera) {
		super();
		this.camera = camera;
	}

	@Override
	public boolean keyDown(int keycode) {
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		switch (keycode) {
		case Keys.LEFT:
			camera.position.x = Math.max(camera.position.x - 1, 0);
			break;

		case Keys.RIGHT:
			camera.position.x = Math.min(camera.position.x + 1, 18);
			break;

		case Keys.UP:
			camera.position.y = Math.min(camera.position.y + 1, 18);
			break;

		case Keys.DOWN:
			camera.position.y = Math.max(camera.position.y - 1, 0);
			break;

		case Keys.PLUS:
			camera.zoom = Math.max(camera.zoom - 1, 1);
			break;
		case Keys.MINUS:
			camera.zoom = Math.min(camera.zoom + 1, 2);
			break;

		default:
			return false;
		}
		camera.update();
		return true;
	}

	@Override
	public boolean keyTyped(char character) {
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		return false;
	}

}
