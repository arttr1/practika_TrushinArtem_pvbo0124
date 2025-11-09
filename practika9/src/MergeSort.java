import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static List<Student> sort(List<Student> students) {
        if (students.size() <= 1) return students;

        int mid = students.size() / 2;
        List<Student> left = sort(new ArrayList<>(students.subList(0, mid)));
        List<Student> right = sort(new ArrayList<>(students.subList(mid, students.size())));

        return merge(left, right);
    }

    private static List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).compareTo(right.get(j)) <= 0) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            merged.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            merged.add(right.get(j));
            j++;
        }

        return merged;
    }
}
