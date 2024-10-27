import java.util.Scanner;


public class test {
	
	
public static void main(String[] args) 
{ 
	int input, struk=0, uang=0, beli=0, totalbeli=0, totalharga=0, kembalian=0,pemasukan=0;
	int login_input;
	boolean exitPenjual = false;
	boolean exituser = false;
	Scanner s = new Scanner(System.in);
	int[] baris1 = {150000,8};
	int[] baris2 = {186000,3};
	int[] baris3 = {100000,7};
	int[] baris4 = {90000,2};
	String[] merek = {"Converse","vans","3Paloski","Naiki"};

	
	while(true){
//Login Page
	System.out.println("|1. User  |2.Penjual");
	login_input = s.nextInt();
	s.nextLine(); //clear buffer	
//login user or penjual
	switch(login_input){

	case 1: //pembeli
	exituser = false; //reset the flag
	while (!exituser) {
	System.out.println("");
	System.out.println("|1.Lihat  |2.Beli  |3.Exit");
	input = s.nextInt();
	s.nextLine(); //clear buffer

//pilihan pertama
	switch(input){

	case 1:
	menu();
	data(merek, baris1, baris2, baris3); 
	break;

//pembelian dan struk
	case 2:
	System.out.println("|1-2-3 ?"); //Asking which row	
	input = s.nextInt();
	s.nextLine();
	switch (input)
	{ 
	case 1: //Baris 1
	System.out.print("Uang : "); uang = s.nextInt();
	System.out.print("Beli Berapa ? : "); beli = s.nextInt();
	totalbeli = uang*beli;
	totalharga = baris1[0]*beli;
	if(totalbeli==totalharga){
	System.out.println("|Total : "+totalbeli+" [Lunas]");}
	else if(totalbeli>totalharga){
	kembalian = totalbeli-totalharga; 
	System.out.println("|Total : "+totalbeli+" |Kembalian : "+kembalian);}
	else{System.out.println("Uang Kurang!!");};
	break;

	case 2: //Baris 1
	System.out.print("Uang : "); uang = s.nextInt();
	System.out.print("Beli Berapa ? : "); beli = s.nextInt();
	totalbeli = uang*beli;
	totalharga = baris2[0]*beli;
	if(totalbeli==totalharga){
	System.out.println("|Total : "+totalbeli+" [Lunas]");}
	else if(totalbeli>totalharga){
	kembalian = totalbeli-totalharga; 
	System.out.println("|Total : "+totalbeli+" |Kembalian : "+kembalian);}
	else{System.out.println("Uang Kurang!!");};
	break;

	case 3: //Baris 3
	System.out.print("Uang : "); uang = s.nextInt();
	System.out.print("Beli Berapa ? : "); beli = s.nextInt();
	totalbeli = uang*beli;
	totalharga = baris3[0]*beli;
	if(totalbeli==totalharga){
	System.out.println("|Total : "+totalbeli+" [Lunas]");}
	else if(totalbeli>totalharga){
	kembalian = totalbeli-totalharga; 
	System.out.println("|Total : "+totalbeli+" |Kembalian : "+kembalian);}
	else{System.out.println("Uang Kurang!!");};
	break;

	default:
	System.out.println("Error");
	break;
	}break;

//exit menu to login
	case 3:
	exituser = true; 
	break;

	default://default menu
	System.out.println("Error");
	break;
	}}break;//menu

//penjual 
	case 2:
	exitPenjual = false;
	System.out.println("Login Sebagai Penjual");
	login_input=0; //reset the input value
	while (!exitPenjual) {
	System.out.println("|1.Lihat  |2.Tambah harga |3.Edit  |4.Riwayat  |5.Exit"); //Asking which row
	login_input = s.nextInt();
	s.nextLine();
	switch(login_input){
	
	case 1:
	menu();
	data(merek, baris1, baris2, baris3); 
	break;

//Tambah Harga-Stok
	case 2:
	input=0; //reset the input value
	System.out.println("|1-2-3 ?"); //Asking which row
	input = s.nextInt();
	s.nextLine();
	switch (input)
	{ 
	case 1: //Baris 1
	System.out.print("Harga : "); baris1[0] = s.nextInt();
	System.out.print("Stok : "); baris1[1] = s.nextInt();
	break;
	case 2: //Baris 2
	System.out.print("Harga : "); baris2[0] = s.nextInt();
	System.out.print("Stok : "); baris2[1] = s.nextInt();
	break;
	case 3: //Baris 3
	System.out.print("Harga : "); baris3[0] = s.nextInt();
	System.out.print("Stok : "); baris3[1] = s.nextInt();
	break;
	default:
	System.out.println("Error");
	break;
	}break;
//tambah akhir

 //Edit
	case 3:
	input=0; //reset the input value
	System.out.println("|1-2-3 ?"); //Asking which row
	input = s.nextInt(); 
	s.nextLine();
	switch (input)
	{ 
	case 1: //Baris 1
	System.out.print("Merek : "); merek[0] = s.nextLine();
	System.out.print("Harga : "); baris1[0] = s.nextInt();
	System.out.print("Stok : "); baris1[1] = s.nextInt();
	break;
	case 2: //Baris 2
	System.out.print("Merek : "); merek[1] = s.nextLine();
	System.out.print("Harga : "); baris2[0] = s.nextInt();
	System.out.print("Stok : "); baris2[1] = s.nextInt();
	break;
	case 3: //Baris 3
	System.out.print("Merek : "); merek[2] = s.nextLine();
	System.out.print("Harga : "); baris3[0] = s.nextInt();
	System.out.print("Stok : "); baris3[1] = s.nextInt();
	break;
	default:
	System.out.println("Error");
	break;
	}break;
//end of edit

//riwayat
	case 4:
	System.out.println("Riwayat Penjualan :");
	pemasukan = pemasukan+totalharga;
	System.out.println("Pemasukan :"+pemasukan);
	break;
//end of riwayat

	case 5:
	exitPenjual = true; // Set the flag to exit
	break;

	default:
	System.out.println("Error");
	break;
	}}break;
//end of penjual

	default:
	System.out.println("Error");
	break;
	}}//login

}
//Menu 
	static void menu() 
	{
	System.out.printf("Toko Sepatu Pak Agus");
	System.out.println(""); 
	System.out.printf("| %-12s | %-12s | %-12s |%n", "Merek", "Harga", "Stok");
	}

	static void data(String[] merek, int[] baris1, int[] baris2, int[] baris3)
	{
	System.out.printf("| %-12s | %-12s | %-12s |%n", merek[0], baris1[0], baris1[1]);
	System.out.printf("| %-12s | %-12s | %-12s |%n", merek[1], baris2[0], baris2[1]);
	System.out.printf("| %-12s | %-12s | %-12s |%n", merek[2], baris3[0], baris3[1]);
	System.out.println("");
	}

	static void riwayat(){
	System.out.printf("Toko Sepatu Pak Agus");
	System.out.println(""); 
	System.out.printf("| %-12s | %-12s | %-12s |%n", "Merek", "Harga", "Stok");
	System.out.println("");
	}

}
