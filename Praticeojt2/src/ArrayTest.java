import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		int productId;
		String productName;
		int quantity;
		
		System.out.println("methioned the size of array ?");
		Scanner scanner = new Scanner(System.in);

		int size = scanner.nextInt();
		Product [] product = new Product[size];
		
		for(int i=0;i<=product.length;i++) {
			System.out.println("productName, productId, quantity");
			productName = scanner.next();
			productId = scanner.nextInt();
			quantity =scanner.nextInt();
			product [i]  = new Product(productId,productName,quantity);
		}
		int max = 0;
		Product maxQuantity = null;
		
		for (Product product2 : product) {
			if(product2.quantity>max) {
				max = product2.quantity;
				maxQuantity = product2; 
			}else {
				System.out.println();
			}
			
		
		}
		
		System.out.println(maxQuantity);
	}
	
}
