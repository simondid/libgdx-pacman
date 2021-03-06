package entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;


public class PacMan extends MoveableEntity {

	public PacMan(Vector2 position, float width, float height, float rotation,
			float SPEED) {
		super(SPEED, rotation, width, height, position);
	}

	public void update() {
		Vector2 temp;
		temp = velocity;
		position.add(temp.mul(Gdx.graphics.getDeltaTime() * SPEED));
	//		position.add(velocity.tmp().mul(Gdx.graphics.getDeltaTime() * SPEED));

		if (temp.x != 0 || temp.y != 0)
			rotation = velocity.angle() - 90;
		
		bounds.x = position.x;
		bounds.y = position.y;
	}
}
