package fringeoftoday;

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GImage;

public class MenuPane extends GraphicsPane {
	private MainApplication program; // you will use program to get access to
										// all of the GraphicsProgram calls
	public static final int BUTTON_WIDTH = 200;
	public static final int BUTTON_HEIGHT = 100;
	
	private GButton btnPlay;
	private GButton btnShop;
	private GButton btnExit;
	private GImage title;
	public MenuPane(MainApplication app) {
		super();
		program = app;
		
		//Title banner - maybe use GImage instead?
		title = new GImage("logo_transparent.png", (MainApplication.WINDOW_WIDTH - 600)/2, 30);
		title.setSize(600, 300);
		
		//Play button
		btnPlay = new GButton("Play", (MainApplication.WINDOW_WIDTH - BUTTON_WIDTH)/2, 400, BUTTON_WIDTH, BUTTON_HEIGHT);
		btnPlay.setFillColor(Color.BLUE);
		
		//Shop button
		btnShop = new GButton("Shop", (MainApplication.WINDOW_WIDTH - BUTTON_WIDTH)/2, 550, BUTTON_WIDTH, BUTTON_HEIGHT);
		btnShop.setFillColor(Color.RED);
		
		//Exit button
		btnExit = new GButton("Exit", (MainApplication.WINDOW_WIDTH - BUTTON_WIDTH)/2, 700, BUTTON_WIDTH, BUTTON_HEIGHT);
		btnExit.setFillColor(Color.RED);
	}

	@Override
	public void showContents() {
		program.add(title);
		program.add(btnPlay);
		program.add(btnShop);
		program.add(btnExit);
	}

	@Override
	public void hideContents() {
		program.remove(title);
		program.remove(btnPlay);
		program.remove(btnShop);
		program.remove(btnExit);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		GObject obj = program.getElementAt(e.getX(), e.getY());
		if (obj == btnPlay) {
			//program.switchToGame();
		}
		else if (obj == btnShop) {
			program.switchToShop();
		}
		else {
			//close program
		}
	}
}
