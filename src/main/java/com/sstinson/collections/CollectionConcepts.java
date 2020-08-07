package com.sstinson.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionConcepts {

    public static void main(String[] args){

        Product door = new Product("Wooden door", 35);
        Product floorPanel = new Product("Floor panel", 25);
        Product window = new Product("Glass Window", 10);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);
        System.out.println(products);

        Iterator<Product> iterator = products.iterator();
        while(iterator.hasNext()){
            Product product = iterator.next();
            if(product.getWeight()>20){
                iterator.remove();
            }

        }
        for(Product product: products){
            System.out.println(product);
        }

        System.out.println(products.size());
        System.out.println(products.isEmpty());
        System.out.println(products.contains(window));
        System.out.println(products.remove(window));
        System.out.println(products.isEmpty());
        System.out.println(products.contains(window));


        Collection<Product> toRemove = new ArrayList<>();
        toRemove.add(door);
        toRemove.add(floorPanel);
        products.removeAll(toRemove);


    }
}
