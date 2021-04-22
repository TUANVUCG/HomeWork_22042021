import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DocumentManager documentManager = new DocumentManager();
        System.out.println("Nhập lựa chọn của bạn");
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        do{
            System.out.println("1. Nhập thông tin tài liệu");
            System.out.println("2. Hiển thị thông tin toàn bộ tài liệu");
            System.out.println("3. Tìm kiếm tài liệu theo mã loại");
            System.out.println("4. Tìm kiếm tài liệu theo mã loại sử dụng nhị phân");
            choice = sc.nextInt();
            switch (choice){
                case 1 : {
                    documentManager.inputDocumentInfo();
                    break;
                }
                case 2 : {
                    documentManager.showDocumentInfo();
                    break;
                }
                case 3 : {
                    documentManager.findDocumentByType();
                    break;
                }
                case 4 : {
                    System.out.print("Nhập mã tài liệu muốn tìm : ");
                    int inputCode = sc.nextInt();
                    sc.nextLine();
                }
            }
        }while (choice !=0);
    }
}
