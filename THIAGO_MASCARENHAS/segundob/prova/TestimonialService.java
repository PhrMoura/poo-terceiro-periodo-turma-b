package THIAGO_MASCARENHAS.segundob.prova;


public class TestimonialService {
    private static final String BASE_URL = "https://poo-exam.vercel.app/api/testimonial";
    private ApiService apiService;

    public TestimonialService() {
        this.apiService = new ApiService();
    }

    public void createTestimonial(Testimonial testimonial) throws Exception {
        String jsonInputString = testimonial.toJson();
        System.out.println(jsonInputString);
        apiService.post(BASE_URL, jsonInputString);
    }
}
