PImage face;
void setup() {
  size(800,600);
 

  face = loadImage("face.jpg");
  face.resize(800,600);
  
}


void draw() {
  background(face);
  println("x; "+mouseX+ " y; "+mouseY);
fill(255,255,255);
ellipse(325,130,150,90);
ellipse(450,132,150,90);


if(mouseY>92 &&mouseY<168&&mouseX>256&&mouseX<370){

fill(0,0,0);
ellipse(mouseX,mouseY,15,15);
ellipse(mouseX+100,mouseY,15,15);
}
}
