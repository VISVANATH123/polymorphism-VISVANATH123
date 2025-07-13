package com.driver;

public class Main {

    // Task 1: Create a class Product inside Main class
    static class Product {

        // Task 3: Method with 2 int parameters
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Overloaded method with 3 int parameters
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Overloaded method with 2 double parameters
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {

        // Task 2: Create object of Product
        Product p = new Product();

        // Call each overloaded method
        System.out.println("Product of 2 int: " + p.product(2, 3));
        System.out.println("Product of 3 int: " + p.product(2, 3, 4));
        System.out.println("Product of 2 double: " + p.product(2.5, 3.5));
    }
}
