package streamApi;

import java.util.Arrays;
import java.util.List;

public class FilterName {
public static void main(String[] args) {
	List<String> name=Arrays.asList("durga","prasad");
name.stream().filter(nam->nam.equals("durga")).forEach(System.out::println);
}
}
