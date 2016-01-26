import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class GameObject {
	protected int x, y;
	protected ID id;
	protected int velX, velY;
	protected static Image IMAGE;
	protected String filePath;
	protected Handler handler;

	public GameObject(int x, int y, ID id, Handler handler, Image image,
			String filePath) {
		this.x = x;
		this.y = y;
		this.id = id;
		this.IMAGE = image;
		this.filePath = filePath;
		this.handler = handler;
		loadImage();
	}

	public abstract void tick();

	public abstract void collision();

	public abstract void render(Graphics g);

	public abstract Rectangle getBounds();

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setId(ID id) {
		this.id = id;
	}

	public ID getId() {
		return id;
	}

	public void setVelX(int velX) {
		this.velX = velX;
	}

	public void setVelY(int velY) {
		this.velY = velY;
	}

	public int getVelY() {
		return velY;
	}

	public int getVelX() {
		return velX;
	}

	public void loadImage() {
		BufferedImage img = null;

		try {
			img = ImageIO.read(Game.class.getResourceAsStream(filePath));
		} catch (IOException e) {
			e.printStackTrace();
		}

		IMAGE = img;
	}

}
