package ss12_Collection_Framework.thuc_hanh.Comparable_Comparator;

import ss12_Collection_Framework.thuc_hanh.HashMap_HashSet.Student;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge() == o2.getAge()){
            return 0;
        }else{
            return -1;
        }
    }
}
