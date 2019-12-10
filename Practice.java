//question one
  public static int getRandom (int min, int max)
  {
    double range = (double) max - min + 1;
    return int (Math.random() * range + min);
  }
//question two
    class Widget
    {
      private int numWidgets;
      public widget()
      {
        numWidgets = 2;
      }
      public widget(numWidgets){
        this.numWidgets = numWidgets;
      }

      public int getWidgets(){
        return numWidgets;
      }
      public void setWidgets(numWidgets){
        this.numWidgets = numWidgets;
      }
    }
  //question three

  public static int getGCF(int num1, int num2)
  {
    int gcf = 1;
     int rem= 1;
    while (rem != 0)
    {
      int fract = num1 / num2;
      int rem = num1 % num2;
      if (rem == 0) {
        int gcf = num2;
      }
      else
      {
        num1 = num2;
        num2 = rem;
      }
    }
    return gcf;
  }
