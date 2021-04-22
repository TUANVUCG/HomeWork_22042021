import java.util.Scanner;

public class Book extends Document{
    private Document document = new Document();
    private String authorName;
    private int amountPage;

    public Book() {
    }

    public Book(Document document, String authorName, int amountPage) {
        this.document = document;
        this.authorName = authorName;
        this.amountPage = amountPage;
    }

    public Book(int documentCode, String publishingCompany, int amount, Document document, String authorName, int amountPage) {
        super(documentCode, publishingCompany, amount);
        this.document = document;
        this.authorName = authorName;
        this.amountPage = amountPage;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getAmountPage() {
        return amountPage;
    }

    public void setAmountPage(int amountPage) {
        this.amountPage = amountPage;
    }

    public void inputBookInfo(){
        document.inputDocumentInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên tác giả : ");
        authorName = sc.nextLine();
        System.out.print("Nhập số trang : ");
        amountPage = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Book{" +
                "document=" + document +
                ", authorName='" + authorName + '\'' +
                ", amountPage=" + amountPage +
                '}';
    }
}
