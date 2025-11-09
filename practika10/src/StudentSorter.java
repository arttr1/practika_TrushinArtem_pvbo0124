import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentSorter {

    // Быстрая сортировка по iDNumber
    public static void quickSortByID(ArrayList<Student> list) {
        quickSort(list, 0, list.size() - 1);
    }

    private static void quickSort(ArrayList<Student> list, int low, int high) {
        if (low < high) {
            int pi = partition(list, low, high);
            quickSort(list, low, pi - 1);
            quickSort(list, pi + 1, high);
        }
    }

    private static int partition(ArrayList<Student> list, int low, int high) {
        int pivot = list.get(high).getiDNumber();
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (list.get(j).getiDNumber() <= pivot) {
                i++;
                Collections.swap(list, i, j);
            }
        }
        Collections.swap(list, i + 1, high);
        return i + 1;
    }

    // Сортировка по GPA (по убыванию)
    public static void sortByGPA(ArrayList<Student> list) {
        list.sort(Comparator.comparingDouble(Student::getGPA).reversed());
    }

    // Сортировка по фамилии (по возрастанию)
    public static void sortByLastName(ArrayList<Student> list) {
        list.sort(Comparator.comparing(Student::getLastName));
    }

    // Сортировка слиянием по GPA
    public static ArrayList<Student> mergeSortByGPA(ArrayList<Student> list) {
        if (list.size() <= 1) return list;

        int mid = list.size() / 2;
        ArrayList<Student> left = mergeSortByGPA(new ArrayList<>(list.subList(0, mid)));
        ArrayList<Student> right = mergeSortByGPA(new ArrayList<>(list.subList(mid, list.size())));
        return merge(left, right);
    }

    private static ArrayList<Student> merge(ArrayList<Student> left, ArrayList<Student> right) {
        ArrayList<Student> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i).getGPA() >= right.get(j).getGPA()) {
                result.add(left.get(i++));
            } else {
                result.add(right.get(j++));
            }
        }
        while (i < left.size()) result.add(left.get(i++));
        while (j < right.size()) result.add(right.get(j++));
        return result;
    }

    // Объединение двух списков студентов и сортировка по GPA
    public static ArrayList<Student> mergeStudentLists(ArrayList<Student> list1, ArrayList<Student> list2) {
        ArrayList<Student> merged = new ArrayList<>(list1);
        merged.addAll(list2);
        sortByGPA(merged);
        return merged;
    }
}
