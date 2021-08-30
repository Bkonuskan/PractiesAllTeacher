package _12_Encapsulation.Ex3;

public class User {
    // 1- filedları id, username, password, active (boolean), signedIn (boolean)
    //    olan User isimli bir class tanımlayınız.
    // 2- bütün fieldları parametre alan bir constructor tanımlayınız.
    // 3- bütün fieldları için getter ve setter metodları oluşturunuz.
    // 4- UserMain isminde main için bir class oluşturunuz.
    // 5- Kullanicidan 2 adet user bilgisi isteyerek bir ArrayList e doldurunuz.
    //    active ve signedIn default olarak true, false atayabilirsiniz.
    //    id yi sistem otomatik versin.,
    // 6- eğer password 6 dan küçük olursa yeniden userı girsin.passwordun
    //    6 karakterden küçük olup olmadığını classın içinde kontrol ediniz.

    private int id;
    private String username;
    private String password;
    private boolean active;
    private boolean signedIn;

    private static int sayac = 101;

    public User(String username, String password) {
        setId();
        setUsername(username);
        setPassword(password);
        setActive(true);
        setSignedIn(false);


    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = sayac++;//sayacın o an için değeri atanır. sonrasında ++ sağda olduğu için sayac değeri 1 artar
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() < 6)
            throw new RuntimeException("password 6 karakterden az olamaz");
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}
