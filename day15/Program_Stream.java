package day15;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Student 
{
	int rollNo;
	String name;
	String dept;
	int marks;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(int rollNo, String name, String dept, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.dept = dept;
		this.marks = marks;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dept, marks, name, rollNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return marks== other.marks;
	}
	
}

public class Program_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student(1,"Zainab","ECE",60);
		Student s2=new Student(2,"Yatin","ECE",60);
		Student s3=new Student(3,"Astha","CSE",90);
		Student s4=new Student(4,"Bhawna","CSE",90);
		List<Student>list=new ArrayList<Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		//FILTER ON THE BASIS OF NAME STARTS 'Y' OR 'A'
		System.out.println("FILTER NAME STARTS WITH Y OR A");
		
		List<Student>filterList=
				list
				.stream()
				.filter(s->(s.getName().startsWith("Y")||s.getName().startsWith("A")))
				//.toList();
				.collect(Collectors.toList());
					//collect is MUTABLE vs toList is IMMUTABLE	
				filterList.add(new Student(5,"Palak","MECH",50));
				
				for(Student data:filterList)
					System.out.println(data.name+":"+data.rollNo+ " ");
				
				System.out.println("\nFOR EACH PRACTICE***");
				list
				.stream()
				.forEach(s->System.out.println(s.rollNo+":"+s.name));
				
				//FOR EACH
				System.out.println();
				filterList.stream().forEach
				(s->System.out.println(s.rollNo+":"+s.name));
				
				System.out.println("SORT ON MARKS***");
				// SORT ON MARKS
				list
				.stream()
				.sorted(Comparator.comparingInt(Student::getMarks))
				.forEach(s->System.out.println(s.name+":"+s.marks));
				
				System.out.println("\nSORT ON NAME DESC***");
				
				list
				.stream()
				.sorted(Comparator.comparing(Student::getName).reversed())
				.forEach(s->System.out.println(s.name+":"+s.marks));
				
				System.out.println("SORT ON MARKS IN DESECNDING ORDER USING COMPARING");
				list.stream().sorted(Comparator.comparing(Student::getMarks).reversed())
				.forEach(s->System.out.println(s.name+" "+s.marks));
				
				System.out.println("SORT COMPARATOR NAME DESC USING COMPARE TO");
				list
				.stream()
				.sorted((a,b)->a.getName().compareTo(a.getName())).
				.forEach(s->System.out.println(s.name));
			
				
				
				System.out.println("SORT COMPARATOR MARKS ASC USING  COMPARE TO");
				list
				.stream()
				.sorted((a,b)->a.getMarks()-b.marks)
				.forEach(s->System.out.println(s.marks));
				
                System.out.println("SORT COMPARATOR MARKS DESC USING  COMPARE TO");
				list
				.stream()
				.sorted((a,b)->b.getMarks()-a.marks)
				.forEach(s->System.out.println(s.marks));
				
				System.out.println("MAP INTO DEPT***");
				List<String>dept=list.stream().map(Student::getDept)
						.collect(Collectors.toList());
				dept.forEach(s->System.out.println(s));
				
				Integer num=10;
				int num2=num.intValue();
				System.out.println("MARKS TOTAL**");
				
				int sum =list.stream().map(Student::getMarks) //.mapToInt(Integer::intvalue).sum();
						.mapToInt(Integer::intValue).sum();
				
	
	System.out.println("Count students scoring more than 70");
	Long count=list.stream().filter(s->s.marks>=70).count();
	System.out.println(count);
	
	System.out.println("TOPPER OF THE BATCH");
	Optional<Student> opt1=list.stream().sorted(Comparator.comparing(Student::getMarks).reversed())
			.findFirst();
	System.out.println(opt1.get().name);
	
	System.out.println("TOP 3 BASED ON MARKS LIMIT**");
	list.stream().sorted((a,b)->b.marks-a.marks)
	.limit(3).forEach(s->System.out.println(s.name));
	
	System.out.println("DISTINCT");
	list.stream().distinct().
	forEach(s->System.out.println(s.name));
	
	System.out.println("SKIP");
	list.stream().sorted(Comparator.comparingInt(Student::getMarks))
	.skip(2).
	forEach(s->System.out.println(s.name));
	
	System.out.println("HIGHEST SCORER IN EACH DEPT**");
	Map<String,Optional<Student>>groupList=
			.list.stream().collect(
					Collectors.groupingBy(Student::getDept,
							Collectors.maxBy(a,b)->a.getMarks()-b.getmarks())));
							
							for(Map.Entry<String,Optional<Student>>e:groupList.entrySet())
							{
								System.out.println(e.getKey()+":"+e.getValue().get().marks+":"+e.getValue().get().name);
							}
							
							System.out.println("FIBONACCI**");
							//011235
							Stream.iterate(new int[] {0,1},arr->new int[] {arr[1]+arr[0]})
							.limit(10).forEach(s->System.out.print(s[0]+" "));
							
							//Integer---->int reverse of mapToInt
							System.out.println("\nBOXED INT STREAM TO STREAM<INTEGER>");
							//IntStream to list<Integer>
							List<Integer>list2=IntStream.range(1,11).boxed().collect(Collectors.toList());
							list2.forEach(s->System.out.print(s+" "));
							
							
							System.out.println("Random");
							Stream.generate(Math::random).limit(3).map(nu->nu*10)
							.map(f->Math.round(f))
							.forEach(s->System.out.print(s+" "));
							System.out.println();
							
							
							// "hello" ="h","e","l","l,"o"
							List<String>Liststr=Arrays.asList("hello,all,how,are,you");
							List<String>output=Liststr.stream().flatMap(s->Arrays.stream(s.split("")))
									.collect(Collectors.toList());
							System.out.println(output.size()+":Size");
							output.forEach(s->System.out.println(s+" "));
							
							
							
							
							
	
		
		
		

	}

}
