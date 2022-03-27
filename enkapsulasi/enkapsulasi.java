public class enkapsulasi {
    private int angka;
    // Constructor untuk Set Angka
   public enkapsulasi(){
       this.angka = 5;
   }

//    Method Cek Bilangan
   String cekBilangan() {
    if (this.angka % 2 == 0 && this.angka > 0) {
      return "Bilangan Positif Genap";
    } else if (this.angka % 2 == 0 && this.angka < 0) {
      return "Bilangan Negatif Ganjil";
    } else if (this.angka % 2 != 0 && this.angka > 0) {
      return "Bilangan Positif Ganjil";
    } else if (this.angka % 2 != 0 && this.angka < 0) {
      return "Bilangan Negatif Ganjil";
    }
    return "Keliruu";
  }

//   getter angka
  int getAngka (){
   return this.angka;
  } 
//    

}
