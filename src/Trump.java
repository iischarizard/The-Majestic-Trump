import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;

public class Trump extends GameObject {
	private Handler handler;

	public static Image trump;

	public static int SPEED;
	
	private Random r = new Random();

	public Trump(int x, int y, ID id, Handler handler, Image image,
			String filePath) {
		super(x, y, id, handler, image, filePath);
		this.handler = handler;
		trump = this.IMAGE;
		SPEED = 5;
	}

	@Override
	public void tick() {

		x += velX;
		y += velY;
		x = Game.clamp(x, 0, Game.WIDTH - 56);
		y = Game.clamp(y, 0, Game.HEIGHT - 79);
		collision();

	}

	@Override
	public void collision() {
		for (int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);
			if (tempObject.getId() == ID.Enemy) {
				if (getBounds().intersects(tempObject.getBounds())) {
					HUD.HEALTH -= Clinton.ATTACK;
					tempObject.setY(0);
					tempObject.setX(this.x);
					tempObject.setVelY(0);
				}
			}
		}
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.black);
		// g.fillRect(x, y, 50, 50);
		g.drawImage(trump, x, y, x + 75, y + 50, 0, 0, 356, 250, null);
	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return new Rectangle(x, y, 70, 49);
	}
}
