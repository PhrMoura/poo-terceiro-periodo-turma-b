package BRUNO_EDUARDO_CALLEGARO.prova;

import java.util.Date;

public class testemunho {
    private String imageUrl;
    private String description;
    private String ra;
    private Date timestamp; 

    public testemunho(String imageUrl, String description, String ra) {
        this.imageUrl = imageUrl;
        this.description = description;
        this.ra = ra;
        this.timestamp = new Date();
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public String getRa() {
        return ra;
    }

    public Date getTimestamp() {
        return timestamp;
    }
}


   