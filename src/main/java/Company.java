public class Company {
    private Person[] staff;

    public  Company(String[] people){
        staff = new Person[people.length];
        for(int i = 0; i< people.length; i++)
            staff[i] = new Person(people[i]);
    }

}
