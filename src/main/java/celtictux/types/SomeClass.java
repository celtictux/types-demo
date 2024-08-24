package celtictux.types;

public class SomeClass {

    private String someString;

    public SomeClass(final String someStringParam) {
        this.someString = someStringParam;
    }

    public String getSomeString() {
        return someString;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof  SomeClass) {

            SomeClass bobObj = (SomeClass) obj;

            if (this.someString.equals(bobObj.getSomeString())) {
                return true;
            }
        }
        return false;
    }
}
