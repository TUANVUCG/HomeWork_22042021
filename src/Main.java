import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DocumentManager documentManager = new DocumentManager();
        documentManager.documentList.add(new Book(34,"Cách tạo ra con người",1222,"Sinh học lớp 8", 12));
        documentManager.documentList.add(new Magazine(12,"Bóng đá sân nhỏ",67,67, 12));
        documentManager.documentList.add(new Newspaper(78,"Khều khều",897, 12));
        System.out.println("Nhập lựa chọn của bạn");
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        do{
            menu();
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
                    sortDocumentById(documentManager);
                }
                case 5 : {
                    findDocumentById(documentManager, sc);
                    break;
                }
            }
        }while (choice !=0);
    }

    private static void sortDocumentById(DocumentManager documentManager) {
        documentManager.sortDocumentListById();
        documentManager.showDocumentInfo();
    }

    private static void findDocumentById(DocumentManager documentManager, Scanner sc) {
        System.out.print("Nhập mã tài liệu muốn tìm : ");
        int inputId = sc.nextInt();
        documentManager.binarySearchDocumentById(inputId);
    }

    private static void menu() {
        System.out.println("1. Nhập thông tin tài liệu");
        System.out.println("2. Hiển thị thông tin toàn bộ tài liệu");
        System.out.println("3. Tìm kiếm tài liệu theo mã loại");
        System.out.println("4. Sắp xếp tài liệu theo mã tài liệu");
        System.out.println("5. Tìm kiếm tài liệu theo mã sử dụng nhị phân");
        System.out.println("0. Thoát chương trình");
    }
}
