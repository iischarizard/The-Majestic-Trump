import java.util.Random;

public class Spawn {
	
	private Handler handler;
	private HUD hud;

	private Random r = new Random();
	
	private boolean levelHandler[] = {true, true};
	
	public Spawn(Handler handler, HUD hud){
		this.handler = handler;
		this.hud = hud;
	}
	public void tick(){
		/*
		if(levelHandler[0]&&HUD.SCORE == 20){
			levelHandler[0]=false;
			handler.addObject(new Clinton(r.nextInt(Game.WIDTH), -150,   ID.Enemy, handler,Clinton.clinton, "C:\\Users\\Zachary's Pro Laptop\\Downloads\\2D-Game-Engine-master\\EZGameInAppletTest\\bin\\thing02.png"));
		}
		if(levelHandler[1]&&HUD.SCORE == 40){
			levelHandler[1]=false;
			levelHandler[0]=true;
			handler.addObject(new Clinton(r.nextInt(Game.WIDTH), -150,   ID.Enemy, handler,Clinton.clinton, "C:\\Users\\Zachary's Pro Laptop\\Downloads\\2D-Game-Engine-master\\EZGameInAppletTest\\bin\\thing02.png"));
		}
		if(levelHandler[0]&&HUD.SCORE == 60){
			levelHandler[0]=false;
			levelHandler[1]=true;
			handler.addObject(new Clinton(r.nextInt(Game.WIDTH), -150,   ID.Enemy, handler,Clinton.clinton, "C:\\Users\\Zachary's Pro Laptop\\Downloads\\2D-Game-Engine-master\\EZGameInAppletTest\\bin\\thing02.png"));
		}
		if(levelHandler[1]&&HUD.SCORE == 80){
			levelHandler[1]=false;
			levelHandler[0]=true;
			handler.addObject(new Clinton(r.nextInt(Game.WIDTH), -150,   ID.Enemy, handler,Clinton.clinton, "C:\\Users\\Zachary's Pro Laptop\\Downloads\\2D-Game-Engine-master\\EZGameInAppletTest\\bin\\thing02.png"));
		}
		if(levelHandler[0]&&HUD.SCORE == 100){
			levelHandler[0]=false;
			levelHandler[1]=true;
			handler.addObject(new Clinton(r.nextInt(Game.WIDTH), -150,   ID.Enemy, handler,Clinton.clinton, "C:\\Users\\Zachary's Pro Laptop\\Downloads\\2D-Game-Engine-master\\EZGameInAppletTest\\bin\\thing02.png"));
			handler.addObject(new Clinton(r.nextInt(Game.WIDTH), -150,   ID.Enemy, handler,Clinton.clinton, "C:\\Users\\Zachary's Pro Laptop\\Downloads\\2D-Game-Engine-master\\EZGameInAppletTest\\bin\\thing02.png"));
		}
		if(levelHandler[1]&&HUD.SCORE == 150){
			levelHandler[1]=false;
			levelHandler[0]=true;
			//for(int i = 0; i<25; i++){
			handler.addObject(new Clinton(r.nextInt(Game.WIDTH), -150,   ID.Enemy, handler,Clinton.clinton, "C:\\Users\\Zachary's Pro Laptop\\Downloads\\2D-Game-Engine-master\\EZGameInAppletTest\\bin\\thing02.png"));
			handler.addObject(new Clinton(r.nextInt(Game.WIDTH), -150,   ID.Enemy, handler,Clinton.clinton, "C:\\Users\\Zachary's Pro Laptop\\Downloads\\2D-Game-Engine-master\\EZGameInAppletTest\\bin\\thing02.png"));
			//}
		}
		if(HUD.HEALTH==0){
			levelHandler[0]=true;
			levelHandler[1]=true;
		}
		*/
	}
	
}

