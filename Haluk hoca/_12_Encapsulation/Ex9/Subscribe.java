package _12_Encapsulation.Ex9;

class Subscribe {

    private String name;
    private boolean doYouWanaSubscribe;
    private String whichMember;

    public Subscribe(String name, boolean doYouWanaSubscribe, String whichMember) {
        setName(name);
        setDoYouWanaSubscribe(doYouWanaSubscribe);
        setWhichMember(whichMember);
    }

    public Subscribe() {
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public boolean getDoYouWanaSubscribe() {

        return doYouWanaSubscribe;
    }

    public void setDoYouWanaSubscribe(boolean doYouWanaSubscribe) {

        this.doYouWanaSubscribe = doYouWanaSubscribe;
    }

    public String getWhichMember() {
        return whichMember;
    }

    public void setWhichMember(String whichMember) {

        this.whichMember = whichMember;
    }
}
