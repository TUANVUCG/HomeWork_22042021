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

    // Hien thi thong tin cac tai lieu
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

    // Sap xep theo ma tai lieu su dung nhi phan
    // Tao mang chua ma tai lieu
    public int[] finDocumentIdArray(List<Document> documentList) {
        int[] documentIdArray = new int[documentList.size()];
        for (int i = 0; i < documentList.size(); i++) {
            documentIdArray[i] = documentList.get(i).getId();
        }
        return documentIdArray;
    }


    // Sap xep mang tai lieu
    public int[] sortDocumentCodeArray() {
        int[] documentIdArray = creatDocumentIdArray();
        for (int i = 0; i < documentIdArray.length - 1; i++) {
            for (int j = i + 1; j < documentIdArray.length; j++) {
                if (documentIdArray[i] > documentIdArray[j]) {
                    int temp = documentIdArray[i];
                    documentIdArray[i] = documentIdArray[j];
                    documentIdArray[j] = temp;
                }
            }
        }
        return documentIdArray;
    }

    // Tim kiem nhi phan mang da sap xep
    public int binarySearchDocumentByCode(int number,int[] documentId) {
        int left = 0;
        int right = documentId.length;
        int mid = (left+right)/2;
        int index = 0;
        do{
            if(number == documentId[mid]){
                index = documentId[mid];
            }
            if(number>documentId[mid]){
                left = mid +1;
            }
            else if(number<documentId[mid]){
                right = mid -1;
            }

        }while (left<right);
        if(index ==0){
            System.out.println("Không tìm thấy mã tài liệu phù hợp");
        }return index;
    }


    Map<Integer, Document> documentMap = new HashMap<Integer, Document>();

    public void addDocument() {
        for (int i = 0; i < documentList.size(); i++) {
            documentMap.put(documentList.get(i).getId(), documentList.get(i));
        }
    }


    // Tao mang chua ma tai lieu
    public int[] creatDocumentIdArray() {
        int[] documentIdArray = new int[documentList.size()];
        for (int i = 0; i < documentMap.size(); i++) {
            documentIdArray[i] = documentList.get(i).getId();
        }
        return documentIdArray;
    }

    // Tim thong tin tai lieu khi nhap ma tai lieu
    public void showDocumentByCode(int inputCode) {


    }

    // Tim tai lieu bang ma tai lieu su dung tim kiem nhi phan
    // tim kiem thong thuong
    public Document findByCode(int id) {
        for (Document document : documentList) {
            if (id == document.getId()) {
                return document;
            }
        }
        return null;
    }

}


// Lay ki tu dau tien cua ma tai lieu
//    public static char findFirstCharOfDocumentCode(String documentCode){
//        return documentCode.charAt(0);
//    }

//    // Lay mang ki tu dau tien cua ma tai lieu
//    public static char[] findFirstCharArray(List<Document> documentList){
//        char firstCharArray[] = new char [documentList.size()];
//        for(int i = 0; i < documentList.size(); i++){
//            String documentCode = documentList.get(i).getDocumentCode();
//            char firstChar = findFirstCharOfDocumentCode(documentCode);
//            firstCharArray[i] = firstChar;
//        }
//        return firstCharArray;
//    }




