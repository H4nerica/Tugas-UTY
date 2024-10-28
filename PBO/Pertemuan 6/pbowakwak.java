import java.util.Scanner;
import java.util.Arrays;

public class pbowakwak {
	
public static void main(String[] args) 
{ 
	int input, nota=0, duit=0, tuku=0, totaltuku=0, harga_total=0, kembalian=0, masuk=0;
	int member, totalterjual;
	double diskon, diskon_mem=0.0, total_mem;
	int login_input;
	boolean keluarpenjual = false;
	boolean keluaruser = false;
	Scanner s = new Scanner(System.in);
	int[] data1 = {180000,50}; int[] data2 = {120000,10}; int[] data3 = {110000,70}; int[] data4 = {75000,20};
	String[] nama_sepatu = {"Adios","Ivan","Gucci","Nikke-nike"};

	
	while(true){
	System.out.println("|Toko Pak ANIS");	
	System.out.println("|1. Pemtuku  |2.Admin Shoopee");
	login_input = s.nextInt();
	s.nextLine(); 	
	switch(login_input){
	case 1: 
	keluaruser = false; 
	while (!keluaruser) {
	System.out.println("");
	System.out.println("|1.Lihat  |2.tuku  |3.Termurah  |4.Termahal  |5.Keluar");
	input = s.nextInt();
	s.nextLine(); 


	switch(input){
	case 1:
	menu();
	data(nama_sepatu, data1, data2, data3, data4); 
	break;

	case 2:
	System.out.println("|Member n/y 1-2 ?");
	input = 0;
	input = s.nextInt();
	if(input==1){diskon_mem=0.0;}
	else {diskon_mem=0.03;}

	System.out.println("|1,2,3,4 ?"); 	
	input = s.nextInt();
	s.nextLine();
	switch (input)
	{ 
	case 1: 
	System.out.print("duit : "); duit = s.nextInt();
	System.out.print("tuku Berapa ? : "); tuku = s.nextInt();

	totaltuku = duit*tuku;
	harga_total = data1[0]*tuku;
	if(totaltuku==harga_total){
	System.out.println("|Total : "+totaltuku+" [Lunas]");}
	else if (tuku==4){
	diskon = 0.05*harga_total; harga_total -= diskon;
	total_mem = diskon_mem*harga_total; harga_total -= total_mem;
	System.out.println("|Total : "+harga_total);}
	else if (tuku==20){
	diskon = 0.10*harga_total; harga_total -= diskon;
	total_mem = diskon_mem*harga_total; harga_total -= total_mem;
	System.out.println("|Total : "+harga_total);}
	else if(totaltuku>harga_total){
	kembalian = totaltuku-harga_total; 
	System.out.println("|Total : "+totaltuku+" |Kembalian : "+kembalian);}
	else{System.out.println("duit Kurang!!");};
	data1[1] -= tuku; //kurangin setok
	break;

	case 2:
	System.out.print("duit : "); duit = s.nextInt();
	System.out.print("tuku Berapa ? : "); tuku = s.nextInt();

	totaltuku = duit*tuku;
	harga_total = data2[0]*tuku;
	if(totaltuku==harga_total){
	System.out.println("|Total : "+totaltuku+" [Lunas]");}
	else if (tuku==4){
	diskon = 0.05*harga_total; harga_total -= diskon;
	total_mem = diskon_mem*harga_total; harga_total -= total_mem;
	System.out.println("|Total : "+harga_total);}
	else if (tuku==20){
	diskon = 0.10*harga_total; harga_total -= diskon;
	total_mem = diskon_mem*harga_total; harga_total -= total_mem;
	System.out.println("|Total : "+harga_total);}
	else if(totaltuku>harga_total){
	kembalian = totaltuku-harga_total; 
	System.out.println("|Total : "+totaltuku+" |Kembalian : "+kembalian);}
	else{System.out.println("duit Kurang!!");};
	data2[1] -= tuku; //kurangin setok
	break;

	case 3: 
	System.out.print("duit : "); duit = s.nextInt();
	System.out.print("tuku Berapa ? : "); tuku = s.nextInt();

	totaltuku = duit*tuku;
	harga_total = data3[0]*tuku;
	if(totaltuku==harga_total){
	System.out.println("|Total : "+totaltuku+" [Lunas]");}
	else if (tuku==4){
	diskon = 0.05*harga_total; harga_total -= diskon;
	total_mem = diskon_mem*harga_total; harga_total -= total_mem;
	System.out.println("|Total : "+harga_total);}
	else if (tuku==20){
	diskon = 0.10*harga_total; harga_total -= diskon;
	total_mem = diskon_mem*harga_total; harga_total -= total_mem;
	System.out.println("|Total : "+harga_total);}
	else if(totaltuku>harga_total){
	kembalian = totaltuku-harga_total; 
	System.out.println("|Total : "+totaltuku+" |Kembalian : "+kembalian);}
	else{System.out.println("duit Kurang!!");};
	data3[1] -= tuku; //kurangin setok
	break;

	case 4:
	System.out.print("duit : "); duit = s.nextInt();
	System.out.print("tuku Berapa ? : "); tuku = s.nextInt();

	totaltuku = duit*tuku;
	harga_total = data4[0]*tuku;
	if(totaltuku==harga_total){
	System.out.println("|Total : "+totaltuku+" [Lunas]");}
	else if (tuku==4){
	diskon = 0.05*harga_total; harga_total -= diskon;
	total_mem = diskon_mem*harga_total; harga_total -= total_mem;
	System.out.println("|Total : "+harga_total);}
	else if (tuku==20){
	diskon = 0.10*harga_total; harga_total -= diskon;
	total_mem = diskon_mem*harga_total; harga_total -= total_mem;
	System.out.println("|Total : "+harga_total);}
	else if(totaltuku>harga_total){
	kembalian = totaltuku-harga_total; 
	System.out.println("|Total : "+totaltuku+" |Kembalian : "+kembalian);}
	else{System.out.println("duit Kurang!!");};
	data4[1] -= tuku; //kurangin setok
	break;

	default:
	System.out.println("Salah");
	break;
	}break;

	case 3:
	dari_termurah(nama_sepatu, data1, data2, data3, data4); 	
	break;

	case 4:
	dari_termahal(nama_sepatu, data1, data2, data3, data4); 	
	break;

	case 5:
	keluaruser = true; 
	break;

	default:
	System.out.println("Salah");
	break;
	}}break;


	case 2:
	keluarpenjual = false;
	System.out.println("Login Sebagai Penjual");
	login_input=0; 
	while (!keluarpenjual) {
	System.out.println("|1.Lihat  |2.Tambah harga |3.Edit  |4.history  |5.Exit"); 
	login_input = s.nextInt();
	s.nextLine();
	switch(login_input){
	
	case 1:
	menu();
	data(nama_sepatu, data1, data2, data3, data4); 
	break;

	case 2:
	input=0; 
	System.out.println("|1,2,3,4 ?"); 
	input = s.nextInt();
	s.nextLine();
	switch (input)
	{ 
	case 1: 
	System.out.print("Harga : "); data1[0] = s.nextInt(); System.out.print("Stok : "); data1[1] = s.nextInt();
	break;
	case 2: 
	System.out.print("Harga : "); data2[0] = s.nextInt(); System.out.print("Stok : "); data2[1] = s.nextInt();
	break;
	case 3: 
	System.out.print("Harga : "); data3[0] = s.nextInt(); System.out.print("Stok : "); data3[1] = s.nextInt();
	break;
	case 4: 
	System.out.print("Harga : "); data4[0] = s.nextInt(); System.out.print("Stok : "); data4[1] = s.nextInt();
	break;
	default:
	System.out.println("Salah");
	break;
	}break;

	case 3:
	input=0; 
	System.out.println("|Yang baris mana 1-2-3 ?"); 
	input = s.nextInt(); 
	s.nextLine();
	switch (input)
	{ 
	case 1: 
	System.out.print("nama_sepatu : "); nama_sepatu[0] = s.nextLine();
	System.out.print("Harga : "); data1[0] = s.nextInt();
	System.out.print("Stok : "); data1[1] = s.nextInt();
	break;
	case 2: 
	System.out.print("nama_sepatu : "); nama_sepatu[1] = s.nextLine();
	System.out.print("Harga : "); data2[0] = s.nextInt();
	System.out.print("Stok : "); data2[1] = s.nextInt();
	break;
	case 3: 
	System.out.print("nama_sepatu : "); nama_sepatu[2] = s.nextLine();
	System.out.print("Harga : "); data3[0] = s.nextInt();
	System.out.print("Stok : "); data3[1] = s.nextInt();
	break;
	case 4: 
	System.out.print("nama_sepatu : "); nama_sepatu[3] = s.nextLine();
	System.out.print("Harga : "); data4[0] = s.nextInt();
	System.out.print("Stok : "); data4[1] = s.nextInt();
	break;
	default:
	System.out.println("Salah");
	break;
	}break;

	case 4:
	System.out.println("history Penjualan :");
	masuk = masuk+harga_total;
	System.out.println("masuk :"+masuk);
	break;

	case 5:
	keluarpenjual = true;
	break;

	default:
	System.out.println("Salah");
	break;
	}}break;

	default:
	System.out.println("Salah");
	break;
	}}

}
	static void menu() 
	{
	System.out.println("|Toko Pak ANIS");	
	System.out.println(""); 
	System.out.printf("| %-16s | %-16s | %-16s |%n", "nama_sepatu", "Harga", "Stok");
	}

