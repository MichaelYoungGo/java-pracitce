public class StudentList {
	private Student[] students;
	public StudentList(){
		this.students = new Student[10];
	}
	public void add(Student student){
		for(int i =0; i < this.students.length; i++){
			if(this.students[i] == null){
				students[i] = student;
				break;
			}
		}
		System.out.println("add successfully!!");
	}
	public void printlist(){
		for(int i =0; i < this.students.length; i++){
			if(this.students[i] != null){
				System.out.println(students[i]);
			}
		}
	}
	public static void main(String[] args){
		Student s1 = new Student("yang", 13, "male", "120", "beijing", "a@meil");
		Student s2 = new Student("han", 13, "male", "119", "tianjin", "a@meil");
		StudentList slist = new StudentList();
		slist.add(s1);
		slist.add(s2);
		slist.printlist();
	}
}
