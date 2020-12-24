int y=10; 
int score=0;
int randomNumber=(int)random(width);
void draw() {
  background(#FF0D0D);
  fill(#0DFF77);
  stroke(#0D12FF);
  ellipse(randomNumber, y, 50,50);
  y+=10;
  if (y>=500) {
     checkCatch(randomNumber);
    y=10;
randomNumber=(int)random(width);
  }
  checkCatch(randomNumber);
  rect(mouseX, 400, 100, 100);
fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);
}
void checkCatch(int x) {
  if (x > mouseX && x < mouseX+100)
    score++;
  else if (score > 0) 
    score--;
  println("Your score is now: " + score);
}


void setup() {
  size(500,500);
}
