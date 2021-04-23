import java.util.*;

public class DocumentManager {
    Scanner sc = new Scanner(System.in);
    List<Document> documentList = new ArrayList<>();

    // Nhap thong tin cac tai lieu
    public void inputDocumentInfo() {
        System.out.println("Bạn muốn nhập thông tin tài liệu nào ?");
        showList();
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1: {
                Book book = new Book();
                book.inputBookInfo();
                documentList.add(book);
                break;
            }
            case 2: {
                Magazine magazine = new Magazine();
                magazine.inputMagazineInfo();
                documentList.add(magazine);
                break;
            }
            case 3: {
                Newspaper newspaper = new Newspaper();
                newspaper.inputNewspaperInfo();
                documentList.add(newspaper);
                break;
            }
        }
    }

    private void showList() {
        System.out.println("1. Sách");
        System.out.println("2. Tạp chí");
        System.out.println("3. Báo");
    }

    // Hien thi thong tin tat ca tai lieu
    public void showDocumentInfo() {
        for (Document document : documentList) {
            System.out.println(document.toString());
        }
    }

    // Tim kiem tai lieu theo ma loai
    public void findDocumentByType() {
        System.out.println("Bạn muốn tìm kiếm loại tài liệu nào ?");
        showList();
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {
                for (Document document : documentList) {
                    if (document instanceof Book) {
                        System.out.println(document);
                    }
                }
                break;
            }
            case 2: {
                for (Document document : documentList) {
                    if (document instanceof Magazine) {
                        System.out.println(document);
                    }
                }
                break;
            }
            case 3: {
                for (Document document : documentList) {
                    if (document instanceof Newspaper) {
                        System.out.println(document);
                    }
                }
                break;
            }
        }
    }


    // Sap xep theo ma tai lieu
    public void sortDocumentListById() {
        for (int i = 0; i < documentList.size() - 1; i++) {
            for (int j = i + 1; j < documentList.size(); j++) {
                if (documentList.get(i).getId() > documentList.get(j).getId()) {
                    Collections.swap(documentList, i, j);
                }
            }
        }
    }


    // Tim kiem nhi phan id voi mang da sap xep
    public void binarySearchDocumentById(int number) {
        int left = 0;
        int right = documentList.size()-1;
        int index = 0;
        do {
            int mid = (left + right) / 2;
            if (number == documentList.get(mid).getId()) {
                index = documentList.get(mid).getId();
                System.out.println(documentList.get(mid));
                return;
            }
            if (number > documentList.get(mid).getId()) {
                left = mid + 1;
            } else if (number < documentList.get(mid).getId()) {
                right = mid - 1;
            }

        } while (left <= right);
        if (index == 0) {
            System.out.println("Không tìm thấy mã tài liệu phù hợp");
        }
    }



}



