import java.util.ArrayList;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    ArrayList<Membership> members;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        members = new ArrayList<Membership>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }
    
    /**
    * Determine the number of members who joined in the
    * given month.
    * @param month The month we are interested in.
    * @return The number of members who joined in month.
    */
    public int joinedInMonth(int month)
    {
        boolean error = false;
        if(month < 1)
        {
            error = true;
        }
        if(month > 12)
        {
            error = true;
        }
        if(!error)
        {
            int count = 0;
            for (Membership member : members) 
            { 
                if(member.getMonth() == month)
                {
                    count++;
                }
            }
            return count;
        }
        else
        {
            System.out.println("Error Invalid Month");
            return 0;
        }
    }
}
