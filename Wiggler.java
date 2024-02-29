class Wiggler
{
  private int myX, myY;
  Wiggler()
  {
    myX = myY = 150;
  }
  void wiggle()
  {
    myX+=(int)(Math.random()*5)-2;
  }
  
  int getmyX () {
    return myX;
  }
  
  int getmyY () {
    return myY;
  }
  
  void setmyX (int myX_) {
  myX = myX_;
  }
  
  void setmyY (int myY_) {
  myY = myY_;
  }
}
