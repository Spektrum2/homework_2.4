public class Main {
    public static void main(String[] args) {
        String login = "java_skyprogo";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";
        boolean check = checkLoginPassword(login, password, confirmPassword);
        System.out.println(check);
    }

    private static boolean checkLoginPassword(String login, String password, String confirmPassword) {
        boolean checkLatinLogin = login.matches("\\w+");
        boolean checkLatinPassword = password.matches("\\w+");
        boolean checkLengthLogin = login.length() > 20;
        boolean checkLengthPassword = password.length() < 20;
        boolean checkEqualPasswords = !password.equals(confirmPassword);
        boolean total = checkLatinLogin && checkLatinPassword && checkLengthPassword;
        try {
            if (checkLengthLogin) {
                throw new WrongLoginException();
            } else if (checkEqualPasswords) {
                throw new WrongPasswordException();
            }
            return total;
        } catch (WrongLoginException e) {
            System.out.println("Пароль превышает 20 символов");
            return false;
        } catch (WrongPasswordException e) {
            System.out.println("Пароли не совпадают");
            return false;
        } finally {
            System.out.println("Проверка завершена");
        }
    }

}