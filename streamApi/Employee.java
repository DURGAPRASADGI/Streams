package streamApi;

import java.util.List;

public class Employee {
	public Employee(String fristName, String lastName, Double salary, List<String> projects) {
		super();
		FristName = fristName;
		this.lastName = lastName;
		this.salary = salary;
		this.projects = projects;
	}
	public String getFristName() {
		return FristName;
	}
	public void setFristName(String fristName) {
		FristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [FristName=" + FristName + ", lastName=" + lastName + ", salary=" + salary + ", projects="
				+ projects + "]";
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public List<String> getProjects() {
		return projects;
	}
	public void setProjects(List<String> projects) {
		this.projects = projects;
	}
	private String FristName;
	private String lastName;
	private Double salary;
	private List<String> projects;

}