	static void data(String[] nama_sepatu, int[] data1, int[] data2, int[] data3, int[] data4)
	{
	System.out.printf("| %-16s | %-16s | %-16s |%n", nama_sepatu[0], data1[0], data1[1]);
	System.out.printf("| %-16s | %-16s | %-16s |%n", nama_sepatu[1], data2[0], data2[1]);
	System.out.printf("| %-16s | %-16s | %-16s |%n", nama_sepatu[2], data3[0], data3[1]);
	System.out.printf("| %-16s | %-16s | %-16s |%n", nama_sepatu[3], data4[0], data4[1]);
	System.out.println("");
	}

	static void history(){
	System.out.println("|Toko Pak ANIS");	
	System.out.println(""); 
	System.out.printf("| %-16s | %-16s | %-16s |%n", "nama_sepatu", "Harga", "Stok");
	System.out.println("");
	}

	static void dari_termurah(String[] nama_sepatu, int[] data1, int[] data2, int[] data3, int[] data4)
	{
	System.out.printf("| %-16s | %-16s | %-16s |%n", nama_sepatu[3], data4[0], data4[1]);
	System.out.printf("| %-16s | %-16s | %-16s |%n", nama_sepatu[2], data3[0], data3[1]);
	System.out.printf("| %-16s | %-16s | %-16s |%n", nama_sepatu[0], data1[0], data1[1]);
	System.out.printf("| %-16s | %-16s | %-16s |%n", nama_sepatu[1], data2[0], data2[1]);
	System.out.println("");
	}
	static void dari_termahal(String[] nama_sepatu, int[] data1, int[] data2, int[] data3, int[] data4)
	{
	System.out.printf("| %-16s | %-16s | %-16s |%n", nama_sepatu[1], data2[0], data2[1]);
	System.out.printf("| %-16s | %-16s | %-16s |%n", nama_sepatu[0], data1[0], data1[1]);
	System.out.printf("| %-16s | %-16s | %-16s |%n", nama_sepatu[2], data3[0], data3[1]);
	System.out.printf("| %-16s | %-16s | %-16s |%n", nama_sepatu[3], data4[0], data4[1]);
	System.out.println("");
	}

}
