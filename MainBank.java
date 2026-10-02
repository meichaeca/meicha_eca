public class MainBank {
    public static void main(String[] args) {
        System.out.println("=== MEMBUAT OBJEK REKENING ===");
        // Membuat 2 objek rekening 
        RekeningBank rek1 = new RekeningBank("12345", "Meicha", 100000);
        RekeningBank rek2 = new RekeningBank("231225", "Rayyan", 50000);

        System.out.println("\n=== SALDO AWAL ===");
        System.out.println("Saldo " + rek1.getNamaPemilik() + ": Rp " + rek1.getSaldo());
        System.out.println("Saldo " + rek2.getNamaPemilik() + ": Rp " + rek2.getSaldo());

        System.out.println("\n=== SKENARIO 1: PERCOBAAN TRANSFER MELEBIHI SALDO ===");
        // Transfer 150.000 padahal saldo rek1 hanya 100.000 (Gagal)
        rek1.transfer(150000, rek2);
        System.out.println("\n=== SKENARIO 2: TRANSFER BERHASIL ===");
        // Transfer 30.000 dari rek1 ke rek2 (berhasil)
        rek1.transfer(30000, rek2);

        System.out.println("\n=== SALDO AKHIR KEDUA REKENING ===");
        System.out.println("Saldo Akhir " + rek1.getNamaPemilik() + ": Rp " + rek1.getSaldo());
        System.out.println("Saldo Akhir " + rek2.getNamaPemilik() + ": Rp " + rek2.getSaldo());

        System.out.println("\n=== TOTAL REKENING YANG DIBUAT ===");
        // Mengakses static variable
        System.out.println("Total Rekening Terdaftar: " + RekeningBank.totalRekening);
    }
}