package ProvaSegundoB;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private static final String BASE_URL = "https://poo-exam.vercel.app/api/students";
    private ApiService apiService;

    public StudentService() {
        this.apiService = new ApiService();
    }

    public List<Student> getStudents() throws Exception {
        String response = apiService.get(BASE_URL);
        List<Student> students = new ArrayList<>();
        response = response.substring(1, response.length() - 1); // Remove brackets
        String[] studentArray = response.split("\\},\\{");
        for (String studentJson : studentArray) {
            studentJson = "{" + studentJson + "}";
            students.add(Student.fromJson(studentJson));
        }
        return students;
    }
}

