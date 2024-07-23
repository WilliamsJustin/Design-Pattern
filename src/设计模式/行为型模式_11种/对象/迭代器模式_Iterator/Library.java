package 设计模式.行为型模式_11种.对象.迭代器模式_Iterator;

import java.util.ArrayList;
import java.util.List;

// 具体聚合对象 Library
class Library implements Aggregate {

    private List<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(bookList);
    }
}
