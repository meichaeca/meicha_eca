public class RekeningBank {
    // 01. ATRIBUT (Pastikan atribut noRekening terdefinisi di sini)
    private String noRekening;
    private String namaPemilik;
    private double saldo;

    // 02. STATIC VARIABLE
    public static int totalRekening = 0;

    // 03. CONSTRUCTOR
    public RekeningBank(String noRekening, String namaPemilik, double saldoAwal) {
        this.noRekening = noRekening;
        this.namaPemilik = namaPemilik;

        // Validasi saldo awal minimal Rp 50.000
        if (saldoAwal >= 50000) {
            this.saldo = saldoAwal;
        } else {
            System.out.println("ERROR: Saldo awal minimal Rp 50.000! Saldo diset ke 0.");
            this.saldo = 0;
        }

        totalRekening++;
    }

    // Getter untuk No Rekening
    public String getNoRekening() {
        return noRekening;
    }

    // Getter untuk Nama Pemilik
    public String getNamaPemilik() {
        return namaPemilik;
    }

    // 04. METHOD BISNIS
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("ERROR: Saldo tidak boleh negatif!");
        }
    }

    public void transfer(double nominal, RekeningBank tujuan) {
        if (nominal <= 0) {
            System.out.println("ERROR: Nominal transfer harus lebih dari 0!");
        } else if (this.saldo < nominal) {
            System.out.println("ERROR: Transfer gagal! Saldo " + this.namaPemilik + " tidak mencukupi.");
        } else {
            this.saldo -= nominal; // Diperbaiki dari 'nominall' menjadi 'nominal'
            tujuan.saldo += nominal;
            System.out.println("Transfer berhasil sebesar Rp " + nominal + " dari " + this.namaPemilik + " ke " + tujuan.getNamaPemilik());
        }
    }
}