package ss5_accessmodifier_staticmethod_staticproperty.thuc_hanh.Static_Method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(1,"Huy");
        Student s2 = new Student(2,"Phúc");
        Student s3 = new Student(3,"Nguyên");
        s1.display();
        s2.display();
        s3.display();
    }
}
