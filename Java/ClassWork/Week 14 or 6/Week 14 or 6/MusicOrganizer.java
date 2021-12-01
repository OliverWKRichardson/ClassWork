import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    public void checkIndex(int indexToCheck)
    {
        if(files.size() != 0)
        {
            if(indexToCheck >= files.size() || indexToCheck < 0)   
            {
                System.out.println("Error Invalid Index,     Valid Range Is: 0 - "+(files.size()-1));
            }
        }
        else
        {
            System.out.println("Error, List Is Empty");
        }
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    public void listAllFiles()
    {
        int position = 0;        
        for(String file : files)
        {
            System.out.println(position + ": " + file);
            position++;
        }
    }
    
    /**
    * List the names of files matching the given search string.
    * @param searchString The string to match.
    */
    public void listMatching(String searchString)
    {
        boolean notFound = true;
        for(String filename : files) 
        {
            if(filename.contains(searchString)) 
            {
                // A match.
                System.out.println(filename);
                notFound = false;
            }
        }
        if(notFound)
        {
            System.out.println("File was not found");
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }
}
