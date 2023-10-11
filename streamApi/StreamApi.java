package streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
	static List<Employee> employees=new ArrayList<>();
	static {
		employees.add(new Employee("shabbir","Dawoodi",5000.0,List.of("project 1","project 2")));
		employees.add(new Employee("Nikhil","Gupta",6000.0,List.of("project 1","project 3")));
		employees.add(new Employee("sivam ","kumar",5500.0,List.of("project 3","project 4")));

	}
public static void main(String[] args) {
//	Stream.of(employees);
	//or
	//forEach->its terminal operator
	System.out.println("============forEach=========================");
	employees.stream().forEach((employee)->System.out.println(employee));
	
	//map
	System.out.println("============map=========================");
    List<Employee> incrementSal= employees.stream().map((employees)->new Employee(
			employees.getFristName(),
			employees.getLastName(),
			employees.getSalary()*1.10,
			employees.getProjects()
			)).collect(Collectors.toList());
	
	System.out.println(incrementSal);
	
	//filter
	System.out.println("============filter=========================");
   List<Employee> filterEmployee= employees.stream().filter(employee->employee.getSalary()>5000).map((employees)->new Employee(
			employees.getFristName(),
			employees.getLastName(),
			employees.getSalary()*1.10,
			employees.getProjects()
			)).collect(Collectors.toList());
	System.out.println(filterEmployee);
	
	//find first->its terminal operator
	System.out.println("============find first=========================");
    Employee firstEmployee=employees.stream().filter(employee->employee.getSalary()>5000).findFirst().orElse(null);
	System.out.println(firstEmployee);
	
	//flatmap->togetlistof String
	System.out.println("============flatMap=========================");

	String project=employees.stream().map(employee->employee.getProjects()).flatMap(Strngs->Strngs.stream()).collect(Collectors.joining(","));
	System.out.println(project);
	
	//short Circuit operations
	System.out.println("============shortCircuit opertions skip limit=========================");
    List<Employee> shortCirCuit=employees.stream().skip(1).limit(1).collect(Collectors.toList());
	System.out.println(shortCirCuit);
	
	//finite ->to convert infinate data to finite
	System.out.println("============finite=========================");
    Stream.generate(Math::random).limit(5).forEach(System.out::println);
	
	//sorted
	System.out.println("============sorted=========================");
   List<Employee> sorted=employees.stream().sorted((o1,o2)->o1.getFristName().compareToIgnoreCase(o2.getFristName())).collect(Collectors.toList());
	System.out.println(sorted);
	
	//max or min
	System.out.println("============max or min=========================");
	 Employee max= employees.stream().max(Comparator.comparing(Employee::getSalary)).orElseThrow(NoSuchElementException::new);
System.out.println(max);


	//reduces
	System.out.println("============reduces=========================");
	Double totalSalaryOfEmployee=employees.stream().map(employee->employee.getSalary()).reduce(0.0,Double::sum);
	System.out.println(totalSalaryOfEmployee);

	
	
	
	
	
	
}
}