package ViewGame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.me.mygdxgame.PacmanMainClass;

public class WorldRender {
	WorldHandler worldhandler;
	
	//camera
	OrthographicCamera camera;
	
	private TiledMap map;
	private OrthogonalTiledMapRenderer render;
	
	
	
	public WorldRender(WorldHandler world) {
		// TODO Auto-generated constructor stub
		this.worldhandler = world;
		
		TmxMapLoader loader = new TmxMapLoader();
		map = loader.load("data/maps/PacMan.tmx");
		
		render = new OrthogonalTiledMapRenderer(map);
		
		camera = new OrthographicCamera(672,744);
		
		camera.position.set(372, 336, 0	);
		//camera.position.set(372, 336, 0	);

	//	camera.viewportHeight = 744;
	//	camera.viewportWidth = 672;
		camera.update();
	}


	public void render() {
		// TODO Auto-generated method stub
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		camera.position.set(0, 336, 0	);
		camera.update();
		render.setView(camera);
		render.render();
	}


	public void resize(int width, int height) {
		// TODO Auto-generated method stub


	}

}
