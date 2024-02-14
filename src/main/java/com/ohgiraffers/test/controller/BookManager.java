package com.ohgiraffers.test.controller;

import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

   public BookManager() {}
    ArrayList<BookDTO> bookList=new ArrayList<>();

    public void addBook(BookDTO book) {
        bookList.add(new BookDTO(8392,1,"쇼펜하우머 아포리즘","쇼펜하우머"));
        bookList.add(new BookDTO(8587,2,"양자컴퓨터의 미래","미치오 카쿠"));
        bookList.add(new BookDTO(6443,3,"병든 의료","셰이머스 오마호니"));
        bookList.add(new BookDTO(3456,4,"해리포터","조앤 K.롤링"));

    }

    public void deleteBook(int index) {
        System.out.println("도서 번호: ");
        bookList.remove(index);

    }

    public int searchBook(String title) {
        bookList.;
    }


    public void printBook(int index) {

        System.out.println("도서 정보: ");
    }
    public void displayAll() {
        System.out.println("===도서 목록 전체 출력====");
    }

    public  sortedBookList();

    public void printBookList() {}
}
