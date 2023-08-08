package org.example.pageObject;

    public class class2 {

        public static void main(String[] args) {
            String jamMasuk = "10:00";
            String jamKeluar = "22:12";
            int biayaAwal = 2000;
            int biayaPerjam = 500;

            String z = jamMasuk.substring(0, jamMasuk.length() - 3);
            String x = jamMasuk.substring(3, jamMasuk.length() - 0);

            String y = jamKeluar.substring(0, jamKeluar.length() - 3);
            String v = jamKeluar.substring(3, jamKeluar.length() - 0);

            int xmasuk = Integer.parseInt(x);
            int vkeluar = Integer.parseInt(v);

            int finalJamMasuk = Integer.parseInt(y) - Integer.parseInt(z) ;
            int finalJamKeluar = Integer.parseInt(x) - Integer.parseInt(v);

            int ac;
            if (xmasuk < vkeluar) {
                 ac = -1;
            }
            else{
                ac = 0;
            }

            int finalJamKeluar2 = finalJamMasuk + ac ;
            long biayaHarian = (long) (finalJamKeluar2 - 2) * biayaPerjam + biayaAwal;

            if(finalJamKeluar2 <= 2){
                System.out.print("Biaya Parkirnya  : Rp."+ biayaAwal);
            }
            else {
                System.out.println("Biaya Parkirnya  : Rp."+ biayaHarian);
            }
        }
    }