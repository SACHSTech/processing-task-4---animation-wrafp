import processing.core.PApplet;

public class Sketch extends PApplet {
  // Initializing global variables
  public int intSizeX = 500;
  public int intSizeY = 500;
  public int intCounter = 0;
  public int intX = 50;
  public int intY = 150;
  public int intSpeedX = intSizeX / 500;
  public int intSpeedY = intSizeY / 500; 
  public int intRed = 38;
  public int intGreen = 166;
  public int intBlue = 235;

  public void settings() {
    size(intSizeX, intSizeY);
  }

  public void setup() {
    // Checks for the time and syncs it with an appropriate background
    background(intRed, intGreen, intBlue);
  }

  public void draw() {
    // Changes background during the duration of the program 
    background(intRed, intGreen, intBlue);
    if (intCounter <= 100) {
      intRed += 0.39;
      intGreen -= 1.39;
      intBlue -= 1;
    }
    else if (intCounter > 100 && intCounter <= 200) {
      intRed -= 0.27;
      intGreen -= 0.02;
      intBlue -= 0.75;
    }
    else {
      intRed -= 0.12;
      intGreen += 1.41;
      intBlue += 1.75;
    }

    // Draws Buildings (Back Layer)
    strokeWeight(3);
    stroke(45);
    fill(60);
    rect(0, intSizeX / 4.17f, intSizeX / 5.88f, intSizeY / 1.67f);
    rect(intSizeX / 5.88f, intSizeY / 3.23f, intSizeX / 6.25f, intSizeY / 1.67f);
    rect(intSizeX / 3.03f, intSizeY / 3.57f, intSizeX / 6.25f, intSizeY / 1.67f);
    rect(intSizeX / 1.61f, intSizeY / 2.94f, intSizeX / 7.14f, intSizeY / 1.67f);
    rect(intSizeX / 2.27f, intSizeY / 2.63f, intSizeX / 5, intSizeY / 1.67f);
    rect(intSizeX / 1.39f, intSizeY / 3.7f, intSizeX / 6.25f, intSizeY / 1.67f);
    rect(intSizeX / 1.16f, intSizeY / 4, intSizeX / 6.25f, intSizeY / 1.67f);
    
    // Draws Buildings (Front Layer)
    stroke(50);
    fill(70);
    rect(0, intSizeY / 2.38f, intSizeX / 6.25f, intSizeY / 1.67f);
    stroke(48);
    fill(65);
    rect(intSizeX / 7.69f, intSizeY / 2.78f, intSizeX / 4.76f, intSizeY / 1.4f);
    rect(intSizeX / 2, intSizeY / 2.13f, intSizeX / 5.88f, intSizeY / 1.67f);
    stroke(50);
    fill(70);
    rect(width * 0.32f, height * 0.6f, 140, intSizeY / 1.4f);
    triangle(intSizeX / 3.16f, intSizeY / 1.67f, intSizeX / 2.17f, intSizeY / 2, intSizeX / 1.66f, intSizeY / 1.67f);
    rect(intSizeX / 1.56f, intSizeY / 1.96f, intSizeX / 5, intSizeY / 1.67f);
    rect(intSizeX / 1.3f, intSizeY / 2.33f, intSizeX / 6.25f, intSizeY / 1.67f);
    rect(intSizeX / 1.14f, intSizeY / 1.75f, intSizeX / 6.25f, intSizeY / 1.67f);

    // This resets the program so the bg and the sun revert to its original appearance
    intCounter += 0.016666667;

    if (intCounter >= 30) {
      intCounter = 0;
    }

    if (intX < 0 || intX > width) {
      intSpeedX = intSpeedX * -1;
    }
    else if (intY < 0 || intY > width) {
      intSpeedY = intSpeedY * -1;
    }

    // Updates the x and y coordinates of the sun
    intX += intSpeedX;
    intY += intSpeedY;
    stroke(222, 208, 80);
    fill(222, 208, 80);
    ellipse(intX, intY, width / 10, width / 10);
  }
}
