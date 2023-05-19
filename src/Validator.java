import java.util.Objects;

public class Validator {

    private Validator() {
    }

    public static boolean validate(String login,
                                   String password,
                                   String confirmPassword) {
        try {
            check(login,password, confirmPassword);
            return true;

        } catch (WrongLoginException | WrongPasswordException e) {
            return false;
        }
    }
    public static void check(String login,
                             String password,
                             String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login == null || login.isEmpty() || login.length() > 20) {
            throw new WrongLoginException("Логин превышает 20 символов");
        }
        if (password == null ||  password.isEmpty() || password.length() >= 20) {
            throw new WrongPasswordException("Длина пароля должнва быть меньше 20");
        }
        if (!Objects.equals(password, confirmPassword)) {
            throw new WrongPasswordException("Пароли не должны совпадать");
        }
        Checker checker = new LoopChecker();
        checker.check(login, true);
        checker.check(password, false);
    }
}
