public class Cat {
    private String name;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.printf("Мяу! Меня зовут %s. Мне %s года(лет).\n", this.name, this.age);
    }

}
