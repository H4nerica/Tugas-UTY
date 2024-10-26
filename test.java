import java.util.Scanner;
//5231011045

public class test {
	
	
public static void main(String[] args) 
{ 
	int input, kas=0;
	
	Scanner s = new Scanner(System.in);
	int[] baris1 = {150000,8};
	int[] baris2 = {150000,8};
	int[] baris3 = {150000,8};
	String[] merek = {"Converse","vans","3Paloski"};

	while (true) {
	System.out.println("");
	System.out.println("|1.Lihat  |2.Edit  |3.Ganti(Harga-Stok)");
	input = s.nextInt();

	switch(input){

	case 1:
	menu();
	data(merek, baris1, baris2, baris3); 
	break;

	case 2: //Edit
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


	case 3://Tambah Harga-Stok
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
