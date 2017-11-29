/**
 * Interface for UserRecord
 */
public interface UserRecord
{
    /**
     * Get the pass key for a record. 
     * @return record's pass key
     */
    public String getPassKey();
    
    /**
     * Get the type of record. 
     * @return record's pass key
     */
    public String getUserType();
    
    /**
     * Convert object data to text for storage in text file. 
     *   This method will be automatically invoked
     *   by a method of another class when the objects are written to a file.
     * @return all attributes of object separated by commas
     */
    public String toCSVText();
}
