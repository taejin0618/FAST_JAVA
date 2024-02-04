package ch21;

public class ObjectCopytest {
    public static void main(String[] atgs) {
        Book[] library = new Book[5];
        Book[] copyLibary = new Book[5];


        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        copyLibary[0] = new Book();
        copyLibary[1] = new Book();
        copyLibary[2] = new Book();
        copyLibary[3] = new Book();
        copyLibary[4] = new Book();

        for (int i = 0; i < library.length; i++) {
            copyLibary[i].setAuthor(library[i].getAuthor());
            copyLibary[i].setTitle(library[i].getTitle());

        }

        library[0].setAuthor("박완서");
        library[0].setTitle("나목");
        
        System.out.println("== library ==");
        for (Book book : library) {
            System.out.println(book);
            book.showBookInfo();
        }

        System.out.println("== copy library ==");
        for (Book book : copyLibary) {
            System.out.println(book);
            book.showBookInfo();
        }

    }
}
