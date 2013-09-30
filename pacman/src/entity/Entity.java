package entity;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public abstract class Entity {
	protected Vector2 position;
	protected float width;
	protected float height;
	protected Rectangle bounds;
	public enum State {
		up,
		Down,
		Left,
		Right,
		Non
	}

	State state,lastState;
	
	public Entity(Vector2 position, float width, float height){
		this.position = position;
		this.width = width;
		this.height = height;
		bounds = new Rectangle(position.x, position.y, width, height);
		
		state = State.Non;
		
	}
	
	/**
	 * @return the position
	 */
	public Vector2 getPosition() {
		return position;
	}

	public State getState() {
		return state;
	}
	public void setState(State s) {
		this.state = s;
		this.lastState = this.state;
	}
	public void setStateUP() {
		this.state = state.up;
		this.lastState = this.state;
	}
	public void setStateDown() {
		this.state = state.Down;
		this.lastState = this.state;
	}
	public void setStateLeft() {
		this.state = state.Left;
		this.lastState = this.state;
	}
	public void setStateRight() {
		this.state = state.Right;
		this.lastState = this.state;
	}
	public void setStateNon(){
		this.state = state.Non;
		this.lastState = this.state;
	}
	public State getLastState(){
		return lastState;
	}

	
	/**
	 * @param position the position to set
	 */
	public void setPosition(Vector2 position) {
		this.position = position;
	}
	
	/**
	 * @return the width
	 */
	public float getWidth() {
		return width;
	}
	
	/**
	 * @param width the width to set
	 */
	public void setWidth(float width) {
		this.width = width;
	}
	
	/**
	 * @return the height
	 */
	public float getHeight() {
		return height;
	}
	
	/**
	 * @param height the height to set
	 */
	public void setHeight(float height) {
		this.height = height;
	}
	
	/**
	 * @return the bounds
	 */
	public Rectangle getBounds() {
		return bounds;
	}
	
	/**
	 * @param bounds the bounds to set
	 */
	public void setBounds(Rectangle bounds) {
		this.bounds = bounds;
	}
}
