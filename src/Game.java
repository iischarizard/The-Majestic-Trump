import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Game extends Canvas implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8921419424614180143L;

	public static final int WIDTH = 780, HEIGHT = WIDTH / 12 * 9;

	private Image bg;

	private Thread thread;
	private boolean running = false;
	private Handler handler;
	private HUD hud;
	private Spawn spawner;

	public static boolean ALIVE = false;

	public Game() {
		loadBG();
		handler = new Handler();
		hud = new HUD();
		spawner = new Spawn(handler, hud);
		this.addKeyListener(new KeyInput(handler, this));
		new Window(WIDTH, HEIGHT, "The Majestic Trump v0.01", this);
		handler.addObject(new Trump(WIDTH / 2, HEIGHT - 50, ID.Player, handler,
				Trump.trump,
				"resources/trump.jpg"));
		handler.addObject(new Clinton(WIDTH / 2, 0, ID.Enemy, handler,
				Clinton.clinton,
				"resources/clinton.jpg"));
	}

	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
		running = true;
	}

	public synchronized void stop() {
		try {
			thread.join();
			running = false;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void run() {
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		while (running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while (delta >= 1) {
				tick();
				delta--;
			}
			if (running)
				render();
			frames++;
			if (System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				System.out.println("FPS: " + frames);
				frames = 0;
			}
		}
		stop();
	}

	private void tick() {
		if (ALIVE) {
			hud.tick();
			handler.tick();
			spawner.tick();
		}
		if (HUD.HEALTH <= 0) {
			ALIVE = false;
		}
	}

	private void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}

		Graphics g = bs.getDrawGraphics();

		g.setColor(Color.white);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		g.drawImage(bg, 0, 0, WIDTH, HEIGHT, 0, 0, 614, 412, null);
		g.setColor(Color.pink);
		g.drawString("Created By Zachary Norman", 5, 20);

		hud.render(g);
		handler.render(g);
		if (!ALIVE) {
			g.setColor(Color.black);
			g.drawString("Press SPACE to start!", 90, 250);
		}
		g.dispose();
		bs.show();
	}

	public static int clamp(int var, int min, int max) {
		if (var >= max)
			return var = max;
		else if (var <= min)
			return var = min;
		else
			return var;
	}

	public void loadBG() {
		BufferedImage img = null;

		try {
			img = ImageIO.read(Game.class.getResourceAsStream("/resources/trumpxclinton.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		bg = img;
	}

	public static void main(String args[]) {
		new Game();
	}

}
