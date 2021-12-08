import java.util.Scanner;

class Decryptinator{

	public static void main(String[] args){
		
		//decrypt()
		System.out.println("Enter the message to decrypt : ");
		Scanner sc = new Scanner(System.in);
		String code = sc.nextLine();
		sc.close();
		String secret = code.replace(" ","")
.replace("A","69")
.replace("a","69")
.replace("E","75")
.replace("e","75")
.replace("I","80")
.replace("i","80")
.replace("O","85")
.replace("o","85")
.replace("U","88")
.replace("u","88")
.replace("!","%")
.replace("@","%")
.replace("#","%")
.replace("$","%")
.replace("^","%")
.replace("&","%")
.replace("*","%")
.replace("(","%")
.replace(")","%")
.replace("_","%")
.replace("-","%")
.replace("!","%")
.replace("=","%")
.replace("+","%");
		System.out.println(secret);
	}		
}

