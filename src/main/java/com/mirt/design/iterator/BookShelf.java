package com.mirt.design.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 书架 需要实现迭代功能，返回迭代器
 *
 * @author Zhang Yuqi
 * @create 2018/7/11.
 */
public class BookShelf implements Aggregate {
    private List<Book> books;
    private int last = 0;

    public BookShelf(int size) {
        this.books = new ArrayList<>(size);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
        last++;
    }

    private class BookShelfItr implements Iterator<Book> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < BookShelf.this.last;
        }

        @Override
        public Book next() {
            Book book = BookShelf.this.books.get(index);
            index++;
            return book;
        }
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfItr();
    }
}
