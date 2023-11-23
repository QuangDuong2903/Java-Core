package designpattern.builder.product;

public class Book {

    private String name;
    private String author;

    public static class Builder {
        private final Book book;

        public Builder() {
            this.book = new Book();
        }

        public Builder name(String name) {
            this.book.name = name;
            return this;
        }

        public Builder author(String author) {
            this.book.author = author;
            return this;
        }

        public Book build() {
            return this.book;
        }
    }

}
