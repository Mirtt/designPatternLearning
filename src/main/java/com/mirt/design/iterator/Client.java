package com.mirt.design.iterator;

/**
 * @author Zhang Yuqi
 * @date 2018/7/11.
 */
public class Client {
    public static void main(String[] args) {
        BookShelf myBooks = new BookShelf(3);
        myBooks.appendBook(new Book("aaa"));
        myBooks.appendBook(new Book("bbb"));
        myBooks.appendBook(new Book("ccc"));
        Iterator<Book> itr = myBooks.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().getName());
        }
        myBooks.appendBook(new Book("ddd"));
        myBooks.appendBook(new Book("eee"));
        itr = myBooks.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().getName());
        }
    }
}
