package thwack.model.entities.worldobjects.spawnables;

import thwack.model.entities.Damageable;
import thwack.model.entities.Movable;

public abstract class Spawnable extends Movable implements Damageable{

	@Override
	public void update(float deltaTime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean active() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setActive(boolean isActive) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStateTime(float stateTime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setHealth(int health) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applyHit(int damage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getHealth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void increaseDamageStateTime(float deltaTime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDamageStateTime(float deltaTime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getDamageStateTime() {
		// TODO Auto-generated method stub
		return 0;
	}

}
