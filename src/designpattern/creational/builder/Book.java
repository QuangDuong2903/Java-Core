package designpattern.creational.builder;

public class Book {

    private String name;
    private String author;

    public static class BookBuilder {

        private static Book instance;

        public BookBuilder name(String name) {
            instance.name = name;
            return this;
        }

        public BookBuilder author(String author) {
            instance.author = author;
            return this;
        }

        public Book build() {
            return instance;
        }

        public BookBuilder() {
            instance = new Book();
        }
    }

    public static BookBuilder builder() {
        return new BookBuilder();
    }

    public static void main(String[] args) {
        Book book = Book.builder()
                .name("a")
                .author("aa")
                .build();
        Book a = Book.builder()
                .name("b")
                .author("bbb")
                .build();
        System.out.println(book);
        System.out.println(a);
    }

}
