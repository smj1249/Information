package CH35.unit;

public abstract class Unit {

	int hp;
	int amor;
	String type;
	
	abstract void move();
	abstract void underAttact(int damage);

}
