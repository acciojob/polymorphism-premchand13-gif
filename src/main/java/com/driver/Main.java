package com.driver;

public class Main {
    public static void main(String[] args) {
        Main.Product p = new Main.Product();
        double x = 10;
        double y = 20;
        System.out.println(p.product(10, 20));
        System.out.println(p.product(10, 20, 30));
        System.out.println(p.product(x, y));
    }
    public static class Product{
            public int product(int x, int y) {
                return x*y;
            }
            public int product(int x, int y, int z) {
                return x*y*z;
            }
            public double product(double x, double y) {
                return x*y;
            }
        }


}
