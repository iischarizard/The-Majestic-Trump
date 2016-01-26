# The-Majestic-Trump
//Classes that have not been implemented yet:<br>
  Audio.java<br>
  Config.java<br>
  Sprites.java<br>
  <br>
  Comments have not been added yet to classes<br>
  <br>
  CLASSES AND THEIR USE<br>
  (classes are the files that contain the code)<br><br>
<b>Classes that do not need editing</b><br>
	Game.java <br>
   The class that starts and runs the game with a single thread<br>
   Does not need to be edited *unless you would like to change the title or have objects spawn at the beginning (refer to Coding Committee Classes)<br>
GameObject.java <br>
   The class that handles the objects of the game.<br>
   Does not need to be edited<br>
Handler.java<br>
   The class that handles calling the tick() and render() functions of game objects<br>
   Does not need to be edited<br>
Window.java<br>
   The class that handles creating the window and frame for the game to run in<br>
   Does not need to be edited<br><br>
<b>Art Committee Classes</b><br>
Resources folder<br>
   Put your images here<br>
  * YOU MUST GO TO THE SPRITES CLASS TO INPUT THE DIMENSIONS OF YOUR PICTURE<br>
    IF YOU DO NOT IT WILL NOT SCALE IN THE GAME<br>
    YOU CAN ALSO CUT OFF PART OF YOUR IMAGE BY NOT INPUTTING THE WHOLE DIMENSION,<br>
    ENABLING YOU TO DRAW OR USE A COMPLETE IMAGE AND NOT HAVE TO CUT IT YOURSELF <br>
Sprites.java<br>
   The class that handles the size and filepaths of the sprites<br>
   Change the filepaths and the dimensions of your images with this class<br>
*Code Committee Classes<br>
//Easy<br>
Trump.java<br>
  The main player class<br>
  Can change the player velocity<br>
  Can change where main enemy (Clinton) spawns after collision with player (Trump)<br>
  Can add new collisions if new objects are created<br>
Clinton.java<br>
  The main enemy class<br>
  Can change main enemy velocity<br>
  Can change where main enemy spawns after it goes off screen<br>
  Can change the main enemy damage<br>
  Can change how many points enemy gives<br>
//Medium<br>
Creating new objects:<br>
   Create a new class and have it extend GameObject  add all unimplemented methods<br>
   Use an already created object as an outline<br>
   Go to ID.java to add a new ID<br>
   To have it spawn at the beginning of the game use the handler.addObject(GameObject object) method in the Game class<br>
    (refer to the Game class comments on how to do this)<br>
   To have it spawn at a different time refer to the Spawn class<br>
Spawn.java
   Refer to comments on the example spawn system
//Slightly More Difficult
KeyInput.java
   Can change and add new key inputs to the game
   Refer to comments on how to implement this
HUD.java
  *Requires math
   Can change the posision of the score and HP Bar
   Can change the amount of health player has BUT IT HAS TO BE 
    PROPORTIONAL TO THE LENGTH OF THE BAR (the math part)
   Can add new things to the HUD with the use of static variables
*Audio Committee Classes
Audio.java
   Uh I haven't done audio in awhile but im pretty sure its gonna be easy for you guys to change the audio
   Go to the game object's (Trump/Clinton) collision method to change when the audio plays
*Lore Committee Classes
Config.java
   Pretty sure all this is gonna do when I make it is change the names of stuff which will be super easy
