package MybatisProject.src.model;

import java.util.Objects;

public class UserAccount {
    private String userid;
    private String password;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAccount that = (UserAccount) o;
        return Objects.equals(userid, that.userid) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, password);
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "userid='" + userid + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
