import java.util.HashMap;

public class Phonebook {
   private HashMap<String, Integer> phonebook=new HashMap<>();
    public Phonebook(){
        // phonebook=new HashMap<>();
        // HashMap<String,Integer> phonebook=new HashMap<>();
       phonebook.put("nest",100);
       phonebook.put("alice",964394924);
       
    }
    public void find(String name){
if(phonebook.containsKey(name)){

    System.out.println(phonebook.get(name));
}
else{
    System.out.println("do not present");
}
    }
    
    public static void main(String[] args){
        
    Phonebook pb=new Phonebook();
    pb.find("nest");
    
        


    }
}
