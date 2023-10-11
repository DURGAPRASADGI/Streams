package pratice;

import java.util.List;

public class Product {

private String name;
 private int age;
 private Double salary;
 public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Double getSalary() {
	return salary;
}
@Override
public String toString() {
	return "Product [name=" + name + ", age=" + age + ", salary=" + salary + ", Propjects=" + Propjects + "]";
}
public Product() {
	super();
}
public Product(String name, int age, Double salary, List<String> propjects) {
	super();
	this.name = name;
	this.age = age;
	this.salary = salary;
	Propjects = propjects;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
public List<String> getPropjects() {
	return Propjects;
}
public void setPropjects(List<String> propjects) {
	Propjects = propjects;
}
private List<String> Propjects;
}
