package task3;

import task5.Address;

public class Book {


    public String title;
    public String author;
    public String content;

    public Book(String newTitle, String newAuthor, String newContent) {
        title = newTitle;
        author = newAuthor;
        content = newContent;

    }
    }

    class Title {
        private String title;

        public String getTitle() {
            return title;
        }

        public String setTitle(String title) {
            this.title = title;
            return title;
        }
    }

    class Author {
        private String author;

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
    }

    class Content {
        public String content;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public static void show() {

        }
                public static void main(String[] args){
                Book book = new Book("Пригоди Робінзона Крузо", "Даніель Дефо",
                        "Ця книга розповідає історію Робінзона Крузо, який опинився " +
                                "на безлюдному острові і боровся за виживання.");

                    String title = book.title;
                    String author = book.author;
                    String content = book.content;
            show();




            System.out.println("Назва книги: " + title);
            System.out.println("Автор: " + author);
            System.out.println("Зміст: " + content);
    }
}


