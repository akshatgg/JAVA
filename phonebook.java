import java.util.HashMap;

public class phonebook {
   public HashMap<String, Integer> phonebook;
    public static void phonebook(){
        HashMap<String,Integer> phonebook=new HashMap<>();
       phonebook.put("nest",100);
       phonebook.put("alice",964394924);
       
    }
    public void find(String name){
if(phonebook.containsKey(name)){

    System.out.println(phonebook.get(name));
}
    }
    
    public static void main(String[] args){
        phonebook();
    phonebook pb=new phonebook();
    pb.find("nest");
    
        


    }
}
