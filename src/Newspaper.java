import java.util.Scanner;

public class Newspaper extends Document{
    private Document document = new Document();
    private int dateRelease;

    public Newspaper() {
    }

    public Newspaper(Document document, int dateRelease) {
        this.document = document;
        this.dateRelease = dateRelease;
    }

    public Newspaper(int documentCode, String publishingCompany, int amount, Document document, int dateRelease) {
        super(documentCode, publishingCompany, amount);
        this.document = document;
        this.dateRelease = dateRelease;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public int getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(int dateRelease) {
        this.dateRelease = dateRelease;
    }

    public void inputNewspaperInfo(){
        document.inputDocumentInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngày phát hành : ");
        dateRelease = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "document=" + document +
                ", dateRelease=" + dateRelease +
                '}';
    }
}
