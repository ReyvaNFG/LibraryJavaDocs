import model.Book;
import model.Member;
import service.LibraryService;

/**
 * Kelas utama untuk mendemokan penggunaan {@link service.LibraryService}.
 * 
 * <p>
 * Program ini akan:
 * <ol>
 * <li>Membuat beberapa buku dan anggota</li>
 * <li>Menambahkan buku ke perpustakaan</li>
 * <li>Menampilkan daftar buku</li>
 * <li>Mencoba melakukan peminjaman buku</li>
 * </ol>
 * </p>
 * 
 * @author Eva
 * @version 1.0
 * @since 2025
 */
public class Main {

    /**
     * Titik masuk utama program.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        LibraryService library = new LibraryService();

        // Tambah buku contoh
        library.addBook(new Book("Pemrograman Java", "Reyva"));
        library.addBook(new Book("Algoritma dan Struktur Data", "Eva"));

        // Buat anggota perpustakaan
        Member member = new Member("Eva", 101);

        // Tampilkan semua buku
        library.showAllBooks();

        // Peminjaman berhasil
        library.borrowBook(member, "Pemrograman Java");

        // Peminjaman gagal (sudah dipinjam)
        library.borrowBook(member, "Pemrograman Java");
    }
}
