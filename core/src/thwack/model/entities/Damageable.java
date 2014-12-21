package thwack.model.entities;

public interface Damageable {
	
	public static enum DamageState {
		PHYSICAL,
		POISON,
		ON_FIRE,
		SLOWED,
		STUNNED,
		THWACKED, 
		OK
	}
	
	public void setHealth(int health);
	public void applyHit(int damage);
	public boolean isAlive();
	public int getHealth();
	public void increaseDamageStateTime(float deltaTime);
	public void setDamageStateTime(float deltaTime);
	public float getDamageStateTime();
}
