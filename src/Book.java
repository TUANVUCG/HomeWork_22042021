import java.util.Scanner;

public class Book extends Document{
    private String authorName;
    private int amountPage;

    public Book() {
    }

    public Book(String authorName, int amountPage) {
        this.authorName = authorName;
        this.amountPage = amountPage;
    }

    public Book(int documentCode, String publishingCompany, int amount,String authorName, int amountPage) {
        super(documentCode, publishingCompany, amount);
        this.authorName = authorName;
        this.amountPage = amountPage;
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
        inputDocumentInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên tác giả : ");
        authorName = sc.nextLine();
        System.out.print("Nhập số trang : ");
        amountPage = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Sách : " + super.toString() +
                "Tên tác giả : " + authorName + "    " +
                "Số trang : " + amountPage ;
    }
}
