import java.util.ArrayList;


public class House extends Building {
  private ArrayList<String> residents; 
  private boolean hasDiningRoom;


  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<String>();
  }
  
  public boolean hasDiningRoom(){
    if (hasDiningRoom == true){
      return true;
    } else{
      return false;
    }
  }

  public int nResidents(){
    return this.residents.size();
  }

  public void moveIn(String name){
    residents.add(name);
  }

  public String moveOut(String name){
    residents.remove(name);
    return name;
  }

  public boolean isResident(String person){
    if (residents.contains(person)){
      System.out.println("yes, " + person + " is a resident");
      return true;
    } else{
      System.out.println("no, " + person + " is not a resident");
      return false;
    }
  }


}
