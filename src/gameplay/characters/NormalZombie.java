package gameplay.characters;

import java.awt.Point;
import java.util.Vector;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import pathfinderlib.basics.Matrix;
import pathfinderlib.basics.Moves;
import states.Jeu;

public class NormalZombie extends Ennemies{
	private static final long serialVersionUID = 1480552482164050522L;
	/*protected Image normalZombie;
	protected int Tab[] = {0,32,64,96,128,160,192,224,256,288,320,352,384,416,448,480,512,544,576,608,640,672,704,736,768};
	private int x = Tab[(int)Math.random()*Tab.length];
	private int y = Tab[(int)Math.random()*Tab.length];
	private int HP;
	
	private int damage;
	
	private int HPmax = 100;
	private int shield= 0;
	private int speed = 5;
	private String sprite = "pictures/BigZombie.png";// ressource en attente du zombie normal
	private Point depart = new Point(x,y);
	private Vector<Moves> pathfind = calculatePathToHouse(depart);
	private */

	public NormalZombie(StateBasedGame jeu) {
		super((int)(Math.random()*24), (int)(Math.random()*24), 50, 0, 2, "zombie3", jeu);
	}/*
	public  void load() throws SlickException{
		normalZombie = new Image(sprite);
	}
	public void display(Graphics g) {
		normalZombie.draw(x,y);
	}
	
	@Override
	public void update(int delta) {
		switch (pathfind.get(0)) {
			case Down:
				y -= 32;
				break;
			case Up:
				y += 32;
				break;
			case Left:
				x -= 32;
				break;
			case Right:
				x += 32;
				break;
	}
	pathfind.remove(pathfind.get(0));
		
	}
	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHPmax() {
		return HPmax;
	}

	public void setHPmax(int hPmax) {
		HPmax = hPmax;
	}

	public int getShield() {
		return shield;
	}

	public void setShield(int shield) {
		this.shield = shield;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}*/
	

}
