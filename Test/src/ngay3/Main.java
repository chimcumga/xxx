package ngay3;


public class Main {

	public static void main(String args[]) {
		
		Job job1 = new Job (1, " HR");
		Job job2 = new Job (2, " BA");
		Job job3 = new Job (3, " Tester");
		Job job4 = new Job (4, " Developer");
		Job job5 = new Job (5, " CEO");
		Employee [] employee = new Employee [5];
		employee[0] = new Employee("Nguyen Van A ", 1, 3000, 24, false, job1);
		employee[1] = new Employee("Nguyen Van B ", 2, 4000, 25, false, job2);
		employee[2] = new Employee("Nguyen Van C ", 3, 5000, 26, false, job3);
		employee[3] = new Employee("Nguyen Van D ", 4, 6000, 27, false, job4);
		employee[4] = new Employee("Nguyen Van E ", 5, 7000, 28, false, job5);
		
		System.out.println(" Mang co " + employee.length + " phan tu!" );
		System.out.println(" ID      Name           Salary   Job name");
		System.out.println(" "+employee[4].id + "   "  +employee[4].name + "      "+employee[4].salary + "    "+employee[4].job.nameJob);
		System.out.println();
		System.out.println("------------------------------------------");
		
		for(int i=0; i<=employee.length; i++)
		System.out.println(" "+employee[i].id + "   "  +employee[i].name + "      "+employee[i].salary + "    "+employee[i].job.nameJob);
		
		
	}
	

}
