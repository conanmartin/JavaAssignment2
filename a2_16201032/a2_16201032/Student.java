package a2_16201032;

import javax.print.DocFlavor;

/**
 * Created by conanmartin on 10/04/2017.
 */
public class Student extends Person {
    private String programme;
    final int MAX_NUMBER_MODULES = 12;
    private Module[] modules = new Module[MAX_NUMBER_MODULES];
    private int moduleCounter = 0;

    public Student(Name name, Address address, String programme) {
        super(name, address);
        this.programme = programme;
    }

    public boolean addModule (Module m) {
        if (this.moduleCounter < MAX_NUMBER_MODULES) {
            this.modules[this.moduleCounter] = m;
            this.moduleCounter++;
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        String modulesString = "\nmodules: ";
        if (this.moduleCounter == 0) {
            modulesString += "\n \t \tnone";
        }
            else{
                for (int i = 0; i < this.moduleCounter; i++) {
                    modulesString += "\n" + "\t \t" + this.modules[i].getCode() + " (" + this.modules[i].getTitle() + ")";


                }
            }
        return super.toString() + "\n" + "programme: " + this.programme + modulesString + "\n";
    }
}
