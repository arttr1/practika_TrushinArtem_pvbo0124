public class Main {
    public static void main(String[] args) {
        
        LabClass lab = new LabClass();
        lab.addStudent(new Student("Иванов Иван Иванович", 4.8));
        lab.addStudent(new Student("Петрова Анна Сергеевна", 4.2));
        lab.addStudent(new Student("Сидоров Дмитрий Петрович", 3.9));
        lab.addStudent(new Student("Кузнецова Елена Андреевна", 4.5));

        System.out.println("=== 🎓 Группа студентов (до сортировки): ===");
        lab.printAll();

        lab.sortByAverageGrade();
        System.out.println("\n=== 📊 После сортировки по среднему баллу (по убыванию): ===");
        lab.printAll();

        System.out.println("\n=== 🔍 Поиск по ФИО: ===");
        searchStudent(lab, "Иванов");         
        searchStudent(lab, "Анна");           
        searchStudent(lab, "Елена Кузнецова"); 
        searchStudent(lab, "Николаев");       
        searchStudent(lab, "");               
    }

    private static void searchStudent(LabClass lab, String query) {
        try {
            Student found = lab.findByName(query);
            System.out.println("Успех: " + found);
        } catch (StudentNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Некорректный запрос поиска: " + e.getMessage());
        }
    }
}