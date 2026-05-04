package assignment10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Mobile
{
	String brand;
	String model;
	int price;
	
	Mobile(String brand,String model,int price)
	{
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	void print() 
	{
		System.out.println(brand+" "+model+" "+price);
	}
}

public class Program_MobileStore {

	public static void main(String[] args) {
		ArrayList<Mobile> list=new ArrayList<>();
		list.add(new Mobile("Samsung","S23",70000));
		list.add(new Mobile("Apple","iphone15",80000));
		list.add(new Mobile("Oneplus","12",60000));
		list.add(new Mobile("Vivo","V30",35000));
		list.add(new Mobile("Realme","GT",30000));
		
		
        System.out.println("Original Mobiles:");
        for (Mobile m : list) {
            m.print();
        }

        
        Collections.sort(list, new Comparator<Mobile>() {
            public int compare(Mobile m1, Mobile m2) {
                return m2.price - m1.price;
            }
        });

        System.out.println("\nAfter Sorting Descending:");
        for (Mobile m : list) {
            m.print();
        }

        
        list.remove(0);

        System.out.println("\nAfter Removing Most Expensive Mobile:");
        for (Mobile m : list) {
            m.print();
        }

        
        String searchBrand = "Vivo";
        boolean found = false;

        for (Mobile m : list) {
            if (m.brand.equalsIgnoreCase(searchBrand)) {
                System.out.println("\nBrand Found: " + m.brand);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nBrand Not Found");
        }

        
        for (Mobile m : list) {
            if (m.brand.equalsIgnoreCase("Samsung")) {
                m.price = 68000;
            }
        }

      
        System.out.println("\nAfter Price Update:");
        for (Mobile m : list) {
            m.print();
        }
    }
}
