import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Clinton extends GameObject {

	//Does not need to be changed
	public static Image clinton;
	
	public static int ATTACK;
	//
	public Clinton(int x, int y, ID id, Handler handler, Image image,
			String filePath) {
		super(x, y, id, handler, image, filePath);
		clinton = this.IMAGE;
		
		//Her initial velocity downwards
		velY = 1;
		//The amount of damage she does
		ATTACK = 25;
	}

	@Override
	public void tick() {
		//Makes her move
		x += velX;
		y += velY;
		//Increments her velocity every tick to make her fall faster
		velY++;
		collision();
	}

	@Override
	public void collision() {
		/*When the y value of clinton reaches the bottom of the screen,
		  the velocity is set to 1, the y is set to 0, the x is set
		  to trump's x, and the score is increased
		*/
		if (y > Game.HEIGHT) {
			velY = 1;
			y = 0;
			x = handler.object.get(0).getX();
			HUD.SCORE++;
		}

	}

	//does not need to be changed
	@Override
	public void render(Graphics g) {
		g.setColor(Color.pink);
		g.drawImage(clinton, x, y, x + Sprites.CLINTONGAMEDIMENSIONS[0], y + Sprites.CLINTONGAMEDIMENSIONS[1], 0, 0, Sprites.CLINTONIMAGEDIMENSIONS[0], Sprites.CLINTONIMAGEDIMENSIONS[1], null);

	}

	//does not need to be changed
	@Override
	public Rectangle getBounds() {
		return new Rectangle(x, y, Sprites.CLINTONGAMEDIMENSIONS[0], Sprites.CLINTONGAMEDIMENSIONS[1]);
	}

}
