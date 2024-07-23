package 设计模式.行为型模式_11种.对象.迭代器模式_Iterator;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        library.addBook(new Book("Java编程思想", "Bruce Eckel"));
        library.addBook(new Book("设计模式", "Erich Gamma"));
        library.addBook(new Book("计算机网络", "Andrew Tanenbaum"));

        Iterator iterator = library.createIterator();

        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println("Book:" + book.getName() + ",Author:" + book.getAuthor());
        }

    }
}
