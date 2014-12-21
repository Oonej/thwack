package thwack.model.entities;

public interface Updateable extends Timeable {
	
	void update(float deltaTime);
	boolean active();
	void setActive(boolean isActive);
}
