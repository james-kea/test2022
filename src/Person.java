public class Person {
    private String name;
    private int x = 0;
    private int age = 0;
    public Person(){

    }

    public Person(String name, int x, int age) {
        this.name = name;
        this.x = x;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return(name+" "+x+" "+age);

    }
}
