package model;

/**
 * Representasi anggota perpustakaan yang dapat meminjam buku.
 * Menyimpan nama dan ID unik anggota.
 * 
 * <p>
 * Objek ini digunakan oleh {@link service.LibraryService} saat proses
 * peminjaman buku.
 * </p>
 * 
 * @author Eva
 * @version 1.0
 * @since 2025
 */
public class Member {
    private String name;
    private int memberId;

    /**
     * Membuat objek Member baru.
     *
     * @param name     nama anggota
     * @param memberId ID unik anggota
     */
    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    /**
     * Mengembalikan nama anggota.
     *
     * @return nama anggota
     */
    public String getName() {
        return name;
    }

    /**
     * Mengembalikan ID anggota.
     *
     * @return ID anggota
     */
    public int getMemberId() {
        return memberId;
    }
}
