package class_03;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] ages = new int [3];
        ages[0] = 20;
        ages[1] = 29;
        ages[2] = 1;

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            System.out.println("ages[" + i + "] = " + age);
        }

        int[] qtsCats = {1, 0, 3};

        for (int i = 0; i < qtsCats.length; i++) {
            int qtd = qtsCats[i];
            System.out.println("qtdCats[" + i + "] = " + qtd);
        }

        String[] names0 = new String[3];
        names0[0] = "Lucas";
        names0[1] = "Jayme";
        int qtdNames = 2;

        String[] names = {"Palombo", "Charles", "Lamas"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("name =  = " + names[i]);
        }
        
        for(String name : names){
            System.out.println("name = " + name);
        }

//        for (String name0 : names0) {
//            if (name0 == null) {
//                System.out.println("name0 = " + name0.replace("a", "A"));
//            }
//        }

        for (int i = 0; i < qtdNames; i++) {
            System.out.println("name = " + names0[i]);

        }
    }
}
