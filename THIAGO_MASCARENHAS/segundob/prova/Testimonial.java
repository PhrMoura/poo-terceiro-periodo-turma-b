package THIAGO_MASCARENHAS.segundob.prova;

public class Testimonial {
    private String photoUrl;
    private String studentRa;
    private String text;

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getStudentRa() {
        return studentRa;
    }

    public void setStudentRa(String studentRa) {
        this.studentRa = studentRa;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Photo URL: " + photoUrl + ", Student RA: " + studentRa + ", Text: " + text;
    }

    public String toJson() {
        return "{ \"imageUrl\": \"" + photoUrl + "\", \"ra\": \"" + studentRa + "\", \"description\": \"" + text + "\" }";
    }
}
