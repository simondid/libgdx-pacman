package com.njzk2.goban;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.input.GestureDetector.GestureListener;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

public class PutStoneDetector implements GestureListener {
	GDXGobanGame game;
	Camera camera;

	public PutStoneDetector(GDXGobanGame game, Camera camera) {
		super();
		this.game = game;
		this.camera = camera;
	}

	@Override
	public boolean tap(float x, float y, int count, int button) {
		// where x and y are tap inputs
		Vector3 touchPoint = new Vector3(x, y, 0);
		camera.unproject(touchPoint);
		game.play((int) touchPoint.x, (int) touchPoint.y);
		return true;
	}

	@Override
	public boolean touchDown(float x, float y, int pointer, int button) {
		return false;
	}

	@Override
	public boolean longPress(float x, float y) {
		return false;
	}

	@Override
	public boolean fling(float velocityX, float velocityY, int button) {
		return false;
	}

	@Override
	public boolean pan(float x, float y, float deltaX, float deltaY) {
		return false;
	}

	@Override
	public boolean zoom(float initialDistance, float distance) {
		return false;
	}

	@Override
	public boolean pinch(Vector2 initialPointer1, Vector2 initialPointer2, Vector2 pointer1, Vector2 pointer2) {
		return false;
	}

}
