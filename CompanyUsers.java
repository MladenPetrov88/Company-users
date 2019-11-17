import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companyID = new TreeMap<>();

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] temp = command.split(" -> ");
            String company = temp[0];
            String ID = temp[1];
            if(!companyID.containsKey(company)){
                companyID.put(company, new ArrayList<>());
                companyID.get(company).add(ID);
            } else {
                if (!companyID.get(company).contains(ID)) {
                    companyID.get(company).add(ID);
                }
            }


            command = scanner.nextLine();
        }

       companyID
               .entrySet()
               .stream()
               .forEach(entry -> {
                   System.out.println(entry.getKey());
                   entry.getValue()
                           .forEach(x -> System.out.printf("-- %s%n", x));
               });


    }
}
