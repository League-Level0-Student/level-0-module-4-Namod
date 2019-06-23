PImage donkey;
PImage tail;
void setup(){
 donkey = loadImage("donkey2.png");      //change the file name if you need to
tail = loadImage("tail2.png");      //change the file name if you need to
 size(225,225);     //replace width, height with your picture's dimensions
  background (donkey);
image(tail, mouseX, mouseY);
//tail.resize();     //replace width, height with your tail's dimensions
image(tail, mouseX-10, mouseY-20);
rect(0, 0, 30, 30);
dist(0, 0, mouseX, mouseY) < 30
import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch

Minim minim = new Minim(this);     //In the setup method
woohooSound = minim.loadSample("homer-woohoo.wav");     //In setup. Change the file name if you need to

// put these lines where you want the sound to play
if (playSound) {
     woohooSound.trigger();
 playSound = false;
}
textSize(24);
text("Message",100,20);
}
