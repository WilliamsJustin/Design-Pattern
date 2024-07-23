package 设计模式.行为型模式_11种.对象.迭代器模式_Iterator;

import java.util.List;

// 具体迭代器 BookIterator
class BookIterator implements Iterator {

    private List<Book> bookList;
    private int index = 0;

    public BookIterator(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public boolean hasNext() {
        return index < bookList.size();
    }

    @Override
    public Object next() {

        if (hasNext()) {
            return bookList.get(index++);
        } else {
            return null;
        }
    }
}
