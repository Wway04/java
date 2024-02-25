package ThuVien;

import java.util.ArrayList;

public class QuanLiSach {

    private ArrayList<TaiLieu> documents = new ArrayList<TaiLieu>();

    // methods
    public void addDocument(TaiLieu document) {
        documents.add(document);
    }

    public void deleteDocumentById(String idDocumentDelete) {
        for (TaiLieu document : documents) {
            if (document.getMaTaiLieu().equals(idDocumentDelete)) {
                System.out.println("Deleting document " + document);
                documents.remove(document);
                return;
            }
        }
    }

    public void showDocuments() {
        for (TaiLieu document : documents) {
            System.out.println(document);
        }
    }

    private boolean findDocument(TaiLieu document, int loai) {
        if (document.loai == loai) {
            return true;
        }
        return false;

    }

    public void showDocumentsByType(int loai) {
        for (TaiLieu document : documents) {
            if (findDocument(document, loai)) {
                System.out.println(document);
            }
        }
    }

}
