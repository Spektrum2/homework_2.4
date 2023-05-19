public class Main {
    public static void main(String[] args) {
//        String login = "java_skyprogo";
//        String password = "D_1hWiKjjP_9";
//        String confirmPassword = "D_1hWiKjjP_9";
        boolean result = Validator.validate(
                "java_skyprogo",
                "D_1hWiKjj_9",
                "D_1hWiKjj_9");
        if (result) {
            System.out.println("Данные коректны");
        } else {
            System.out.println("Данные не коректны");
        }
    }

//    private static boolean checkLoginPassword(String login, String password, String confirmPassword) {
//        boolean checkLatinLogin = login.matches("\\w+");
//        boolean checkLatinPassword = password.matches("\\w+");
//        boolean checkLengthLogin = login.length() > 20;
//        boolean checkLengthPassword = password.length() < 20;
//        boolean checkEqualPasswords = !password.equals(confirmPassword);
//        boolean total = checkLatinLogin && checkLatinPassword && checkLengthPassword;
//        try {
//            if (checkLengthLogin) {
//                throw new WrongLoginException();
//            } else if (checkEqualPasswords) {
//                throw new WrongPasswordException();
//            }
//            return total;
//        } catch (WrongLoginException e) {
//            System.out.println("Логин превышает 20 символов");
//            return false;
//        } catch (WrongPasswordException e) {
//            System.out.println("Пароли не совпадают");
//            return false;
//        } finally {
//            System.out.println("Проверка завершена");
//        }
//    }

}