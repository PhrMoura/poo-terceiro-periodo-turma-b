package ProvaSegundoB;

public class Student {
    private String ra;
    private String name;
    private String email;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "RA: " + ra + ", Name: " + name + ", Email: " + email;
    }

    public static Student fromJson(String json) {
        String[] fields = json.replace("{", "").replace("}", "").split(",");
        Student student = new Student();
        for (String field : fields) {
            String[] keyValue = field.split(":");
            String key = keyValue[0].replace("\"", "").trim();
            String value = keyValue[1].replace("\"", "").trim();
            switch (key) {
                case "ra":
                    student.setRa(value);
                    break;
                case "name":
                    student.setName(value);
                    break;
                case "email":
                    student.setEmail(value);
                    break;
            }
        }
        return student;
    }
}
