import java.util.Scanner;

public class Document {
    private int id;
    private String publishingCompany;
    private int amount;

    public Document() {
    }

    public Document(int id, String publishingCompany, int amount) {
        this.id = id;
        this.publishingCompany = publishingCompany;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void inputDocumentInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã tài liệu : ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tên nhà phát hành : ");
        publishingCompany = sc.nextLine();
        System.out.print("Nhập số bản phát hành : ");
        amount = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return  "Mã tài liệu : " + id + "   " +
                "Nhà xuất bản : " + publishingCompany + "    " +
                "Số lượng : " + amount +"   ";
    }
}
