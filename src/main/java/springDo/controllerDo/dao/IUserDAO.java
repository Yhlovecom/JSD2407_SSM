package springDo.controllerDo.dao;


public interface IUserDAO {
    public boolean findUser(String userID,
                            String password);
}
