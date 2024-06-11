package segundob.exemplos.aulaseis;

public class PgConnection {
    
    private String urlDb;

    public PgConnection(String urlDb) {
        this.urlDb = urlDb;
    }

    public String getUrlDb() {
        return urlDb;
    }

    public void setUrlDb(String urlDb) {
        this.urlDb = urlDb;
    }

}
