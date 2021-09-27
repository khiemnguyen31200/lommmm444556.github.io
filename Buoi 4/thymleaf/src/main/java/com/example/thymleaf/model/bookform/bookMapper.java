package com.example.thymleaf.model.bookform;
import java.util.List;
import com.example.thymleaf.model.Book;

public class bookMapper {
    public static Book bookCreatedToBook(bookCreated nBookCreated, List<Book> listBook) {
        Book returnBook = new Book();
        returnBook.setAuthor(nBookCreated.getAuthor());
        returnBook.setTitle(nBookCreated.getTitle());
        returnBook.setId(listBook.size() + 1);
        return returnBook;
    }
}
