
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

	private boolean pressedD = false, pressedS = false, pressedW = false,
			pressedA = false;
	private boolean pressedRight = false, pressedDown = false,
			pressedUp = false, pressedLeft = false;

	private Handler handler;

	private Game game;

	public KeyInput(Handler handler, Game game) {
		this.handler = handler;
		this.game = game;
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_SPACE) {
			if (!Game.ALIVE) {
				HUD.SCORE = 0;
				HUD.HEALTH = 100;
				Game.ALIVE = true;
			}
		}
		for (int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);

			if (tempObject.getId() == ID.Player) {
				// Player 1 Key Events

				if (key == KeyEvent.VK_W) {
					tempObject.setVelY(-Trump.SPEED);
					pressedW = true;
				}
				if (key == KeyEvent.VK_S) {
					tempObject.setVelY(Trump.SPEED);
					pressedS = true;
				}
				if (key == KeyEvent.VK_D) {
					tempObject.setVelX(Trump.SPEED);
					pressedD = true;
				}
				if (key == KeyEvent.VK_A) {
					tempObject.setVelX(-Trump.SPEED);
					pressedA = true;
				}
				if (key == KeyEvent.VK_UP) {
					tempObject.setVelY(-Trump.SPEED);
					pressedUp = true;
				}
				if (key == KeyEvent.VK_DOWN) {
					tempObject.setVelY(Trump.SPEED);
					pressedDown = true;
				}
				if (key == KeyEvent.VK_RIGHT) {
					tempObject.setVelX(Trump.SPEED);
					pressedRight = true;
				}
				if (key == KeyEvent.VK_LEFT) {
					tempObject.setVelX(-Trump.SPEED);
					pressedLeft = true;
				}

			}
		}
		if (key == KeyEvent.VK_ESCAPE)
			System.exit(1);
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		for (int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);

			if (tempObject.getId() == ID.Player) {
				// Player 1 Key Events

				if (key == KeyEvent.VK_W) {
					tempObject.setVelY(0);
					pressedW = false;
					if (pressedS)
						tempObject.setVelY(Trump.SPEED);
				}
				if (key == KeyEvent.VK_S) {
					tempObject.setVelY(0);
					pressedS = false;
					if (pressedW)
						tempObject.setVelY(-Trump.SPEED);
				}
				if (key == KeyEvent.VK_D) {
					tempObject.setVelX(0);
					pressedD = false;
					if (pressedA)
						tempObject.setVelX(-Trump.SPEED);
				}
				if (key == KeyEvent.VK_A) {
					tempObject.setVelX(0);
					pressedA = false;
					if (pressedD)
						tempObject.setVelX(Trump.SPEED);
				}
				if (key == KeyEvent.VK_UP) {
					tempObject.setVelY(0);
					pressedUp = false;
					if (pressedDown)
						tempObject.setVelY(Trump.SPEED);
				}
				if (key == KeyEvent.VK_DOWN) {
					tempObject.setVelY(0);
					pressedDown = false;
					if (pressedUp)
						tempObject.setVelY(-Trump.SPEED);
				}
				if (key == KeyEvent.VK_RIGHT) {
					tempObject.setVelX(0);
					pressedRight = false;
					if (pressedLeft)
						tempObject.setVelX(-Trump.SPEED);
				}
				if (key == KeyEvent.VK_LEFT) {
					tempObject.setVelX(0);
					pressedLeft = false;
					if (pressedRight)
						tempObject.setVelX(Trump.SPEED);
				}

			}
		}
	}

}
