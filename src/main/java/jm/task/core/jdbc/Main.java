package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
//            Util.getConnection();
//            UserDao userDao = new UserDaoJDBCImpl();
//
//            userDao.createUsersTable();
//
//            userDao.saveUser("Name1", "LastName1", (byte) 20);
//            userDao.saveUser("Name2", "LastName2", (byte) 25);
//            userDao.saveUser("Name3", "LastName3", (byte) 31);
//            userDao.saveUser("Name4", "LastName4", (byte) 38);
//
//            userDao.removeUserById(1);
//            userDao.getAllUsers();
//            userDao.cleanUsersTable();
//            userDao.dropUsersTable();


            UserServiceImpl usi = new UserServiceImpl();

            usi.createUsersTable();

            usi.saveUser("Arthir", "Hayes", (byte) 38);
            usi.saveUser("Changpeng", "Zhao", (byte) 35);
            usi.saveUser("Michael", "Saylor", (byte) 41);
            usi.saveUser("Vitaly", "Buteri", (byte) 29);

            usi.removeUserById(4);
            usi.getAllUsers();
            usi.cleanUsersTable();
            usi.dropUsersTable();



    }
        // реализуйте алгоритм здесь
    }
