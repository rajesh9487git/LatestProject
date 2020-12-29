package JavaProgramPracticeAgain;

public final class ImmutableClass {

	final int age;
	final String empName;

	public ImmutableClass(int age, String empName) {

		this.age = age;
		this.empName = empName;

	}

	public int getAge() {

		return age;
	}

	public String getName() {

		return empName;
	}
}
