

public class Main {
    public static void main(String[] args) throws Exception {

        Contact[] friends= new Contact[7];

        friends[0]= new Contact("Sergio", "Mendez", "123456789");
        friends[1]= new Contact("Juan", "López", "123456799");
        friends[2]= new Contact("Ivan", "Valencia", "123453389");
        friends[3]= new Contact("Rocio", "Saldaña", "1555556789");
        friends[4]= new Contact("Pedro", "Martinez", "1289999989");
        friends[5]= new Contact("Diana", "Martinez", "1258744444");
        friends[6]= new Contact("Luis", "Perez", "5887422584");

        SortingAndSearch<Contact> lista= new SortingAndSearch<>();

        //Ordenamiento (Nota: Seleccion, insercion y burbuja )
        lista.insertionSort(friends);

        for(int index=0; index<friends.length; index++){
            System.out.println(friends[index]);
        }

        //Busqueda
        System.out.println(lista.lineaSearch(friends, 0, 6, 
        new Contact("Yedid", "Curioca", "25874125")));




            



    
    }
    
}
