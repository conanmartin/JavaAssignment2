package a2_16201032;

/**
 * Created by conanmartin on 10/04/2017.
 */
public class Instructor extends Person{
    private String position;
    private Module module;

    public Instructor(Name name, Address address, String position) {
        super(name, address);
        this.position = position;

    }

    public void setModule (Module m) {
        this.module = m;
    }

@Override
    public String toString(){
        if (this.module == null){
            return  super.toString() + "\n" + "position: " + this.position + "\nmodule: not set\n";
        }
        else {
            return super.toString() + "\n" + "position: " + this.position + "\nmodule: " + this.module.getCode() + " (" + this.module.getTitle() + ")\n";
        }
}


}
