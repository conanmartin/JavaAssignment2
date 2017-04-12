/**
 * Created by conanmartin on 10/04/2017.
 */
package a2_16201032;

public class Person {
    private Name name;
    private Address address;

    public Person(Name name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Name getName() {
            return this.name;
    }

    @Override
    public String toString() {
        return "name: " + this.name + "\n" + "address: " + this.address;
    }


}
