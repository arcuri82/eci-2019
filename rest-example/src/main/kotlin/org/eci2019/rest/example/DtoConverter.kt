package org.eci2019.rest.example

import org.eci2019.rest.example.db.Book
import org.eci2019.rest.example.dto.BookDto


object DtoConverter {


    fun transform(book: Book) : BookDto {

        return BookDto(
                title = book.title,
                author = book.author,
                year = book.year,
                id = book.id.toString()
        )
    }


    fun transform(books: Iterable<Book>) : List<BookDto>{

        return books.map { transform(it) }
    }
}