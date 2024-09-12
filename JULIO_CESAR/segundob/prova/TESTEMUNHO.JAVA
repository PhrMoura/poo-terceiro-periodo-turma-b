public class Testemunho {
    private String urlFoto;
    private String raAluno;
    private String texto;

    public Testemunho(String urlFoto, String raAluno, String texto) {
        this.urlFoto = urlFoto;
        this.raAluno = raAluno;
        this.texto = texto;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public String getRaAluno() {
        return raAluno;
    }

    public String getTexto() {
        return texto;
    }
}
