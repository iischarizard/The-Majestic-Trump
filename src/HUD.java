import java.awt.Color;
import java.awt.Graphics;

public class HUD {
	public static int SCORE = 0;
	public static int HEALTH = 100;

	public void tick() {
		HEALTH = Game.clamp(HEALTH, 0, 100);
	}

	public void render(Graphics g) {
		// HP Bar
		g.setColor(Color.gray);
		g.fillRect(100, Game.HEIGHT - 90, 200, 32);
		if (HEALTH >= 0) {
			g.setColor(Color.green);
			g.fillRect(100, Game.HEIGHT - 90, HEALTH * 2, 32);
			g.setColor(Color.black);
			g.drawString("Hair:" + HUD.HEALTH + "/100", 165, Game.HEIGHT - 69);
		}
		g.drawRect(100, Game.HEIGHT - 90, 200, 32);
		// Score
		g.setColor(Color.white);
		g.drawString("Votes: " + SCORE, 200, 60);
	}
}
