import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Clinton extends GameObject {

	public static Image clinton;
	
	public static int ATTACK;
	
	public Clinton(int x, int y, ID id, Handler handler, Image image,
			String filePath) {
		super(x, y, id, handler, image, filePath);
		clinton = this.IMAGE;
		velY = 1;
		ATTACK = 25;
	}

	@Override
	public void tick() {
		x += velX;
		y += velY;
		velY++;
		collision();
	}

	@Override
	public void collision() {
		if (y > Game.HEIGHT) {
			velY = 1;
			y = 0;
			x = handler.object.get(0).getX();
			HUD.SCORE++;
		}

	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.pink);
		g.drawImage(clinton, x, y, x + 100, y + 150, 0, 0, 2070, 2588, null);

	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return new Rectangle(x, y, 100, 100);
	}

}
