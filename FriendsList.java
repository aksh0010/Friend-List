import java.util.ArrayList;
import java.util.Collections;

public class FriendsList {
    ArrayList<Person> myfriendsList = new ArrayList<>();

    // !! default constructer below

    public FriendsList() {

    }
    // !! Adding objects to arrayList

    public void adding_to_myfriendsList(Person p) {
        this.myfriendsList.add(p);
    }
    // !! method for Sorting arraylist by last name of alice's friend

    public void sorting_friends_list_by_lastname() {
        System.out.println("\n \t --> Sorting Friends list by last name .... \n");
        ArrayList<String> temp_month = new ArrayList<>();

        for (Person tempPerson : myfriendsList) {

            temp_month.add(tempPerson.getLastName());
        }
        Collections.sort(temp_month);

        for (String templist : temp_month) {
            for (Person eachFriend : myfriendsList) {
                if (eachFriend.getLastName().equals(templist)) {
                    System.out.println(eachFriend);
                }
            }
        }

    }
    // !! method for Sorting arraylist by First name of alice's friend

    public void sorting_friends_list_by_Firstname() {
        System.out.println(" \n\t --> Sorting Friends list by First name .... \n");

        ArrayList<String> temp_Firstname = new ArrayList<>();

        for (Person tempPerson : myfriendsList) {

            temp_Firstname.add(tempPerson.getFirstName());
        }
        Collections.sort(temp_Firstname);

        for (String templist : temp_Firstname) {
            for (Person eachFriend : myfriendsList) {
                if (eachFriend.getFirstName().equals(templist)) {
                    System.out.println(eachFriend);
                }
            }
        }

    }
    // !! method for Sorting arraylist by dayborn

    public void sorting_friends_list_by_dayBorn() {
        System.out.println(" \n\t --> Sorting Friends list by birthdate  .... \n");

        ArrayList<Integer> temp_birthdayList = new ArrayList<>();

        for (Person each : myfriendsList) {

            temp_birthdayList.add(each.getBirthDay());

        }
        Collections.sort(temp_birthdayList);

        for (Integer templist : temp_birthdayList) {
            for (Person eachFriend : myfriendsList) {
                if (eachFriend.getBirthDay() == (templist)) {
                    System.out.println(eachFriend);
                }
            }
        }

    }
    // !! method for Sorting arraylist by dayborn in a respective month

    public void sorting_friends_list_by_monthBorn(int month) {
        System.out.println(" \n\t --> Sorting Friends list by birthdate in a respective month .... \n");

        ArrayList<Integer> temp_monthList = new ArrayList<>();

        for (Person each : myfriendsList) {
            if (each.getBirthMonth() == month) {
                temp_monthList.add(each.getBirthDay());
            }
        }
        Collections.sort(temp_monthList);

        for (Integer templist : temp_monthList) {
            for (Person eachFriend : myfriendsList) {
                if (eachFriend.getBirthDay() == (templist)) {
                    System.out.println(eachFriend);
                }
            }
        }

    }

    // !! method for calculating total number of Friends

    public int number_of_friends() {

        return myfriendsList.size();
    }
    // !! method for finding the cell number given First name and last name

    public void finding_cellnumber(String firstName, String Lastname) {

        for (Person eachperson : myfriendsList) {
            if (eachperson.getFirstName().equalsIgnoreCase(firstName)
                    && eachperson.getLastName().equalsIgnoreCase(Lastname)) {
                System.out.println("Cell number of " + firstName + " " + Lastname + " is :" + eachperson.getCellNum());
            }
        }
    }
    // !! method for removing a friend and updating the friends arraylist

    public void delete_friends(String firstName, String Lastname) {
        int count = 0;

        for (Person eachperson : this.myfriendsList) {
            if (eachperson.getFirstName().equalsIgnoreCase(firstName)
                    && eachperson.getLastName().equalsIgnoreCase(Lastname)) {

                this.myfriendsList.remove(count);
                System.out.println(firstName + " " + Lastname + " removed from list ");
                break;

            }
            count++;
        }
    }

    // !! method for modifying the friends arraylist
    public void modify_friends(String firstName, String Lastname, String newFirstname, String newlastname,
            int newBirthmonth, int newBirthday, String newCellnum) {
        int count = 0;
        for (Person eachperson : myfriendsList) {
            if (eachperson.getFirstName().equalsIgnoreCase(firstName)
                    && eachperson.getLastName().equalsIgnoreCase(Lastname)) {

                this.myfriendsList.remove(count);
                this.myfriendsList.add(count,
                        new Person(newFirstname, newlastname, newBirthmonth, newBirthday, newCellnum));
                break;

            }
            count++;

        }
    }

    public void remove_all_elements_with_firstname(String firstname) {
        for (Person each : myfriendsList) {
            if (each.getFirstName().equalsIgnoreCase(firstname)) {
                myfriendsList.remove(each);

            }
        }
    }

    // !! Getter and setter to have access to Arraylist of friends
    public ArrayList<Person> getMyfriendsList() {
        return myfriendsList;
    }

    public void setMyfriendsList(ArrayList<Person> myfriendsList) {
        this.myfriendsList = myfriendsList;
    }

}
