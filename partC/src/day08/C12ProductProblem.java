package day08;

import java.util.Arrays;

public class C12ProductProblem {
  public static void main(String[] args) {
    Product[] products = new Product[4];
    products[0] = new Product("LG 스탠바이", 450000.89);
    products[1] = new Product("USB 1TB", 42456.34);
    products[2] = new Product("갤럭시 플립", 12345.78);
    products[3] = new Product("아이폰 ", 42456.12);

    System.out.println(products[0].compareTo(products[1]));

    Arrays.sort(products); // compareTo 재정의가 정확해야 정렬이 됩니다.

    for (Product p : products) {
      System.out.println(p);
    }

    Double a = 123.45; // 래퍼 클래스 타입
    Double b = 234.56;

    System.out.println("Double 타입 실수 비교 : " + a.compareTo(b)); // -1
    System.out.println("Double 타입 실수 비교 : " + b.compareTo(a)); // 1

    double c = 123.45;
    double d = 234.56;
    System.out.println("double 타입 실수 비교 :  " + Double.compare(c, d)); // -1
    System.out.println("double 타입 실수 비교 :  " + Double.compare(d, c)); // 1

    // 얕은 복사 확인
    Company c1 = new Company("LG전자", "서울시 서초구");
    products[0].setCompany(c1);

    Product pclone = null;
    try {
      pclone = (Product) products[0].clone();
    } catch (CloneNotSupportedException e) {
      System.out.println("clone 예외!");
    }
    System.out.println("~~~~~ 얕은 복사 테스트 ~~~~~");
    System.out.println(products[0]);
    System.out.println(pclone);
    System.out.println(" \t 주소 참조값 확인");
    System.out.println(products[0].hashCode());
    System.out.println(pclone.hashCode());
    // products[0] 의 company 주소와 복제한 pclone 의 company 주소가 같은 얕은 복사

  }
}

class Company {
  private String name;
  private String address;

  Company(String name, String address) {
    this.name = name;
    this.address = address;
  }
}

class Product implements Comparable<Product>, Cloneable {
  private String name;
  private double price;

  // 얕은 복사를 확인하기 위한 객체 정의
  private Company company;

  public void setCompany(Company company) {
    this.company = company;
  }

  public Company getCompany() {
    return company;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  @Override
  public int compareTo(Product other) {
    // Product 객체 비교는 '가격'으로 한다.
    // return (int) (this.price - other.price); // 1안)
    return Double.compare(this.price, other.price); // 2안
    // return this.price.compareTo(other.price);
    // 3안) 단, private Double price; 로 변경해야 함
  }

  @Override
  public String toString() {
    return String.format("%s (%f)", name, price);
  }
}