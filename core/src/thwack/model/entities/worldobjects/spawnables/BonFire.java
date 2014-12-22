package thwack.model.entities.worldobjects.spawnables;

import thwack.model.entities.Entity;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;

public class BonFire extends Spawnable{

	public BonFire(World world, Vector2 location)
	{
		BodyDef bonFireDef = new BodyDef();
		bonFireDef.type = BodyType.DynamicBody;
		bonFireDef.position.set(new Vector2(location));
		entityBody = world.createBody(bonFireDef);
		entityBody.setUserData(this);
		entityBody.setFixedRotation(true);

		PolygonShape bonFireShape = new PolygonShape();
		bonFireShape.setAsBox(.5f, .5f);

		FixtureDef bonFireFixtureDef = new FixtureDef();
		bonFireFixtureDef.density = .5f;
		bonFireFixtureDef.shape = bonFireShape;
		bonFireFixtureDef.isSensor = true;
		entityBody.createFixture(bonFireFixtureDef);
		bonFireFixtureDef.shape.dispose();
		
		setHealth(3);
	}
}
