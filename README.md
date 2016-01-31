# The Majestic Trump

//Classes that have not been implemented yet:
  - *Sprites.java*
  - *Audio.java*
  - *Config.java*
  
  ***Comments have not been added to classes yet***
  
**Classes that do not need editing:**

*Game.java*

  - The class that starts and runs the game with a single thread
  - Does not need to be edited unless you would like to change the title or have objects spawn at the beginning (refer to Coding    Committee Classes)
  
*GameObject.java* 

  - The class that handles the objects of the game.
  - Does not need to be edited
  
*Handler.java*

  - The class that handles calling the tick() and render() functions of game objects
  - Does not need to be edited
  
*Window.java*

  - The class that handles creating the window and frame for the game to run in
  - Does not need to be edited

**Art Committee Classes**

//Resources folder

  - Put your images here
  - **YOU MUST GO TO THE SPRITES CLASS TO INPUT THE DIMENSIONS OF YOUR PICTURE
    IF YOU DO NOT IT WILL NOT SCALE IN THE GAME!!!
    YOU CAN ALSO CUT OFF PART OF YOUR IMAGE BY NOT INPUTTING THE WHOLE DIMENSION,
    ENABLING YOU TO DRAW OR USE A COMPLETE IMAGE AND NOT HAVE TO CUT IT YOURSELF**

*Sprites.java*

  - The class that handles the size and filepaths of the sprites
  - Change the filepaths and the dimensions of your images with this class
  
**Code Committee Classes**

//Easy

*Trump.java*

  - The main player class
  - Can change the player velocity
  - Can change where main enemy (Clinton) spawns after collision with player (Trump)
  - Can add new collisions if new objects are created
  
*Clinton.java*

  - The main enemy class
  - Can change main enemy velocity
  - Can change where main enemy spawns after it goes off screen
  - Can change the main enemy damage
  - Can change how many points enemy gives

//Medium

Creating new objects:

  - Create a new class and have it extend GameObject  add all unimplemented methods
  - Use an already created object as an outline
  - Go to *ID.java* to add a new ID
  - To have it spawn at the beginning of the game use the handler.addObject(GameObject object) method in the Game class
    (refer to the Game class comments on how to do this)
  - To have it spawn at a different time refer to the Spawn class

*Spawn.java*

  - Refer to comments on the example spawn system

//Slightly More Difficult

*KeyInput.java*

  - Can change and add new key inputs to the game
  - Refer to comments on how to implement this
  
*HUD.java*

  *Requires math
  
  - Can change the posision of the score and HP Bar
  - Can change the amount of health player has BUT IT HAS TO BE 
    PROPORTIONAL TO THE LENGTH OF THE BAR (the math part)
  - Can add new things to the HUD with the use of static variables
  
**Audio Committee Classes**

*Audio.java*

  - Uh I haven't done audio in awhile but im pretty sure its gonna be easy for you guys to change the audio
  - Go to the game object's (Trump/Clinton) collision method to change when the audio plays
  
**Lore Committee Classes**

*Config.java*

  - Pretty sure all this is gonna do when I make it is change the names of stuff which will be super easy
