package JavaPrograms23Nov;

public final class ImmutableClass {

	private final int age;
	private final String name;

	public ImmutableClass(int age, String name) {

		this.age = age;
		this.name = name;
	}

	public int getAge() {

		return age;
	}

	public String getName() {

		return name;
	}

}
