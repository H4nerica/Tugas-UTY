import java.util.Scanner;
//5231011045

public class test {
	
	
public static void main(String[] args) 
{ 
	int input, struk=0, uang=0, beli=0, totalbeli=0, totalharga=0, kembalian=0;
	
	Scanner s = new Scanner(System.in);
	int[] baris1 = {150000,8};
	int[] baris2 = {150000,8};
	int[] baris3 = {150000,8};
	String[] merek = {"Converse","vans","3Paloski"};

	while (true) {
	System.out.println("");
	System.out.println("|1.Lihat  |2.Edit  |3.Ganti(Harga-Stok)  |4.Beli");
	input = s.nextInt();
	s.nextLine(); //clear buffer

//pilihan pertama
	switch(input){

	case 1:
	menu();
	data(merek, baris1, baris2, baris3); 
	break;

 //Edit
	case 2:
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

//Tambah Harga-Stok
	case 3:
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

//pembelian dan struk
	case 4:
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

	default:
	System.out.println("Error");
	break;
	}
	}

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

}
