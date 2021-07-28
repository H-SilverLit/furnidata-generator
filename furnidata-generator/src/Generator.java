import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Generator {
    public static void main(String[] args) throws InterruptedException {
        Scanner reader = new Scanner(System.in);
        while (true) {

            System.out.println("Input the furni ID (input only numbers here).");
            String furniID = reader.nextLine();

            System.out.println("Input the furni's file name (without '.swf'. You can input numbers, letters and underscores here).");
            String furniFileName = reader.nextLine();

            System.out.println("Input the furni's revision (input only numbers here).");
            String furniRevision = reader.nextLine();

            System.out.println("Input the furni's name (this will be the name that it will display when you click on the furni in a room or in your inventory).");
            String furniName = reader.nextLine();

            System.out.println("Input the furni's description (this will be displayed under the furni's name).");
            String furniDescription = reader.nextLine();

            System.out.println("Input the furni's furniline. This is just a name for a group of furnis that belong to the same collection. For example you can input 'custom' (without quotation marks).");
            String furniLine = reader.nextLine();

            System.out.println("Generating your furnidata...");

            TimeUnit.SECONDS.sleep(1); // This is for giving the user some time to understand what's happening instead of just suddenly printing the entire .xml container
            
            System.out.println(" ");
            System.out.println("<furnitype id=\"" + furniID + "\"" + " classname=\"" + furniFileName + "\"" + ">");
            System.out.println("<revision>" + furniRevision + "</revision>");
            System.out.println("<xdim>1</xdim>");
            System.out.println("<ydim>1</ydim>");
            System.out.println("</partcolors>");
            System.out.println("<name>" + furniName + "</name>");
            System.out.println("<description>" + furniDescription + "</description>");
            System.out.println("</adurl");
            System.out.println("<offerid>-1</offerid>");
            System.out.println("<buyout>0</buyout>");
            System.out.println("<rentofferid>-1</rentofferid>");
            System.out.println("<rentbuyout>0</rentbuyout>");
            System.out.println("<bc>0</bc>");
            System.out.println("<excludeddynamic>0</excludeddynamic>");
            System.out.println("<customparams/>");
            System.out.println("<specialtype>1</specialtype>");
            System.out.println("<canstandon>0</canstandon>");
            System.out.println("<cansiton>0</cansiton>");
            System.out.println("<canlayon>0</canlayon>");
            System.out.println("<furniline>" + furniLine + "</furniline>");
            System.out.println("</furnitype>");
            System.out.println(" ");

            System.out.println("Do you want to generate another furnidata? (YES/NO)");
            String confirmation = reader.nextLine();

            if (confirmation.equals("NO")) {
                System.out.println("Furnidata generator has been stopped.");
                break;
            } else if (confirmation.equals("No")) {
                System.out.println("Furnidata generator has been stopped.");
                break;
            } else if (confirmation.equals("no")) {
                System.out.println("Furnidata generator has been stopped.");
                break;
            }
        }
    }
}
