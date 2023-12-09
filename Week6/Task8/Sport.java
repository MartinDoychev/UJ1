import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class Sport {
    private String name;
    private int numberOfTeamMembers;

    public Sport() {
        this.name = "General Sport";
        this.numberOfTeamMembers = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfTeamMembers() {
        return numberOfTeamMembers;
    }

    public void setNumberOfTeamMembers(int numberOfTeamMembers) {
        this.numberOfTeamMembers = numberOfTeamMembers;
    }
}