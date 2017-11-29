
/**
 * Write a description of class Menu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MenuItems
{
    public String itemName="";
    public int cost=0;
    public String description="";
    public String size="";
    /**
     * Constructor for objects of class MenuItems
     */
    public MenuItems(String itemName,int cost,String des, String size){
        this.itemName=itemName;
        this.cost=cost;
        this.description=des;
    }
    
    public void setItemName(String name){
        itemName=name;
    }
    
    public void setCost(int cost){
        cost=cost;
    }
    
    public void setDescription(String des){
        description=des;
    }
    
    public void setSize(int size){
        size=size;
    }
    
    public String getItemName(){
        return itemName;
    }
    
    public int getCost(){
        return cost;
    }
    
    public String getDescription(){
        return description;
    }
    
    public String setSize(){
        return size;
    }
}
