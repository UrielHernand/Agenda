public class Contact {
    private String firsName, lastName, phone;

    public Contact(String firsName, String lastName, String phone ){

        this.firsName=firsName;
        this.lastName=lastName;
        this.phone=phone;

    }

    
    public String toString(){
        return lastName+"."+firsName+"\t"+phone;
    }

    public int compareTo(Object o){
        int result;

        if (lastName.equals(((Contact)o).lastName)){

            result=firsName.compareTo(((Contact)o).firsName);

        }else {
            result=lastName.compareTo(((Contact)o).lastName);

        }

        return result;

        
    }

}
