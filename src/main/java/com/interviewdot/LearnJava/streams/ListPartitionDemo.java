package com.interviewdot.LearnJava.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListPartitionDemo {
    public static void main(String[] args) {
        List<Product> products = prepareProducts();

        Predicate<Product> isProductMoreThan10000 = product ->
                product.getPrice() > 10000;

        Map<Boolean, List<Product>> productsByPrice = products.stream()
                .collect(Collectors.partitioningBy(
                        isProductMoreThan10000
                        )
                );

        productsByPrice
                .entrySet()
                .forEach(System.out::println);
    }

    private static List<Product> prepareProducts() {
        return List.of(
                new Product("Head Phone", 5300),
                new Product("Video Game", 10300),
                new Product("JBL", 6300),
                new Product("LED TV", 30600),
                new Product("MacBook M1", 98600)
        );
    }
}
