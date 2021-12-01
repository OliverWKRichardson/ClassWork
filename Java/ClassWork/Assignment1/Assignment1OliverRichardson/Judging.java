
/**
 * Assignment 1 main class
 *
 * @author Oliver Richardson
 * @version 12/10/21
 */
public class Judging
{
    private int votes;
    private int judges;
    private String name;

    public Judging(String setName)
    {
        votes = 0;
        judges = 0;
        name = setName;
    }

    public int getVotes()
    {
        return votes;
    }

    public int getJudges()
    {
        return judges;
    }

    public String getName()
    {
        return name;
    }

    public void vote(int numOfNewVotes)
    {
        if(numOfNewVotes>=0 && numOfNewVotes<=10)
        {
            votes = votes + numOfNewVotes;
            judges = judges + 1;
        } 
        else 
        {
            String stringOfNewVotes= String.valueOf(numOfNewVotes);
            String printSentence = stringOfNewVotes + " is an illegal number of votes";
            System.out.println(printSentence);
        }
    }

    public String getDetails()
    {
        String sentence = name + " has " + votes + " votes from " + judges + " judges";
        return sentence;
    }

    public boolean positive()
    {
        if(judges > 0)
        {
            double doubleVotes = votes; 
            double doubleJudges = judges; 
            double averageVotes = doubleVotes/doubleJudges;
            if(averageVotes > 5)
            {
                return true;
            } 
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}
