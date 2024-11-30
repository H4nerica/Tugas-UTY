package Karyawan;

public class Karyawan {
public String NamaLengkap;
public String Pendidikan;
public String Status;
public int ThnMasuk; 

public Karyawan(String N, String P, String S, int T){
    NamaLengkap = N;
    Pendidikan = P;
    Status = S;
    ThnMasuk = T; 

} 

private int hitungmasakerja(int T){
    return (2017-T);
}


public class demo{
public static void main(String[] args) {

    Karyawan k1 = new Karyawan("joni john", "s1", "kontrak", 2012);
}}

public void ubah(String N){
    NamaLengkap = N;
}

public void ubah(String N, String P){
    NamaLengkap = N;
    Pendidikan = P;
}

public double GajiPokok (String S){
       double Gapok = 0;

       if(S.equals("Tetap"))
           Gapok = 3500000;
       else if(S.equals("Kontrak"))
           Gapok = 500000;
       return Gapok;
   }

public class karyawantetapsub extends Karyawan{
    String NIP;
    int jatahcuti;
}

public void SetNip(String nip){
    NIP = nip;
}

public double hittunjangan(int T){
    int MK = hitungmasakerja(T);
    double Tunjangan;

    if(MK>=5)
    Tunjangan = 2500000;
    else if(MK>=10)
    Tunjangan = 5000000;
    else Tunjangan = 10000000;

    return Tunjangan;
}

public int tampiljatahcuti(){
    return jatahcuti;
}

}
