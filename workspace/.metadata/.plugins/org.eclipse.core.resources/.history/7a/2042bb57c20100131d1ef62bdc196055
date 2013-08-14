package com.njzk2.goban;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.input.GestureDetector.GestureListener;
import com.badlogic.gdx.math.Vector2;

public class ZoomPanDetector implements GestureListener {
	private OrthographicCamera camera;

	public ZoomPanDetector(OrthographicCamera camera) {
		super();
		this.camera = camera;
	}

	@Override
	public boolean pan(float x, float y, float deltaX, float deltaY) {
		camera.translate(-deltaX * GDXGobanGame.unitScale * camera.zoom, -deltaY * GDXGobanGame.unitScale * camera.zoom);
		camera.update();
		return true;
	}

	@Override
	public boolean zoom(float initialDistance, float distance) {
		camera.zoom = camera.zoom * (distance / initialDistance);
		camera.update();
		return true;
	}

	@Override
	public boolean touchDown(float x, float y, int pointer, int button) {
		return false;
	}

	@Override
	public boolean tap(float x, float y, int count, int button) {
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
	public boolean pinch(Vector2 initialPointer1, Vector2 initialPointer2, Vector2 pointer1, Vector2 pointer2) {
		return false;
	}

}
