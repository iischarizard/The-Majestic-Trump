import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Trump extends GameObject {
	//Does not need to be changed
	private Handler handler;

	public static Image trump;

	public static int SPEED;
	//
	public Trump(int x, int y, ID id, Handler handler, Image image,
			String filePath) {
		super(x, y, id, handler, image, filePath);
		this.handler = handler;
		trump = this.IMAGE;
		//Trump's speed
		SPEED = 5;
	}

	@Override
	public void tick() {
		//makes him move
		x += velX;
		y += velY;
		//makes him unable to go offscreen
		x = Game.clamp(x, 0, Game.WIDTH - 56);
		y = Game.clamp(y, 0, Game.HEIGHT - 79);
		collision();

	}

	@Override
	public void collision() {
		for (int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);
			//if the id of the collided object is an enemy...
			if (tempObject.getId() == ID.Enemy) {
				if (getBounds().intersects(tempObject.getBounds())) {
					//Trump's health is subtracted by clinton's attack value
					HUD.HEALTH -= Clinton.ATTACK;
					//Clinton's y is set to 0
					tempObject.setY(0);
					//Clinton's x is set to trump's x
					tempObject.setX(this.x);
					//Clinton's velocity is set to 0
					tempObject.setVelY(0);
				}
			}
		}
	}
	//Does not need to be changed
	@Override
	public void render(Graphics g) {
		g.setColor(Color.black);
		g.drawImage(trump, x, y, x + Sprites.TRUMPGAMEDIMENSION[0], y + Sprites.TRUMPGAMEDIMENSION[1], 0, 0, Sprites.TRUMPIMAGEDIMENSION[0], Sprites.TRUMPIMAGEDIMENSION[1], null);
	}
	//Does not need to be changed
	@Override
	public Rectangle getBounds() {
		return new Rectangle(x, y, Sprites.TRUMPGAMEDIMENSION[0], Sprites.TRUMPGAMEDIMENSION[1]);
	}
}
