package game.interF;

public interface Dieable {
	//life, deadOrLive
	public void setLife(int life);
	public int  getLife();
	public void heal(int heal);
	public void attacked(int damage);
	public void dead();
}
