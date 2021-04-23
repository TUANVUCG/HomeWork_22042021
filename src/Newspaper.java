import java.util.Scanner;

public class Newspaper extends Document{
    private int dateRelease;

    public Newspaper() {
    }

    public Newspaper(int dateRelease) {
        this.dateRelease = dateRelease;
    }

    public Newspaper(int documentCode, String publishingCompany, int amount,int dateRelease) {
        super(documentCode, publishingCompany, amount);
        this.dateRelease = dateRelease;
    }



    public int getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(int dateRelease) {
        this.dateRelease = dateRelease;
    }

    public void inputNewspaperInfo(){
        inputDocumentInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngày phát hành : ");
        dateRelease = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Báo : " +super.toString()+"    "+
                "Ngày phát hành : " + dateRelease;
    }
}
