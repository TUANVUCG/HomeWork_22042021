import java.util.Scanner;

public class Magazine extends Document{

    private int releaseNumber;
    private int mouthRelease;
    public Magazine() {
    }

    public Magazine( int releaseNumber, int mouthRelease) {
        this.releaseNumber = releaseNumber;
        this.mouthRelease = mouthRelease;
    }

    public Magazine(int documentCode, String publishingCompany, int amount, int releaseNumber, int mouthRelease) {
        super(documentCode, publishingCompany, amount);
        this.releaseNumber = releaseNumber;
        this.mouthRelease = mouthRelease;
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



    public void inputMagazineInfo(){
        inputDocumentInfo();
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
        return "Tạp chí : " + super.toString() +"    "+
                "Số phát hành : " + releaseNumber +"    "+
                "Tháng phát hành : " + mouthRelease ;
    }
}
