package pratice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaApi {
public static void main(String[] args) {
	
List<Product> products=new ArrayList<Product>();
products.add(new Product("durga",23,10000.0,List.of("pro 1","pro 2")));
products.add(new Product("ganesh",25,30000.0,List.of("pro 3","pro 4")));
products.add(new Product("durga",33,70000.0,List.of("pro 5","pro 6")));
System.out.println("============forEach=============");
products.stream().forEach(emp->System.out.println(emp));
System.out.println("============map=============");
List<Product>products2=products.stream().map(emp->emp).collect(Collectors.toList());
System.out.println(products2);
System.out.println("============findfrist=============");
Product products3=products.stream().filter(emp->emp.getSalary()>10000.0).findFirst().orElse(null);
System.out.println(products3);
System.out.println("============flat=============");
String n= products.stream().map(Product::getPropjects).flatMap(strings->strings.stream()).collect(Collectors.joining(","));
System.out.println(n);
System.out.println("============shortCricut=============");
List<Product> products4= products.stream().skip(1).limit(2).collect(Collectors.toList());
System.out.println(products4);
System.out.println("============finite=============");
Stream.generate(Math::random).limit(1).forEach(System.out::println);
System.out.println("============sorted=============");
products.stream().sorted((o1,o2)->o1.getName().compareToIgnoreCase(o2.getName())).forEach(System.out::println);
System.out.println("============max or min=============");
Product product= products.stream().max(Comparator.comparing(Product::getSalary)).orElseThrow();
System.out.println(product);
}
}
