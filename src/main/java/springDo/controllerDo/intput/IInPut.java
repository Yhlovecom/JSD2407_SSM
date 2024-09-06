package springDo.controllerDo.intput;

public interface IInPut {//用户输入接口
    void updateUser(String userID,
                           String password);//上传用户输入账号和密码

    String getUserID();

    String getPassword();

    void setUserID(String userID);

    void setPassword(String password);
}
