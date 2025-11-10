# Sistem Perpustakaan Sederhana — Tugas Dokumentasi Java (JavaDocs)

Proyek ini dibuat untuk memenuhi tugas **“Dokumentasi Proyek dengan JavaDocs”**, yaitu membuat dokumentasi kode Java yang jelas, mudah dipahami, dan konsisten.  
Tujuan utama proyek ini adalah agar kode dapat **dipelihara, diperbarui, dan dikembangkan** dengan mudah oleh tim pengembang di masa depan.

---

## Struktur Folder
```
LibraryJavaDocs/
├── src/ # Berisi semua file kode Java
│ ├── model/
│ │ ├── Book.java
│ │ └── Member.java
│ │
│ ├── service/
│ │ └── LibraryService.java
│ │
│ └── Main.java
│
├── docs/ # Hasil dokumentasi JavaDocs (format HTML)
│ ├── index.html ← buka file ini di browser untuk melihat dokumentasi
│ ├── model/
│ │ ├── Book.html
│ │ └── Member.html
│ └── service/
│ └── LibraryService.html
│
└── README.md # Penjelasan proyek
```

---

## Cara Menjalankan Program

1. Buka terminal di folder utama proyek (`LibraryJavaDocs`)
2. Jalankan perintah berikut untuk **compile semua file Java**:
   ```bash
   javac -d out src/model/*.java src/service/*.java src/Main.java
   ```
3. Lalu jalankan program utama:
   ```bash
   java -cp out Main
   ```
4. Hasil akan muncul di terminal seperti contoh:
   ```
   Daftar Buku di Perpustakaan:
   - Pemrograman Java oleh Reyva [Tersedia]
   - Algoritma dan Struktur Data oleh Eva [Tersedia]
   Eva meminjam "Pemrograman Java"
   Buku "Pemrograman Java" sedang dipinjam.
   ```

---

## Cara Melihat Dokumentasi JavaDocs
1. Buka folder `docs/`
2. Klik dua kali file `index.html`
3. File tersebut akan terbuka di browser (Chrome/Safari)
4. Di halaman tersebut terdapat dokumentasi lengkap untuk setiap kelas dan metode:
  - **Book →** menangani data buku seperti judul, penulis, dan status ketersediaan
  - **Member →** menyimpan data anggota perpustakaan
  - **LibraryService →** mengelola koleksi buku, peminjaman, dan pengembalian
  - **Main →** menjalankan program utama
    
Atau langsung buka dokumentasi online melalui GitHub Pages:
https://reyvanfg.github.io/LibraryJavaDocs/

---
## Deskripsi Tugas (Sesuai Instruksi PDF)

Tugas ini bertujuan untuk:
- Membuat dokumentasi proyek menggunakan **JavaDocs**
- Menambahkan komentar dokumentasi pada setiap **kelas** dan **metode**
- Menggunakan tag:
  - `@param` → menjelaskan parameter input  
  - `@return` → menjelaskan nilai yang dikembalikan  
  - `@throws` → menjelaskan jenis exception yang mungkin muncul  

**Perintah untuk Generate Dokumentasi JavaDocs:**
```bash
javadoc -d docs -sourcepath src -subpackages model:service
```

Output dari perintah di atas tersimpan di folder `doc/` dalam format HTML.

---

## Catatan Tambahan

- Semua file di folder `docs/` dihasilkan otomatis oleh JavaDocs dan **tidak perlu diubah secara manual**.  
- File utama dokumentasi adalah `docs/index.html`.  
- Untuk membuka dokumentasi, cukup buka `index.html` di browser.  
- Struktur dan dokumentasi proyek ini sudah **sepenuhnya sesuai dengan ketentuan tugas di PDF**.

---

**Kesimpulan:**  
Proyek ini telah memenuhi seluruh kriteria tugas JavaDocs — mencakup penulisan komentar dokumentasi, penggunaan tag standar, serta pembuatan output HTML yang dapat diakses dengan mudah.
Dengan dokumentasi ini, proyek Sistem Perpustakaan Sederhana dapat dikembangkan dan dipelihara dengan efisien oleh tim pengembang di masa depan.
