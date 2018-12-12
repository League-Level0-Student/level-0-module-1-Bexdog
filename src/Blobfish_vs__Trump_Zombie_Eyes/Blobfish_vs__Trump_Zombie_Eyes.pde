void setup() {
  size(1300,500);
}
void draw(){
  PImage face = loadImage("1ymyh1.jpg");
image(face, 0, 0);
int bob = (int)random(256);
 int y = mouseY;
 int x = mouseX;
 int z = bob;
 fill(x,y,z);
  ellipse(300,200,50,50);
  ellipse(440,225,50,50);
  ellipse(910,125,50,50);
  fill(0,0,0);
  ellipse(300,200,15,15);
  ellipse(440,225,15,15);
  ellipse(910,125,15,15);
}