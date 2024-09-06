package springDo.controllerDo.intput;

import org.springframework.stereotype.Component;

@Component("inPutImpl")
public class IntPutImpl implements IInPut {//用户输入对象
    private String userID;
    public String getUserID() {
        return userID;
    }
    public void setUserID(String userID) {
        this.userID = userID;
    }

    private String password;
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void updateUser(String userID,
                           String password) {//实现上传用户输入信息功能
        this.userID = userID;
        this.password = password;
        System.out.println("用户输入信息成功!\n" +
                "userID:" + this.userID + "\n" +
                "password:" + this.password);
    }


}
