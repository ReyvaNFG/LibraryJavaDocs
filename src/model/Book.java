package model;

/**
 * Representasi entitas buku dalam sistem perpustakaan.
 * Menyimpan informasi judul, penulis, dan status ketersediaan buku.
 *
 * <p>
 * Kelas ini digunakan oleh {@link service.LibraryService} untuk mengelola
 * koleksi buku yang dapat dipinjam oleh anggota.
 * </p>
 *
 * @author Eva
 * @version 1.0
 * @since 2025
 */
public class Book {
    private String title;
    private String author;
    private boolean available;

    /**
     * Membuat objek Book baru dengan status awal tersedia.
     *
     * @param title  judul buku
     * @param author nama penulis buku
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    /**
     * Mengembalikan judul buku.
     *
     * @return judul buku
     */
    public String getTitle() {
        return title;
    }

    /**
     * Mengembalikan nama penulis.
     *
     * @return nama penulis buku
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Mengecek apakah buku tersedia untuk dipinjam.
     *
     * @return true jika tersedia, false jika sedang dipinjam
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Menandai buku sebagai sedang dipinjam.
     */
    public void borrow() {
        this.available = false;
    }

    /**
     * Menandai buku sebagai dikembalikan sehingga tersedia kembali.
     */
    public void returnBook() {
        this.available = true;
    }
}
