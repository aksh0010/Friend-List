public class MyFriends {

    public static void main(String[] args) {
        FriendsList list = new FriendsList(); // !! created an object of class list to store information

        Person p1 = new Person("4Aksh1", "1Patel", 8, 1, "2269754190"); // !! Created 4 different objects with little
                                                                        // !! difference in name such that
        Person p2 = new Person("3Aksh2", "2Patel", 2, 2, "2269754191"); // !! it can be clearly demonstrated for
                                                                        // !! sorting
        Person p3 = new Person("2Aksh3", "3Patel", 8, 10, "2269754192");
        Person p4 = new Person("1Aksh4", "4Patel", 4, 9, "2269754193");

        list.adding_to_myfriendsList(p1); // !! addding friends
        list.adding_to_myfriendsList(p2);
        list.adding_to_myfriendsList(p3);
        list.adding_to_myfriendsList(p4);

        list.sorting_friends_list_by_Firstname();// !! sorting and displaying the list of ALice's friends by their First
                                                 // !! name

        list.sorting_friends_list_by_lastname();// !! sorting and displaying the list of ALice's friends by their Last
                                                // !! name

        list.sorting_friends_list_by_monthBorn(8); // !! sorting and displaying the list of ALice's friends by month of
                                                   // !! birth

        list.sorting_friends_list_by_dayBorn();// !! sorting and displaying the list of ALice's friends by date of birth

        System.out.println("\n_________________________________________________\nTotal number of friends :"
                + list.number_of_friends()); // !! Displaying Alice's no. of
        // !! friends

        list.finding_cellnumber("4aksh1", "1patel"); // !! finding the cell number of a given name ignoring case
        list.delete_friends("3Aksh2", "2Patel"); // !! finding and removing the person from list ignoring case

        System.out.println("\n_________________________________________________\n\n\t\tBefore modifying the List ");
        for (Person p : list.getMyfriendsList()) {
            System.out.println(p);
        }
        list.modify_friends("4Aksh1", "1Patel", "Modified", "Element", 8, 5, "2269754199"); // !! modiying the friend's
        // !! detail

        System.out.println("\n\t\tAfter modifying the List ");
        for (Person p : list.getMyfriendsList()) {
            System.out.println(p);
        }
        System.out.println("\n\t Removing all elements with name 2Aksh 3 from the list and printing the list \n\n");
        list.remove_all_elements_with_firstname("2Aksh3");
        for (Person p : list.getMyfriendsList()) {
            System.out.println(p);
        }

    }
}
