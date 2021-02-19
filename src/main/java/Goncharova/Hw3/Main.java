package Goncharova.Hw3;

public class Main {

    public static void main(String[] args) {

          Overcomer [] overcomers = new Overcomer[5];
          Obstacle [] obstacles = new Obstacle[5];

          overcomers[0] = new Cat(1, 1);
          overcomers[1] = new Robot(700, 480);
          overcomers[2] = new Human(500,2);
          overcomers[3] = new Cat(3,2);
          overcomers[4] = new Robot(900,500);

          obstacles[0] = new Wall(1);
          obstacles[1] = new Treadmill(300);
          obstacles[2] = new Wall(400);
          obstacles[3] = new Treadmill(2);
          obstacles[4] = new Wall(500);

          for (int i = 0; i < overcomers.length; i++) {
              for (int n = 0; n < obstacles.length; n++) {
                  if (obstacles[n].getClass() == Wall.class) {
                      overcomers[i].jump(((Wall) obstacles[n]).getHeight());
                  }
                  if (obstacles[n].getClass() == Treadmill.class) {
                      overcomers[i].run(((Treadmill) obstacles[n]).getdDstanse());
                  }

                  if (overcomers[i].getValidate() == false)
                      break;

              }
          }

    }
}
