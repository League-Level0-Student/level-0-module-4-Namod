PImage creeper;
void setup(){
  size(500,500);
PImage minecraft = loadImage("minecraft.png");     //in setup method
minecraft.resize(width, height);          //in setup method
background(minecraft);          //in setup methodPImage creeper;     //at the top of your program
creeper=loadImage("creeper.png");     //in setup method
  creeper.resize(20, 20);     //in setup method
}
void draw(){
 image(creeper, mouseX, mouseY);     //in draw method 
}
boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}
