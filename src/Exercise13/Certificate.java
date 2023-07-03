package Exercise13;

public class Certificate {
    private int certificateID;
    private String certificateName;
    private String certificateRank;
    private String certificateDate;

    public Certificate(int certificateID, String certificateName, String certificateRank, String certificateDate) {
        this.certificateID = certificateID;
        this.certificateName = certificateName;
        this.certificateRank = certificateRank;
        this.certificateDate = certificateDate;
    }

    public int getCertificateID() {
        return certificateID;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public String getCertificateRank() {
        return certificateRank;
    }

    public String getCertificateDate() {
        return certificateDate;
    }
}

