import java.util.Hashtable;

/* This is a stub for the Library class */
public class Library extends Building {
  private Hashtable<String, Boolean> collection;

  public Library(String name, String address, int nFloors){
    super(name, address, nFloors);
    this.collection = new Hashtable<String, Boolean>();
  } 
  public void addTitle(String title){
    this.collection.put(title, true);
  }

public String removeTitle(String title){
  try{
  this.collection.remove(title);
  return title;
  }catch (Exception e){
    return "title not found. unable to remove.";
  }
}
  public void checkOut(String title){
    this.collection.replace(title, true, false);
  }
  public void returnBook(String title){
    this.collection.replace(title, false, true);
  }

  public boolean containsTitle(String title){
    return this.collection.contains(title);
  }

  public boolean isAvailable(String title){
    return this.collection.get(title);
  }
  public void printCollection(){
    for(String title: this.collection.keySet()){
      System.out.println(title + this.collection.get(title));
    }
  }

}