package day06;

public class C05ShapeParent {
  public static void main(String[] args) {
    TShape rec = new TRectangle();
    TShape cir = new TCircle();
    TShape tri = new TTriangle();

    System.out.println(rec.getId());

    System.out.println(cir.getId());
    System.out.println(tri.getId());

    rec.draw();
    cir.draw();
    tri.draw();
  }
}

class TShape {
  private int posX;
  private int posY;
  private int width;
  private int height;
  private String color;
  private int id;

  private static int count = 0;

  TShape() {
    count++;
    this.id = count;
    this.color = "black";
  }

  TShape(int posX, int posY, int width, int height, String color) {
    this();
    this.posX = posX;
    this.posY = posY;
    this.width = width;
    this.height = height;
    this.color = color;
  }

  @Override
  public String toString() {
    return String.format("shape id[%d] pos(%d, %d) size(%d, %d) %s", id, posX, posY, width, height, color);
  }

  public void move(int offsetX, int offsetY) {
    this.posX += offsetX;
    this.posY += offsetY;
  }

  public void resize(int offsetW, int offsetH) {
    this.width += offsetW;
    this.height += offsetH;
  }

  public void color(String color) {
    this.color = color;
  }

  public int calcArea() {
    return width * height;
  }

  public void draw() {
    System.out.println("도형 그리기 : " + this.toString());
  }

  public int getId() {
    return id;
  }

  public String getColor() {
    return color;
  }

  public int[] getPosition() {
    return new int[] { posX, posY };
  }

  public int[] getSize() {
    return new int[] { width, height };
  }

}

class TRectangle extends TShape {

  @Override
  public void draw() {
    System.out.println("■■■■■■■■■■■");
    System.out.println("■         ■");
    System.out.println("■         ■");
    System.out.println("■         ■");
    System.out.println("■         ■");
    System.out.println("■■■■■■■■■■■");
  }

}

class TTriangle extends TShape {

  @Override
  public void draw() {
    super.draw();
    System.out.println("    #    ");
    System.out.println("   ###   ");
    System.out.println("  #####  ");
    System.out.println(" ####### ");
    System.out.println("#########");
  }

}

class TCircle extends TShape {

  @Override
  public void draw() {
    super.draw();
    System.out.println("   @@@@  ");
    System.out.println(" @      @ ");
    System.out.println("@        @");
    System.out.println("@        @");
    System.out.println(" @      @ ");
    System.out.println("   @@@@    ");
  }
}
