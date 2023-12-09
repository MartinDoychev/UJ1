import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {
    private List<String> data;

    public PhoneBook() {
        this.data = new ArrayList<>();
    }

    public void insert(String name, String phoneNumber) {
        deleteByPhoneNumber(phoneNumber);
        data.add(name + "-" + phoneNumber);
    }

    public boolean deleteByPhoneNumber(String phoneNumber) {
        for (String entry : data) {
            if (entry.endsWith("-" + phoneNumber)) {
                data.remove(entry);
                return true;
            }
        }
        return false;
    }

    public List<String> getAllNamesStartingWith(String prefix) {
        List<String> result = new ArrayList<>();
        for (String entry : data) {
            String[] parts = entry.split("-");
            if (parts[0].startsWith(prefix)) {
                result.add(entry);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String entry : data) {
            result.append(entry).append("\n");
        }
        return result.toString();
    }
}

