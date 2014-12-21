package thwack.model.entities.worldobjects;

import thwack.model.entities.Entity;

public class Wall extends Entity {

	@Override
	public void dispose() {
		world.destroyBody(entityBody);
	}

}
