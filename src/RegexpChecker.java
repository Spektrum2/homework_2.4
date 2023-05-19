public class RegexpChecker implements Checker {
    @Override
    public void check(String s, boolean login) throws WrongLoginException, WrongPasswordException {
        if (!s.matches("^\\w{1,20}$")) {
            if (login) {
                throw new WrongLoginException("����� ������ ��������� � ���� ������ ��������� �����, ����� � ���� �������������");
            } else {
                throw new WrongPasswordException("������ ������ ��������� � ���� ������ ��������� �����, ����� � ���� �������������");
            }
        }
    }
}
