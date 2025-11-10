package service;

import model.Book;
import model.Member;

import java.util.ArrayList;
import java.util.List;

/**
 * Kelas layanan utama yang mengelola koleksi buku perpustakaan
 * dan proses peminjaman buku oleh anggota.
 *
 * <p>
 * Fungsi utama:
 * <ul>
 * <li>Menambah buku ke koleksi</li>
 * <li>Mencari buku berdasarkan judul</li>
 * <li>Memproses peminjaman buku</li>
 * <li>Menampilkan daftar buku</li>
 * </ul>
 * </p>
 * 
 * @author Eva
 * @version 1.0
 * @since 2025
 */
public class LibraryService {

    private List<Book> books;

    /**
     * Membuat objek LibraryService baru
     * dengan koleksi buku awal yang masih kosong.
     */
    public LibraryService() {
        this.books = new ArrayList<>();
    }

    /**
     * Menambahkan buku baru ke koleksi perpustakaan.
     *
     * @param book objek Book yang akan ditambahkan
     * @throws IllegalArgumentException jika {@code book} bernilai null
     */
    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Buku tidak boleh null");
        }
        books.add(book);
    }

    /**
     * Mencari buku berdasarkan judul (tidak peka huruf besar/kecil).
     *
     * @param title judul buku yang dicari
     * @return objek Book jika ditemukan, null jika tidak ada yang cocok
     */
    public Book findBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    /**
     * Memproses peminjaman buku oleh anggota.
     *
     * @param member anggota yang melakukan peminjaman
     * @param title  judul buku yang ingin dipinjam
     * @return true jika peminjaman berhasil,
     *         false jika buku tidak ditemukan atau tidak tersedia
     */
    public boolean borrowBook(Member member, String title) {
        Book book = findBook(title);

        if (book == null) {
            System.out.println("Buku \"" + title + "\" tidak ditemukan.");
            return false;
        }

        if (!book.isAvailable()) {
            System.out.println("Buku \"" + book.getTitle() + "\" sedang dipinjam.");
            return false;
        }

        book.borrow();
        System.out.println(member.getName() + " meminjam \"" + book.getTitle() + "\"");
        return true;
    }

    /**
     * Menampilkan seluruh buku dalam koleksi perpustakaan ke console.
     */
    public void showAllBooks() {
        System.out.println("Daftar Buku di Perpustakaan:");
        for (Book b : books) {
            String status = b.isAvailable() ? "Tersedia" : "Dipinjam";
            System.out.println("- " + b.getTitle() + " oleh " + b.getAuthor()
                    + " [" + status + "]");
        }
    }

    /**
     * Mengembalikan daftar semua buku.
     *
     * @return list berisi objek Book
     */
    public List<Book> getBooks() {
        return books;
    }
}
