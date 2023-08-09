import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enther the number of products: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++){

            System.out.println("Product # " + i + " data:");
            System.out.print("Common, used or imported ?  (c/u/i)");
            char productType = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String nameProduct = sc.nextLine();
            System.out.print("Price: ");
            double priceProduct = sc.nextDouble();

            if ( productType == 'c'){

                Product product = new Product(nameProduct, priceProduct);
                list.add(product);
            }
            else if ( productType == 'i'){

                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();

                Product product = new ImportedProduct(nameProduct,priceProduct,customsFee);
                list.add(product);
            }
            else {

                System.out.println("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                Product product = new UsedProduct(nameProduct,priceProduct,date);
                list.add(product);
            }

        }

        System.out.println("");
        System.out.println("PRICE TAGS: ");
        for ( Product product : list){
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}