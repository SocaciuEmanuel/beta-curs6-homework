public class Person {
    private String name;
    private Integer age;
    private boolean married;

    public Person(String name, Integer age, boolean married){
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public boolean isMarried() {
        return married;
    }

    @Override
    public String toString() {
        return "Person {" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", married = " + married +
                " }";
    }
}
