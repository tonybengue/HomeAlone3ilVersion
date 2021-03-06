package main;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import states.Jeu;
import states.Pause;
import states.TitleScreen;

public class Launcher extends StateBasedGame {
	public static final int WIDTH = 800;
	public static final int HEIGHT = 800;

	public Launcher(String name) {
		super(name);
	}

	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
		addState(new TitleScreen());
		addState(new Jeu());
		addState(new Pause());
	}
	
	@Override
	public void enterState(int id) {
		// TODO Auto-generated method stub
		try {
			getState(id).init(getContainer(), this);
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.enterState(id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppGameContainer app;
		try {
			app = new AppGameContainer(new Launcher("Z'homebies"));
			app.setDisplayMode(Launcher.WIDTH, Launcher.HEIGHT, false);
			app.setShowFPS(false);
			app.setFullscreen(false);
			app.setIcon("ressources/pictures/icon.png");
			app.setMusicOn(true);
			app.setSoundOn(true);
			app.setMusicVolume((float) 0.8);
			app.setSoundVolume(1);
			app.setTargetFrameRate(60);
			app.start();
		} catch(SlickException e){
			e.printStackTrace();
		}
	}

}
