import java.util.Scanner;

public class Magazine extends Document{

    private int releaseNumber;
    private int mouthRelease;
    private Document document =  new Document();

    public Magazine() {
    }

    public Magazine(int releaseNumber, int mouthRelease, Document document) {
        this.releaseNumber = releaseNumber;
        this.mouthRelease = mouthRelease;
        this.document = document;
    }

    public Magazine(int documentCode, String publishingCompany, int amount, int releaseNumber, int mouthRelease, Document document) {
        super(documentCode, publishingCompany, amount);
        this.releaseNumber = releaseNumber;
        this.mouthRelease = mouthRelease;
        this.document = document;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    public int getMouthRelease() {
        return mouthRelease;
    }

    public void setMouthRelease(int mouthRelease) {
        this.mouthRelease = mouthRelease;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public void inputMagazineInfo(){
        document.inputDocumentInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phát hành : ");
        releaseNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tháng phát hành : ");
        mouthRelease = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "releaseNumber=" + releaseNumber +
                ", mouthRelease=" + mouthRelease +
                ", document=" + document +
                '}';
    }
}
